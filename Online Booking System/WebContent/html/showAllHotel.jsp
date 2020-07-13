<%@page import="com.test.beans.HotelBooking"%>
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
  <tr><th>Name</th>
    <th>Number</th>
    <th>Booking Id</th>
    <th>Hotel Name</th>
    <th>Booking Date</th>
    <th>No of rooms</th>
    <th>No of Days to stay</th>
  </tr>
	<%
		ArrayList<HotelBooking> bookings = (ArrayList)request.getAttribute("results");
			Iterator<HotelBooking> iterator = bookings.iterator();
			System.out.println(bookings.size());
			while(iterator.hasNext()){
			HotelBooking booking = iterator.next();
	%>
    <tr>
      <td><%= booking.getName() %></td>
      <td><%= booking.getNumber() %></td>
      <td><%= booking.getBookingId() %></td>
      <td><%= booking.getHotelName() %></td>
      <td><%= booking.getBookDate() %></td>
      <td><%= booking.getNoOfRooms() %></td>
      <td><%= booking.getNoOfDaysToStay() %></td>
    </tr>
    <%
		}
    %>
	</tbody>
</table>
	
	</body>
	
</html>