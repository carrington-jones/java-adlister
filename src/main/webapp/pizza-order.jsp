<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
    <%@include file="/partials/head.jsp" %>
</head>
<body>
<h1>Pizza Order Page</h1>
<form method="POST" action="${pageContext.request.contextPath}/pizza-order">
    <div>
        <label for="crust">
            Crust
            <select id="crust" name="crust">
                <option value="thin">Thin Crust</option>
                <option value="hand-tossed">Hand Tossed Crust</option>
                <option value="garlic">Garlic Crust</option>
                <option value="detroit">Detroit Crust</option>
            </select>
        </label>
    </div>
    <div>
        <label for="sauce">
            Crust
            <select id="sauce" name="sauce">
                <option value="traditional">Traditional Sauce</option>
                <option value="BBQ">BBQ Sauce</option>
                <option value="alfredo">Alfredo Sauce</option>
                <option value="no-sauce">No Sauce</option>
            </select>
        </label>
    </div>
    <div>
        <label for="size">
            Crust
            <select id="size" name="size">
                <option value="10-inch">10-inch small</option>
                <option value="12-inch">12-inch medium</option>
                <option value="16-inch">16-inch large</option>
                <option value="20-inch">20-inch x-large</option>
            </select>
        </label>
    </div>

    <div class="btn-group" role="group" aria-label="Basic checkbox toggle button group">
        <input type="checkbox" class="btn-check" id="btncheck1" value="pepperoni" name="toppings" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck1">Pepperoni</label>

        <input type="checkbox" class="btn-check" id="btncheck2" value="jalapenos" name="toppings" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck2">Jalapenos</label>

        <input type="checkbox" class="btn-check" id="btncheck3" value="chicken" name="toppings" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck3">Chicken</label>

        <input type="checkbox" class="btn-check" id="btncheck4" value="mushrooms" name="toppings" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck4">Mushrooms</label>

        <input type="checkbox" class="btn-check" id="btncheck5" value="extra-cheese" name="toppings" autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck5">Extra Cheese</label>

        <input type="checkbox" class="btn-check" id="btncheck6" value="banana-peppers" name="toppings"
               autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck6">Banana Peppers</label>

        <input type="checkbox" class="btn-check" id="btncheck7" value="gross-pineapples" name="toppings"
               autocomplete="off">
        <label class="btn btn-outline-primary" for="btncheck7">Gross Pineapples</label>
    </div>
    <div>
        <label for="address">Delivery Address
            <input id="address" type="text" name="address">
        </label>
    </div>

    <div>
        <button type="submit">Submit</button>
    </div>
</form>
</body>
</html>
