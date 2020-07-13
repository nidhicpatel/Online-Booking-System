create database project1;
create table busBookings(
id INTEGER AUTO_INCREMENT PRIMARY KEY,
bookingId varchar(100),
name varchar(100),
number varchar(100),
startCity varchar(100),
destinationCity varchar(100),
bookdate DATE
);

create table trainBookings(
id INTEGER AUTO_INCREMENT PRIMARY KEY,
bookingId varchar(100),
name varchar(100),
number varchar(100),
startCity varchar(100),
destinationCity varchar(100),
bookdate DATE
);

create table flightBookings(
id INTEGER AUTO_INCREMENT PRIMARY KEY,
bookingId varchar(100),
name varchar(100),
number varchar(100),
startCity varchar(100),
destinationCity varchar(100),
bookdate DATE
);

create table hotelBookings(
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  bookingId varchar(100),
  name varchar(100),
  number varchar(100),
  hotelName varchar(100),
  bookdate DATE,
  noOfRooms INTEGER,
  noOfDaysToStay INTEGER
);


  
  create table busDetails(
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  busNo INTEGER,
  startCity varchar(100),
  destinationCity varchar(100),
  busDate varchar(11),
  busTime varchar(10)
);
  
  insert into busDetails(busNo,startCity,destinationCity,busDate,busTime) values("2233","dehradun","shimla","2020-02-12","09:40PM");
  insert into busDetails(busNo,startCity,destinationCity,busDate,busTime) values("2234","dehradun","shimla","2020-02-13","09:40PM");
  insert into busDetails(busNo,startCity,destinationCity,busDate,busTime) values("2235","dehradun","shimla","2020-02-14","09:40PM");
  
 
  create table trainDetails(
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  trainNo INTEGER,
  startCity varchar(100),
  destinationCity varchar(100),
  trainDate varchar(11),
 trainTime varchar(10)
);
  
  insert into trainDetails(trainNo,startCity,destinationCity,trainDate,trainTime) values("2233","dehradun","shimla","2020-02-12","09:40PM");
  insert into trainDetails(trainNo,startCity,destinationCity,trainDate,trainTime) values("2234","dehradun","shimla","2020-02-13","09:40PM");
  insert into trainDetails(trainNo,startCity,destinationCity,trainDate,trainTime) values("2235","dehradun","shimla","2020-02-14","09:40PM");
  
  create table flightDetails(
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  flightNo INTEGER,
  startCity varchar(100),
  destinationCity varchar(100),
  flightDate varchar(11),
  flightTime varchar(10)
);
  
  insert into flightDetails(flightNo,startCity,destinationCity,flightDate,flightTime) values("2233","dehradun","shimla","2020-02-12","09:40PM");
  insert into flightDetails(flightNo,startCity,destinationCity,flightDate,flightTime) values("2234","dehradun","shimla","2020-02-13","09:40PM");
  insert into flightDetails(flightNo,startCity,destinationCity,flightDate,flightTime) values("2235","dehradun","shimla","2020-02-14","09:40PM");
  
  create table hotelDetails(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  hotelId INTEGER,
  hotelName varchar(100),
  hotelCIty varchar(100),
  hotelClass varchar(100),
  hotelCapacity INTEGER,
  hotelOwner varchar(100)
);
insert into hotelDetails(hotelId,hotelName,hotelCIty,hotelClass,hotelCapacity,hotelOwner) values(5668,"Maurya hotels","delhi","A3",200,"Mr Maurya");
insert into hotelDetails(hotelId,hotelName,hotelCIty,hotelClass,hotelCapacity,hotelOwner) values(5667,"Taj hotels","mumbai","A1",20000,"Mr Taj");
insert into hotelDetails(hotelId,hotelName,hotelCIty,hotelClass,hotelCapacity,hotelOwner) values(5665,"Oberoi hotels","mumbai","A1",2000,"Mr oberoi");

