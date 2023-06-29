package DSD.T3.Service;

import DSD.T3.Entity.Departamento;
import DSD.T3.Entity.TransportadorPOA;

public class TransportadorService extends TransportadorPOA {

   public TransportadorService(String cpf, String nome, String endereco, String telefone) {
      this.telefone = telefone;
      this.cpf = cpf;
      this.nome = nome;
      this.endereco = endereco;
   }

   private String telefone;
   private String cpf;
   private String nome;
   private String endereco;
   private int carregamento;
   private int departamento;
   private int id;

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
      this.carregamento = departamento;
   }

   @Override
   public String telefone() {
      return telefone;
   }

   @Override
   public void telefone(String telefone) {
      this.telefone = telefone;
   }

   @Override
   public int carregamento() {
      return carregamento;
   }

   @Override
   public void carregamento(int carregamento) {
      this.carregamento = carregamento;
   }

}
