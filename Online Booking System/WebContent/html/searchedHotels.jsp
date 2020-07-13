<%@page import="com.test.beans.Hotel"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<html>
	
	<head>
		
		<title>
		
		</title>
	
	<link rel="stylesheet" href="css/style1.css">
	<style>
		
	</style>
	</head>

	<body>
	
	<h1>Message: ${message}</h1>
<table>
  <tr>
  	<th>Hotel Id</th>
    <th>Hotel Name</th>
    <th>Hotel City</th>
    <th>Hotel Class</th>
    <th>Hotel Capacity</th>
    <th>Hotel Owner</th>
  </tr>
	<%
		ArrayList<Hotel> bookings = (ArrayList)request.getAttribute("hotels");
			Iterator<Hotel> iterator = bookings.iterator();
			System.out.println(bookings.size());
			while(iterator.hasNext()){
			Hotel hotel = iterator.next();
	%>
    <tr>
      <td><%= hotel.getHotelId() %></td>
      <td><%= hotel.getHotelName() %></td>
      <td><%= hotel.getHotelCity() %></td>
      <td><%= hotel.getHotelClass() %></td>
      <td><%= hotel.getHotelCapacity() %></td>
      <td><%= hotel.getHotelOwner() %></td>
    </tr>
    <%
		}
    %>
	</tbody>
</table>
	
	</body>
	
</html>