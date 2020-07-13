<%@page import="com.test.beans.Train"%>
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
  <tr><th>Train No</th>
    <th>Source</th>
    <th>Destination</th>
    <th>Date</th>
    <th>Time/<th>
  </tr>
	<%
		ArrayList<Train> bookings = (ArrayList)request.getAttribute("Trains");
			Iterator<Train> iterator = bookings.iterator();
			System.out.println(bookings.size());
			while(iterator.hasNext()){
			Train Train = iterator.next();
	%>
    <tr>
      <td><%= Train.getVehicleNo() %></td>
      <td><%= Train.getSource() %></td>
      <td><%= Train.getDestination() %></td>
      <td><%= Train.getDate() %></td>
      <td><%= Train.getTime() %></td>
    </tr>
    <%
		}
    %>
	</tbody>
</table>
	
	</body>
	
</html>