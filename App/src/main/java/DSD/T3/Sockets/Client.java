package DSD.T3.Sockets;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import java.io.*;

public class Client {
   private static InputStream in;
   private static OutputStream out;
   private final byte[] data = new byte[1024];

   public static void main(String args[]) throws InvalidName {
      try {
         // Inicializa o ORB
         ORB orb = ORB.init(args, null);

         // Obtém a referência para o serviço de nomes
         Object objRef = orb.resolve_initial_references("NameService");
         NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

         BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

         // Loop para interagir com o servidor
         while (true) {
            // Recebe a mensagem do servidor
            String message = String.valueOf(in.read());
            System.out.println(message);

            // Aguarda a escolha do cliente
            String chosenOption = consoleInput.readLine();

            if (chosenOption.equalsIgnoreCase("exit")) {
               System.out.println("Cliente desconectado.");
               break;
            }

            // Envia a escolha do cliente para o servidor
            out.write(chosenOption.getBytes());

            // Recebe a resposta do servidor
            String response = String.valueOf(in.read());
            System.out.println(response);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
