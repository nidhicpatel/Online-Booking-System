<%@page import="com.test.beans.Flight"%>
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
  <tr><th>Flight No</th>
    <th>Source</th>
    <th>Destination</th>
    <th>Date</th>
    <th>Time/<th>
  </tr>
	<%
		ArrayList<Flight> bookings = (ArrayList)request.getAttribute("Flights");
			Iterator<Flight> iterator = bookings.iterator();
			System.out.println(bookings.size());
			while(iterator.hasNext()){
			Flight Flight = iterator.next();
	%>
    <tr>
      <td><%= Flight.getVehicleNo() %></td>
      <td><%= Flight.getSource() %></td>
      <td><%= Flight.getDestination() %></td>
      <td><%= Flight.getDate() %></td>
      <td><%= Flight.getTime() %></td>
    </tr>
    <%
		}
    %>
	</tbody>
</table>
	
	</body>
	
</html>