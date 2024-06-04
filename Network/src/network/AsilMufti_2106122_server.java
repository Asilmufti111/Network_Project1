/* 
   name: Asil Asaad Mufti
   ID: 2106122
   section: VAR
 */

import java.io.*;
import static java.lang.Integer.parseInt;
import java.net.*;

class AsilMufti_2106122_server {

    public static void main(String argv[]) throws Exception {
        
        String clientEquation;
        String results;

        //create welcoming socket at port 1111
        ServerSocket welcomeSocket = new ServerSocket(1111);

        while (true) {
            //wait, on welcoming socket accept() method for client contact create, new socket on return
            Socket connectionSocket = welcomeSocket.accept();
            //create input stream, attached to socket
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            //create output stream, attached to socket
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            //read in line from socket to receives the equation from the client.
            clientEquation = inFromClient.readLine();
            //Send the result of the operation back to the client as text (string). 
            results = Integer.toString(findResult(clientEquation)) + '\n';
            outToClient.writeBytes(results);
            
        }
    }

    //method to find the result of the equation
    public static int findResult(String clientEquation) {
        
        int result = 0;
        //Parses the string to extract the two numbers and the operation
        String[] elements = clientEquation.split("\s");
        int operand1 = parseInt(elements[0]);
        String operation = elements[1];
        int operand2 = parseInt(elements[2]);

        //Performs the operation on the two numbers
        switch (operation) {
            case "+" ->
                result = operand1 + operand2;
            case "-" ->
                result = operand1 - operand2;
            case "/" ->
                result = operand1 / operand2;
            case "*" ->
                result = operand1 * operand2;

        }

        return result;
        
    }
}
