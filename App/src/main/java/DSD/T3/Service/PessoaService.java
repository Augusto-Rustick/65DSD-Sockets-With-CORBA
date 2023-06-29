package DSD.T3.Service;


import DSD.T3.Entity.PessoaPOA;

public class PessoaService extends PessoaPOA {

   private int id;
   private String cpf;
   private String nome;
   private String endereco;
   private int departamento;


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
