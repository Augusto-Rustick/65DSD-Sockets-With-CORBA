package DSD.T3.Sockets;


import DSD.T3.Entity.Departamento;
import DSD.T3.Entity.DepartamentoHelper;
import DSD.T3.Entity.DepartamentoImpl;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class Server {

   public static void main(String args[]) {
      try {
         // Crie e inicialize o ORB
         ORB orb = ORB.init(args, null);

         // Obtenha uma referência para o RootPOA e ative o POAManager
         POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
         rootPOA.the_POAManager().activate();

         // Crie uma instância do DepartamentoImpl
         DepartamentoImpl departamentoImpl = new DepartamentoImpl();

         // Obtém uma referência do objeto a partir do DepartamentoImpl
         Object ref = rootPOA.servant_to_reference(departamentoImpl);

         // Realize o downcast da referência para a interface Departamento
         Departamento departamentoRef = DepartamentoHelper.narrow(ref);

         // Obtenha uma referência para o serviço de nomes
         Object objRef = orb.resolve_initial_references("NameService");
         NamingContext namingContext = NamingContextHelper.narrow(objRef);

         // Crie um array de NameComponent contendo o nome a ser associado ao objeto
         NameComponent[] name = { new NameComponent("Departamento", "") };

         // Realize o bind entre o nome e a referência do objeto
         namingContext.rebind(name, departamentoRef);

         System.out.println("Servidor pronto e aguardando chamadas...");

         // Aguarde as chamadas dos clientes
         orb.run();
      } catch (Exception e) {
         System.err.println("ERROR: " + e);
         e.printStackTrace(System.out);
      }
   }
}
