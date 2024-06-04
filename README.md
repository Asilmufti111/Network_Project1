The application that you are going to develop is based on the client-server architecture and its
purpose is to develop a simple server calculator. The operation of the application is as follows:
1. Program at the client-side does the following tasks:
a) Accepts input from a user in the form of a string containing two operands and an
operation, such as the following example: “5 + 6”.
b) Sends the entered string to the server using TCP sockets.
c) Receive the results of the arithmetic operation from the server and display it on the
client’s screen.

3. Program at the server-side does the following tasks:
a) Receives the string from the client.
b) Parses the string to extract the two numbers and the operation.
c) Performs the operation on the two numbers.
d) Send the result of the operation back to the client as text (string).
