package DSD.T3.Entity;

public class DepartamentoImpl extends DepartamentoPOA {

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
