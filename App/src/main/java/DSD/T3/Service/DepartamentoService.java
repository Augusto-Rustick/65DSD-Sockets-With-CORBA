package DSD.T3.Service;

import DSD.T3.Entity.DepartamentoPOA;

public class DepartamentoService extends DepartamentoPOA {

   private String nome;
   private String produto;
   private int quantidadeEstoque;

   @Override
   public String getNome() {
      return nome;
   }

   @Override
   public String getProduto() {
      return produto;
   }

   @Override
   public int getQuantidadeEstoque() {
      return quantidadeEstoque;
   }

   @Override
   public void setProduto(String produto) {
      this.produto = produto;
   }

   @Override
   public void setQuantidadeEstoque(int quantidadeEstoque) {
      this.quantidadeEstoque = quantidadeEstoque;
   }
}