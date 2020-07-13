<%@page import="com.test.beans.Bus"%>
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
  <tr><th>Bus No</th>
    <th>Source</th>
    <th>Destination</th>
    <th>Date</th>
    <th>Time/<th>
  </tr>
	<%
		ArrayList<Bus> bookings = (ArrayList)request.getAttribute("buses");
			Iterator<Bus> iterator = bookings.iterator();
			System.out.println(bookings.size());
			while(iterator.hasNext()){
			Bus bus = iterator.next();
	%>
    <tr>
      <td><%= bus.getVehicleNo() %></td>
      <td><%= bus.getSource() %></td>
      <td><%= bus.getDestination() %></td>
      <td><%= bus.getDate() %></td>
      <td><%= bus.getTime() %></td>
    </tr>
    <%
		}
    %>
	</tbody>
</table>
	
	</body>
	
</html>