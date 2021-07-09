import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while(rs.next()){
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
        } catch(SQLException e){
            throw new RuntimeException("Error retrieving all ads");
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long newAdID = 0;
        try {
            Statement statement = connection.createStatement();
            String adInsertQuery = "INSERT INTO ads (user_id, title, description) " +
                    "VALUES(" + ad.getUserId() + ",'" + ad.getTitle() + "','" + ad.getDescription() + "')";
            statement.executeUpdate(adInsertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rsKeys = statement.getGeneratedKeys();
            if(rsKeys.next()){
            newAdID = rsKeys.getLong(1);
        }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return newAdID;
    }
}
