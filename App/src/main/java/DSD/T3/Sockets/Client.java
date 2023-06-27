package DSD.T3.Sockets;


import DSD.T3.Entity.Departamento;
import DSD.T3.Entity.DepartamentoHelper;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

public class Client {

   public static void main(String args[]) {
      try {
         // Crie e inicialize o ORB
         ORB orb = ORB.init(args, null);

         // Obtenha uma referência para o serviço de nomes
         Object objRef = orb.resolve_initial_references("NameService");
         NamingContext namingContext = NamingContextHelper.narrow(objRef);

         // Crie um array de NameComponent contendo o nome associado ao objeto
         NameComponent[] name = { new NameComponent("Departamento", "") };

         // Realize o lookup para obter a referência do objeto
         Object obj = namingContext.resolve(name);

         // Realize o narrow da referência para a interface Departamento
         Departamento departamentoRef = DepartamentoHelper.narrow(obj);

         // Use os métodos da interface Departamento
         departamentoRef.setProduto("Produto A");
         departamentoRef.setQuantidadeEstoque(10);

         // Exemplo de uso dos demais métodos
         System.out.println("Nome do departamento: " + departamentoRef.getNome());
         System.out.println("Produto do departamento: " + departamentoRef.getProduto());
         System.out.println("Quantidade de estoque do departamento: " + departamentoRef.getQuantidadeEstoque());
      } catch (Exception e) {
         System.err.println("ERROR: " + e);
         e.printStackTrace(System.out);
      }
   }
}
