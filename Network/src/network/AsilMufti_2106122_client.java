/* 
   name: Asil Asaad Mufti
   ID: 2106122
   section: VAR
 */

import java.io.*;
import java.net.*;

class AsilMufti_2106122_client {

    public static void main(String argv[]) throws Exception {

        String equation;
        String result;

        //create input stream
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        //create clientSocket object of type Socket, connect to server
        Socket clientSocket = new Socket("localhost", 1111);
        //create output stream attached to socket
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        //create input stream attached to socket
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        //Accepts input from a user 
        System.out.println("Enter an equation that contain two operands and an operation separated by a white space: ");
        equation = inFromUser.readLine();
        //Sends the entered string to the server
        outToServer.writeBytes(equation + '\n');
        //Receive the result of the arithmetic operation from the server
        result = inFromServer.readLine();
        //display the result on the client’s screen
        System.out.println("The result of the arithmetic operation is: " + result);
        //close the socket
        clientSocket.close();

    }
}
