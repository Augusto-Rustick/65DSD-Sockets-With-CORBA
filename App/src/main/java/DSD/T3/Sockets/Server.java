package DSD.T3.Sockets;

import DSD.T3.Service.DepartamentoService;
import DSD.T3.Service.FuncionarioService;
import DSD.T3.Service.TransportadorService;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
   private static Scanner scanner = new Scanner(System.in);
   private static List<FuncionarioService> funcionarios = new ArrayList<>();
   private static List<DepartamentoService> departamentos = new ArrayList<>();
   private static List<TransportadorService> transportadores = new ArrayList<>();

   public static void main(String[] args) {
      try {
         ORB orb = ORB.init(args, null);
         POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

         poa.the_POAManager().activate();

         DepartamentoService departamentoService = new DepartamentoService("Financeiro",
                 "Setor responsável pelas finanças da empresa", 5);
         FuncionarioService funcionarioService = new FuncionarioService("123456789", "João", "ruaa", "Financeiro", 15
         );
         TransportadorService transportadorService = new TransportadorService("987654321", "Maria", "maria@gmail.com", "45454");

         departamentos.add(departamentoService);
         funcionarios.add(funcionarioService);
         transportadores.add(transportadorService);

         while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Departamento");
            System.out.println("2 - Funcionário");
            System.out.println("3 - Cliente");
            System.out.println("4 - Exit");

            int opcaoEntidade = scanner.nextInt();

            if (opcaoEntidade == 4) {
               orb.shutdown(false);
               return;
            }

            System.out.println("Escolha uma ação:");
            System.out.println("1 - Listar todos");
            System.out.println("2 - Obter um específico");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");

            int opcaoAcao = scanner.nextInt();

            switch (opcaoEntidade) {
               case 1:
                  executarAcaoDepartamento(opcaoAcao);
                  break;
               case 2:
                  executarAcaoFuncionario(opcaoAcao);
                  break;
               case 3:
                  executarAcaoCliente(opcaoAcao);
                  break;
               default:
                  System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private static void executarAcaoDepartamento(int opcaoAcao) {
      switch (opcaoAcao) {
         case 1:
            listarDepartamentos();
            break;
         case 2:
            obterDepartamento();
            break;
         case 3:
            adicionarDepartamento();
            break;
         case 4:
            atualizarDepartamento();
            break;
         case 5:
            removerDepartamento();
            break;
         default:
            System.out.println("Opção inválida. Por favor, selecione novamente.");
      }
   }

   private static void executarAcaoFuncionario(int opcaoAcao) {
      switch (opcaoAcao) {
         case 1:
            listarFuncionarios();
            break;
         case 2:
            obterFuncionario();
            break;
         case 3:
            adicionarFuncionario();
            break;
         case 4:
            atualizarFuncionario();
            break;
         case 5:
            removerFuncionario();
            break;
         default:
            System.out.println("Opção inválida. Por favor, selecione novamente.");
      }
   }

   private static void executarAcaoCliente(int opcaoAcao) {
      switch (opcaoAcao) {
         case 1:
            listarTransportadores();
            break;
         case 2:
            obterTransportador();
            break;
         case 3:
            adicionarTransportador();
            break;
         case 4:
            atualizarTransportador();
            break;
         case 5:
            removerTransportador();
            break;
         default:
            System.out.println("Opção inválida. Por favor, selecione novamente.");
      }
   }

   private static void listarDepartamentos() {
      System.out.println("Departamentos:");
      for (DepartamentoService departamento : departamentos) {
         System.out.println("Nome: " + departamento.getNome());
         System.out.println("Produto: " + departamento.getProduto());
         System.out.println();
      }
   }

   private static void listarFuncionarios() {
      System.out.println("Funcionários:");
      for (FuncionarioService funcionario : funcionarios) {
         System.out.println("CPF: " + funcionario.cpf());
         System.out.println("Nome: " + funcionario.nome());
         System.out.println("Departamento: " + funcionario.departamento());
         System.out.println();
      }
   }

   private static void listarTransportadores() {
      System.out.println("Transportadores:");
      for (TransportadorService transportador : transportadores) {
         System.out.println("CPF: " + transportador.cpf());
         System.out.println("Nome: " + transportador.nome());
         System.out.println("Endereco: " + transportador.endereco());
         System.out.println();
      }
   }

   private static void obterDepartamento() {
      System.out.println("Digite o nome do departamento:");
      String nome = scanner.next();

      for (DepartamentoService departamento : departamentos) {
         if (departamento.getNome().equalsIgnoreCase(nome)) {
            System.out.println("Nome: " + departamento.getNome());
            System.out.println("Produto: " + departamento.getProduto());
            System.out.println();
            return;
         }
      }

      System.out.println("Departamento não encontrado.");
      System.out.println();
   }

   private static void obterFuncionario() {
      System.out.println("Digite o CPF do funcionário:");
      String cpf = scanner.next();

      for (FuncionarioService funcionario : funcionarios) {
         if (funcionario.cpf().equalsIgnoreCase(cpf)) {
            System.out.println("CPF: " + funcionario.cpf());
            System.out.println("Nome: " + funcionario.nome());
            System.out.println("Departamento: " + funcionario.departamento());
            System.out.println();
            return;
         }
      }

      System.out.println("Funcionário não encontrado.");
      System.out.println();
   }

   private static void obterTransportador() {
      System.out.println("Digite o CPF do transportador:");
      String cpf = scanner.next();

      for (TransportadorService transportador : transportadores) {
         if (transportador.cpf().equalsIgnoreCase(cpf)) {
            System.out.println("CPF: " + transportador.cpf());
            System.out.println("Nome: " + transportador.nome());
            System.out.println("Telefone: " + transportador.telefone());
            System.out.println();
            return;
         }
      }

      System.out.println("Cliente não encontrado.");
      System.out.println();
   }

   private static void adicionarDepartamento() {
      System.out.println("Digite o nome do departamento:");
      String nome = scanner.next();

      System.out.println("Digite a descrição do departamento:");
      String descricao = scanner.next();

      DepartamentoService departamento = new DepartamentoService(nome, descricao, 0);
      departamentos.add(departamento);

      System.out.println("Departamento adicionado com sucesso.");
      System.out.println();
   }

   private static void adicionarFuncionario() {
      System.out.println("Digite o CPF do funcionário:");
      String cpf = scanner.next();

      System.out.println("Digite o nome do funcionário:");
      String nome = scanner.next();

      System.out.println("Digite o endereço do funcionário:");
      String endereco = scanner.next();

      System.out.println("Digite o departamento do funcionário:");
      String departamento = scanner.next();

      FuncionarioService funcionario = new FuncionarioService(cpf, nome, endereco, departamento, 0);
      funcionarios.add(funcionario);

      System.out.println("Funcionário adicionado com sucesso.");
      System.out.println();
   }

   private static void adicionarTransportador() {
      System.out.println("Digite o CPF do transportador:");
      String cpf = scanner.next();

      System.out.println("Digite o nome do transportador:");
      String nome = scanner.next();

      System.out.println("Digite o endereco do transportador:");
      String endereco = scanner.next();

      System.out.println("Digite o telefone do transportador:");
      String telefone = scanner.next();

      TransportadorService cliente = new TransportadorService(cpf, nome, endereco, telefone);
      transportadores.add(cliente);

      System.out.println("transportador adicionado com sucesso.");
      System.out.println();
   }

   private static void atualizarDepartamento() {
      System.out.println("Digite o nome do departamento a ser atualizado:");
      String nome = scanner.next();

      for (DepartamentoService departamento : departamentos) {
         if (departamento.getNome().equalsIgnoreCase(nome)) {
            System.out.println("Digite o novo produto do departamento:");
            String produto = scanner.next();

            departamento.setProduto(produto);

            System.out.println("Departamento atualizado com sucesso.");
            System.out.println();
            return;
         }
      }

      System.out.println("Departamento não encontrado.");
      System.out.println();
   }

   private static void atualizarFuncionario() {
      System.out.println("Digite o CPF do funcionário a ser atualizado:");
      String cpf = scanner.next();

      for (FuncionarioService funcionario : funcionarios) {
         if (funcionario.cpf().equalsIgnoreCase(cpf)) {
            System.out.println("Digite o novo nome do funcionário:");
            String novoNome = scanner.next();

            System.out.println("Digite o novo departamento do funcionário:");
            int novoDepartamento = scanner.nextInt();

            funcionario.nome(novoNome);
            funcionario.departamento(novoDepartamento);

            System.out.println("Funcionário atualizado com sucesso.");
            System.out.println();
            return;
         }
      }

      System.out.println("Funcionário não encontrado.");
      System.out.println();
   }

   private static void atualizarTransportador() {
      System.out.println("Digite o CPF do cliente a ser atualizado:");
      String cpf = scanner.next();

      for (TransportadorService transportador : transportadores) {
         if (transportador.cpf().equalsIgnoreCase(cpf)) {
            System.out.println("Digite o novo nome do transportador:");
            String novoNome = scanner.next();

            System.out.println("Digite o novo endereco do transportador:");
            String novoEndereco = scanner.next();

            transportador.nome(novoNome);
            transportador.endereco(novoEndereco);

            System.out.println("transportador atualizado com sucesso.");
            System.out.println();
            return;
         }
      }

      System.out.println("Cliente não encontrado.");
      System.out.println();
   }

   private static void removerDepartamento() {
      System.out.println("Digite o nome do departamento a ser removido:");
      String nome = scanner.next();

      for (DepartamentoService departamento : departamentos) {
         if (departamento.getNome().equalsIgnoreCase(nome)) {
            departamentos.remove(departamento);

            System.out.println("Departamento removido com sucesso.");
            System.out.println();
            return;
         }
      }

      System.out.println("Departamento não encontrado.");
      System.out.println();
   }

   private static void removerFuncionario() {
      System.out.println("Digite o CPF do funcionário a ser removido:");
      String cpf = scanner.next();

      for (FuncionarioService funcionario : funcionarios) {
         if (funcionario.cpf().equalsIgnoreCase(cpf)) {
            funcionarios.remove(funcionario);

            System.out.println("Funcionário removido com sucesso.");
            System.out.println();
            return;
         }
      }

      System.out.println("Funcionário não encontrado.");
      System.out.println();
   }

   private static void removerTransportador() {
      System.out.println("Digite o CPF do cliente a ser removido:");
      String cpf = scanner.next();

      for (TransportadorService transportador : transportadores) {
         if (transportador.cpf().equalsIgnoreCase(cpf)) {
            transportadores.remove(transportador);

            System.out.println("transportador removido com sucesso.");
            System.out.println();
            return;
         }
      }

      System.out.println("Cliente não encontrado.");
      System.out.println();
   }
}
