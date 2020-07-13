<%@page import="com.test.beans.BusBooking"%>
<html>
	
	<head>
		<title>
		
		Booking Details
		</title>
	<link rel="stylesheet" href="css/style.css">
	</head>
	
	
	<body>
	<h1>Message: ${message}</h1>
	<%
		BusBooking booking = (BusBooking)request.getAttribute("bookingDetails");
	%>
	<div id="register">
  <div id="ticket">
    <h1>Thank You!</h1>
    <table>
      
      <tbody id="entries">
      </tbody>
      <tfoot>
        <tr>
          <th>Booking Id:</th>
          <th id="total"><%= booking.getBookingId() %></th>
        </tr>
        <tr>
          <th>Name</th>
          <th id="total"><%= booking.getTravellerName() %></th>
        </tr>
        <tr>
          <th>Phone Number</th>
          <th id="total"><%= booking.getPhoneNumber() %></th>
        </tr>
        <tr>
          <th>Source</th>
          <th id="total"><%= booking.getSource() %></th>
        </tr>
        <tr>
          <th>Destination</th>
          <th id="total"><%= booking.getDestination()%></th>
        </tr>
        <tr>
          <th>Date</th>
          <th id="total"><%=booking.getDate() %></th>
        </tr>        
      </tfoot>
    </table>
  </div>
</div>
<br><br>
	
	</body>
</html>