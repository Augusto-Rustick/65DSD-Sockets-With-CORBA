package DSD.T3.Sockets;

import DSD.T3.Entity.*;
import DSD.T3.Service.DepartamentoService;
import DSD.T3.Service.FuncionarioService;
import DSD.T3.Service.TransportadorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {

   public static void main(String args[]) {
      try {
         List<DepartamentoService> departamentos = new ArrayList<>();
         List<FuncionarioService> funcionarios = new ArrayList<>();
         List<TransportadorService> transportador = new ArrayList<>();

         Scanner scanner = new Scanner(System.in);

         while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Departamento");
            System.out.println("2 - Funcionário");
            System.out.println("3 - Cliente");
            System.out.println("4 - Exit");

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 4) {
               System.out.println("Servidor desconectado.");
               break;
            }
            switch (option) {
               case 1:
                  handleDepartamentoService(scanner, departamentos);
                  break;
               case 2:
                  handleFuncionarioService(scanner, funcionarios);
                  break;
               case 3:
                  handleTransportadorService(scanner, transportador);
                  break;
               default:
                  System.out.println("Opção inválida.");
                  break;
            }
         }
      } catch (Exception e) {
         System.err.println("ERROR: " + e);
         e.printStackTrace(System.out);
      }
   }

   private static void handleDepartamentoService(Scanner scanner, List<DepartamentoService> departamentos) {
      System.out.println("Departamento - Escolha uma opção:");
      System.out.println("1 - Criar");
      System.out.println("2 - Remover");
      System.out.println("3 - Atualizar");
      System.out.println("4 - Listar");

      int option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
         case 1:
            System.out.println("Digite o nome do departamento:");
            String nome = scanner.nextLine();
            System.out.println("Digite o produto do departamento:");
            String produto = scanner.nextLine();
            System.out.println("Digite a quantidade de estoque do departamento:");
            int quantidadeEstoque = scanner.nextInt();
            scanner.nextLine();

            DepartamentoService departamento = new DepartamentoService(nome, produto, quantidadeEstoque);
            departamentos.add(departamento);
            System.out.println("Departamento criado com sucesso.");
            break;
         case 2:
            // Remover um departamento
            System.out.println("Digite o nome do departamento a ser removido:");
            String nomeRemover = scanner.nextLine();

            boolean departamentoRemovido = departamentos.removeIf(d -> d.getNome().equals(nomeRemover));
            if (departamentoRemovido) {
               System.out.println("Departamento removido com sucesso.");
            } else {
               System.out.println("Departamento não encontrado.");
            }
            break;
         case 3:
            System.out.println("Digite o nome do departamento a ser atualizado:");
            String nomeAtualizar = scanner.nextLine();

            DepartamentoService departamentoAtualizar = departamentos.stream()
                    .filter(d -> d.getNome().equals(nomeAtualizar))
                    .findFirst()
                    .orElse(null);

            if (departamentoAtualizar != null) {
               System.out.println("Digite o novo produto do departamento:");
               String novoProduto = scanner.nextLine();
               System.out.println("Digite a nova quantidade de estoque do departamento:");
               int novaQuantidadeEstoque = scanner.nextInt();
               scanner.nextLine();

               departamentoAtualizar.setProduto(novoProduto);
               departamentoAtualizar.setQuantidadeEstoque(novaQuantidadeEstoque);
               System.out.println("Departamento atualizado com sucesso.");
            } else {
               System.out.println("Departamento não encontrado.");
            }
            break;
         case 4:
            System.out.println("Departamentos:");

            for (DepartamentoService d : departamentos) {
               System.out.println("Nome: " + d.getNome());
               System.out.println("Produto: " + d.getProduto());
               System.out.println("Quantidade de Estoque: " + d.getQuantidadeEstoque());
               System.out.println("-----------------------------");
            }

            break;
         default:
            System.out.println("Opção inválida.");
            break;
      }
   }

   private static void handleFuncionarioService(Scanner scanner, List<FuncionarioService> funcionarios) {
      System.out.println("Funcionário - Escolha uma opção:");
      System.out.println("1 - Criar");
      System.out.println("2 - Remover");
      System.out.println("3 - Atualizar");
      System.out.println("4 - Listar");

      int option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
         case 1:
            System.out.println("Digite o CPF do funcionário:");
            String cpf = scanner.nextLine();
            System.out.println("Digite o nome do funcionário:");
            String nome = scanner.nextLine();
            System.out.println("Digite o endereço do funcionário:");
            String endereco = scanner.nextLine();
            System.out.println("Digite o CTPS do funcionário:");
            String ctps = scanner.nextLine();
            System.out.println("Digite a quantidade de vendas do funcionário:");
            int quantidadeVendas = scanner.nextInt();
            scanner.nextLine();

            FuncionarioService funcionario = new FuncionarioService(cpf, nome, endereco, ctps, quantidadeVendas);
            funcionarios.add(funcionario);
            System.out.println("Funcionário criado com sucesso.");
            break;
         case 2:
            System.out.println("Digite o CPF do funcionário a ser removido:");
            String cpfRemover = scanner.nextLine();

            boolean funcionarioRemovido = funcionarios.removeIf(f -> f.cpf().equals(cpfRemover));
            if (funcionarioRemovido) {
               System.out.println("Funcionário removido com sucesso.");
            } else {
               System.out.println("Funcionário não encontrado.");
            }
            break;
         case 3:
            System.out.println("Digite o CPF do funcionário a ser atualizado:");
            String cpfAtualizar = scanner.nextLine();

            FuncionarioService funcionarioAtualizar = funcionarios.stream()
                    .filter(f -> f.cpf().equals(cpfAtualizar))
                    .findFirst()
                    .orElse(null);

            if (funcionarioAtualizar != null) {
               System.out.println("Digite o novo nome do funcionário:");
               String novoNome = scanner.nextLine();
               System.out.println("Digite o novo endereço do funcionário:");
               String novoEndereco = scanner.nextLine();
               System.out.println("Digite o novo CTPS do funcionário:");
               String novoCtps = scanner.nextLine();
               System.out.println("Digite a nova quantidade de vendas do funcionário:");
               int novaQuantidadeVendas = scanner.nextInt();
               scanner.nextLine();

               funcionarioAtualizar.nome(novoNome);
               funcionarioAtualizar.endereco(novoEndereco);
               funcionarioAtualizar.ctps(novoCtps);
               funcionarioAtualizar.quantidadeVendas(novaQuantidadeVendas);
               System.out.println("Funcionário atualizado com sucesso.");
            } else {
               System.out.println("Funcionário não encontrado.");
            }
            break;
         case 4:
            System.out.println("Funcionários:");

            for (FuncionarioService f : funcionarios) {
               System.out.println("CPF: " + f.cpf());
               System.out.println("Nome: " + f.nome());
               System.out.println("Endereço: " + f.endereco());
               System.out.println("CTPS: " + f.ctps());
               System.out.println("Quantidade de Vendas: " + f.quantidadeVendas());
               System.out.println("-----------------------------");
            }

            break;
         default:
            System.out.println("Opção inválida.");
            break;
      }
   }

   private static void handleTransportadorService(Scanner scanner, List<TransportadorService> transportadores) {
      System.out.println("transportador - Escolha uma opção:");
      System.out.println("1 - Criar");
      System.out.println("2 - Remover");
      System.out.println("3 - Atualizar");
      System.out.println("4 - Listar");

      int option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
         case 1:
            System.out.println("Digite o CPF do transportador:");
            String cpf = scanner.nextLine();
            System.out.println("Digite o nome do transportador:");
            String nome = scanner.nextLine();
            System.out.println("Digite o endereço do transportador:");
            String endereco = scanner.nextLine();
            System.out.println("Digite o telefone do transportador:");
            String telefone = scanner.nextLine();

            TransportadorService transportador = new TransportadorService(cpf, nome, endereco, telefone);
            transportadores.add(transportador);
            System.out.println("Transportadores criado com sucesso.");
            break;
         case 2:
            System.out.println("Digite o CPF do transportador a ser removido:");
            String cpfRemover = scanner.nextLine();

            boolean transportadorRemovido = transportadores.removeIf(c -> c.cpf().equals(cpfRemover));
            if (transportadorRemovido) {
               System.out.println("transportador removido com sucesso.");
            } else {
               System.out.println("transportador não encontrado.");
            }
            break;
         case 3:
            System.out.println("Digite o CPF do transportador a ser atualizado:");
            String cpfAtualizar = scanner.nextLine();

            TransportadorService transportadorAtualizar = transportadores.stream()
                    .filter(c -> c.cpf().equals(cpfAtualizar))
                    .findFirst()
                    .orElse(null);

            if (transportadorAtualizar != null) {
               System.out.println("Digite o novo nome do transportador:");
               String novoNome = scanner.nextLine();
               System.out.println("Digite o novo endereço do transportador:");
               String novoEndereco = scanner.nextLine();
               System.out.println("Digite o novo telefone do transportador:");
               String novoTelefone = scanner.nextLine();
               scanner.nextLine();

               transportadorAtualizar.nome(novoNome);
               transportadorAtualizar.endereco(novoEndereco);
               transportadorAtualizar.telefone(novoTelefone);
               System.out.println("transportador atualizado com sucesso.");
            } else {
               System.out.println("transportador não encontrado.");
            }
            break;
         case 4:
            System.out.println("transportador:");

            for (TransportadorService t : transportadores) {
               System.out.println("CPF: " + t.cpf());
               System.out.println("Nome: " + t.nome());
               System.out.println("Endereço: " + t.endereco());
               System.out.println("Telefone: " + t.telefone());
               System.out.println("-----------------------------");
            }

            break;
         default:
            System.out.println("Opção inválida.");
            break;
      }
   }
}
