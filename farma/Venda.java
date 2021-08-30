package farma;
import java.util.ArrayList;
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
           if(carrinho.get(i) instanceof Produto == true){
            Produto aux = (Produto) carrinho.get(i);
            this.valorVenda += aux.getPreco();   
           }
       }
  
       System.out.println("o preco da compra foi: R$" + (float) valorVenda);
    }
    
    public void pagamento(){
        for(int i=0; i<carrinho.size(); i++ ){
           if(carrinho.get(i) instanceof Cliente){
               Cliente aux = (Cliente) carrinho.get(i);
              float pagamento = aux.getCarteira() - this.valorVenda;
              
              if(pagamento> 0){
                  System.out.println("Obrigado, volte sempre.");
              }
              else{
                   System.out.println("Sinto muito, não poderemos finalizar a compra");
              }
           }
        }
    }
    
}
