import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album album1 = new Album(1, "Bon Jovi", "Slippery When Wet", 1986, 28.0,"Hard Rock");
        Album album2 = new Album(2, "Mariah Carey", "Music Box", 1993,28.00, "Pop");
        Album album3 = new Album(3, "Linkin Park", "Hybrid Theory",2000,27.00,"Hard Rock");

        Author WilliamShakespeare = new Author();
        WilliamShakespeare.setId(1);
        WilliamShakespeare.setFirstName("William");
        WilliamShakespeare.setLastName("Shakespeare");

        Author ErnestHemingway = new Author();
        ErnestHemingway.setId(2);
        ErnestHemingway.setFirstName("Ernest");
        ErnestHemingway.setLastName("Hemingway");

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setAuthor(WilliamShakespeare);
        quote1.setContent("All that glitters is not gold");

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setAuthor(ErnestHemingway);
        quote2.setContent("Happiness in intelligent people is the rarest thing I know.");

        Quote quote3 = new Quote();
        quote3.setId(3);
        quote3.setAuthor(WilliamShakespeare);
        quote3.setContent("To be or not to be that is the question");

        ArrayList<Quote> quotes = new ArrayList<>();

        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for(Quote quote : quotes){
            if(quote.getAuthor().getFirstName().equalsIgnoreCase("William"))
                System.out.println(quote.getContent() + " By " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
        }
    }
}
