<%@page import="com.test.beans.HotelBooking"%>
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
		HotelBooking booking = (HotelBooking)request.getAttribute("bookingDetails");
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
          <th id="total"><%= booking.getName() %></th>
        </tr>
        <tr>
          <th>Phone Number</th>
          <th id="total"><%= booking.getNumber() %></th>
        </tr>
        <tr>
          <th>Hotel Name</th>
          <th id="total"><%= booking.getHotelName() %></th>
        </tr>
        <tr>
          <th>Date</th>
          <th id="total"><%=booking.getBookDate() %></th>
        </tr>    
            
        <tr>
          <th>No of rooms</th>
          <th id="total"><%= booking.getNoOfRooms() %></th>
        </tr>
        
        <tr>
          <th>No of days to stay</th>
          <th id="total"><%= booking.getNoOfDaysToStay() %></th>
        </tr>
      </tfoot>
    </table>
  </div>
</div>
<br><br>
	
	</body>
</html>