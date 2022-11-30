# HotelRoomBooking-SpringBootApp
 MicroService NCU 2022 Course - Mini Project 2

### HOW TO RUN
1. Download the code or clone the repo
2. open project in spring suite and update the project.
3. Start the database server and perform config according to db in **application.propertites** file
4. start all four services 
6. use API testing tool.

### TECHNOLOGY USED
1. SpringBoot
2. MySQL as database
3. Eureka for service registry

### APPLICATION FLOW
![Untitled Diagram drawio](https://user-images.githubusercontent.com/108087172/204868260-d9955b89-964d-4654-a76e-33ff0f8741f0.png)

### ENDPOINTS

1. path = "/booking/initiate"
   Request Body : { toDate,fromDate,aadharNumber,numOfRooms }
   Response Body : { generatedBookingId, ListOfRooms }

2. path = "/booking/confirm?bookingId=<generatedBookingId>"
   Request Body : { paymentMode, upi/card }
   Response Body : { BookingDetails }
   
3. path = "/payment/initiate"
   used by booking service 
   Request Body : { paymentDetails }
   Response Body : { transactionId }
   
4. path = "/booking/cancel?bookingId=<generatedBookingId>"
   Delete the saved booking info

### SCREENSHOTS 

<img width="1440" alt="Screenshot 2022-11-30 at 10 24 40 PM" src="https://user-images.githubusercontent.com/108087172/204868343-ba79783e-e993-44c8-92bf-6dca623cae35.png">

<img width="1025" alt="Screenshot 2022-11-30 at 10 26 20 PM" src="https://user-images.githubusercontent.com/108087172/204868380-5358b1fc-c9b5-4aa8-ad43-4c7c0b03c6dc.png">

<img width="1025" alt="Screenshot 2022-11-30 at 10 26 42 PM" src="https://user-images.githubusercontent.com/108087172/204868397-fb76921c-1f75-43be-9ee3-78235b659822.png">


