package farmacia;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Felipe
 */
public class Venda {
    ArrayList<Object> carrinho= new ArrayList<>();
    
    private float valorVenda = 0;
    
    public void Comanda(Object produto){
      if( produto instanceof Produto == true){
        carrinho.add((Produto) produto);
        Produto aux = (Produto) produto;
        aux.setEstoque(aux.getEstoque() - 1);
        
      }
      else{
          int tem =0;
          for(int i=0; i<carrinho.size(); i++){
             if(carrinho.get(i) instanceof Cliente){
                tem = 1;
                System.out.println("Só aceitamos um cliente por nota");
                break;
             }
          }
          
          if(tem == 0){
              carrinho.add(produto);
          }
          
          
      }
    }
 
    public void Venda(){
       
       
       for(int i=0; i<carrinho.size(); i++){
           if(carrinho.get(i) instanceof Medicamento == true){
             Medicamento aux = (Medicamento) carrinho.get(i);
            this.valorVenda += aux.getPrecoFinal();  
           }
           if(carrinho.get(i) instanceof Cosmetico == true){
            Cosmetico aux = (Cosmetico) carrinho.get(i);
            this.valorVenda += aux.getPrecoFinal(); 
               }
       }
        
  
       System.out.println("o preco da compra foi: R$" + (float) valorVenda);
    }
    
    public void pagamento(){
        for(int i=0; i<carrinho.size(); i++ ){
           if(carrinho.get(i) instanceof Cliente){
               Cliente aux = (Cliente) carrinho.get(i);
              float pagamento = aux.getCarteira() - this.valorVenda;
              
              
              if(pagamento>= 0){
                  System.out.println("Obrigado, volte sempre.");
              }
              else{
                   System.out.println("Sinto muito, não poderemos finalizar a compra");
              }
           }
        }
    }
    
    public void maquininha(String senha, String cartao, int parcelas){
        Random conexao = new Random();
        if(parcelas <= 0){
            parcelas =1;
        }
        if(conexao.nextInt(2) == 0 || conexao.nextInt(2) == 1){
            System.out.println("\nConectado");
            for(int i=0; i<carrinho.size(); i++){
                if(carrinho.get(i) instanceof Cliente){
                    Cliente aux = (Cliente) carrinho.get(i);
                    if(aux.getCartao().equals(cartao)){
                        if(senha.equals(aux.getSenha())){
                            System.out.println("sucesso");
                            
                            System.out.println("Sua compra sera parcelada em: "+ parcelas + " de " + valorVenda/parcelas);
                        }if(senha.equals(aux.getSenhaAntiga())){
                            System.out.println("Cliente desatualizado");
                        }if(aux.getSenha() != senha && aux.getSenhaAntiga() != senha ){
                          System.out.println("Dados invalidos");  
                        }
                    }else{ 
                        System.out.println("Dados invalidos");
                    }
                }
            }
        }else{
           System.out.println("Erro de conexão"); 
        }
    }
    
}
