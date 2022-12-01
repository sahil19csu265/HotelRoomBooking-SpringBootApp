# HotelRoomBooking-SpringBootApp
 MicroService NCU 2022 Course - Mini Project 2

### HOW TO RUN
1. Download the code or clone the repo
2. open projects in spring suite and update the project.
3. Start the database server and perform config according to db in **application.propertites** file of Booking & Payment Service
4. start all four services 
5. Refer to application.properties file of Discovery and ApiGateway Service for other meta data of the project.
6. use API testing tool.

### TECHNOLOGY USED
1. SpringBoot
2. MySQL as database
3. Eureka for service registry

### APPLICATION FLOW
![Untitled Diagram drawio](https://user-images.githubusercontent.com/108087172/204868260-d9955b89-964d-4654-a76e-33ff0f8741f0.png)

### ENDPOINTS

1. path = "/booking/initiate"<br>
    Request Body : { toDate,fromDate,aadharNumber,numOfRooms }<br>
    Response Body : { generatedBookingId, ListOfRooms }

2. path = "/booking/confirm?bookingId=<generatedBookingId>"<br>
    Request Body : { paymentMode, upi/card }<br>
    Response Body : { BookingDetails }<br>
   
3. path = "/payment/initiate"<br>
    used by booking service <br>
    Request Body : { paymentDetails }<br>
    Response Body : { transactionId }<br>
   
4. path = "/booking/cancel?bookingId=<generatedBookingId>"<br>
    Delete the saved booking info<br>

### SCREENSHOTS 

<img width="1440" alt="Screenshot 2022-11-30 at 10 24 40 PM" src="https://user-images.githubusercontent.com/108087172/204868343-ba79783e-e993-44c8-92bf-6dca623cae35.png">
------------------------------------------------------------------------------------------------------------------

<img width="1025" alt="Screenshot 2022-11-30 at 10 26 20 PM" src="https://user-images.githubusercontent.com/108087172/204868380-5358b1fc-c9b5-4aa8-ad43-4c7c0b03c6dc.png">
------------------------------------------------------------------------------------------------------------------

<img width="1025" alt="Screenshot 2022-11-30 at 10 26 42 PM" src="https://user-images.githubusercontent.com/108087172/204868397-fb76921c-1f75-43be-9ee3-78235b659822.png">



