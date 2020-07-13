<%@page import="com.test.beans.FlightBooking"%>
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
    <th>Source</th>
    <th>Destination</th>
    <th>Date</th>
    <th>Booking Id</th>
  </tr>
	<%
		ArrayList<FlightBooking> bookings = (ArrayList)request.getAttribute("results");
			Iterator<FlightBooking> iterator = bookings.iterator();
			System.out.println(bookings.size());
			while(iterator.hasNext()){
			FlightBooking booking = iterator.next();
	%>
    <tr>
      <td><%= booking.getTravellerName() %></td>
      <td><%= booking.getPhoneNumber() %></td>
      <td><%= booking.getSource() %></td>
      <td><%= booking.getDestination() %></td>
      <td><%= booking.getDate() %></td>
      <td><%= booking.getBookingId() %></td>
    </tr>
    <%
		}
    %>
	</tbody>
</table>
	
	</body>
	
</html>