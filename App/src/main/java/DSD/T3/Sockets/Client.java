package DSD.T3.Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

   public static void main(String args[]) {
      try {
         // Conecta ao servidor na porta 9000
         Socket socket = new Socket("localhost", 9000);

         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

         BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

         // Loop para interagir com o servidor
         while (true) {
            // Recebe a lista de serviços do servidor
            String services = in.readLine();
            System.out.println("Serviços disponíveis:");
            System.out.println(services);

            // Aguarda a escolha do serviço pelo cliente
            String chosenService = consoleInput.readLine();
            out.println(chosenService);

            if (chosenService.equalsIgnoreCase("exit")) {
               System.out.println("Cliente desconectado.");
               break;
            }

            // Loop para interagir com o serviço escolhido
            while (true) {
               // Recebe a lista de operações do serviço
               String operations = in.readLine();
               System.out.println("Operações disponíveis:");
               System.out.println(operations);

               // Aguarda a escolha da operação pelo cliente
               String chosenOperation = consoleInput.readLine();
               out.println(chosenOperation);

               if (chosenOperation.equalsIgnoreCase("exit")) {
                  System.out.println("Retornando para seleção de serviço.");
                  break;
               }

               // Executa a operação selecionada
               String response = in.readLine();
               System.out.println(response);
            }
         }

         // Fecha a conexão
         socket.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
