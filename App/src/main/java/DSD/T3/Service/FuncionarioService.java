package DSD.T3.Service;


import DSD.T3.Entity.FuncionarioPOA;

public class FuncionarioService extends FuncionarioPOA {

   private String ctps;
   private int quantidadeVendas;
   private int id;
   private String cpf;
   private String nome;
   private String endereco;
   private int departamento;

   @Override
   public String ctps() {
      return ctps;
   }

   @Override
   public void ctps(String ctps) {
      this.ctps = ctps;
   }

   @Override
   public int quantidadeVendas() {
      return quantidadeVendas;
   }

   @Override
   public void quantidadeVendas(int quantidadeVendas) {
      this.quantidadeVendas = quantidadeVendas;
   }

   @Override
   public int id() {
      return id;
   }

   @Override
   public void id(int id) {
      this.id = id;
   }

   @Override
   public String cpf() {
      return cpf;
   }

   @Override
   public void cpf(String cpf) {
      this.cpf = cpf;
   }

   @Override
   public String nome() {
      return nome;
   }

   @Override
   public void nome(String nome) {
      this.nome = nome;
   }

   @Override
   public String endereco() {
      return endereco;
   }

   @Override
   public void endereco(String endereco) {
      this.endereco = endereco;
   }

   @Override
   public int departamento() {
      return departamento;
   }

   @Override
   public void departamento(int departamento) {
      this.departamento = departamento;
   }
}
