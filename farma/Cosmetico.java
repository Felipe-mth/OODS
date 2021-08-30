/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farma;

/**
 *
 * @author Felipe
 */
public class Cosmetico extends Produto{
    private float desconto;
    private float preco_final;
    
    public Cosmetico(int id){
        super(id);
    }
    
     public void setDesconto(float valor){
        if(valor <= (float)0.2 && valor> 0){
           this.desconto = valor; 
        }
        else{
            System.out.println("Este produto nao pode receber descontos acima de 10%");
        }
    }
   public float getDesconto(){
       return this.desconto;
   }
   
   public void setPrecoFinal(){
        this.preco_final = this.getPreco() - (this.getPreco()* this.getDesconto());
        this.setPreco(preco_final);
    }
     public float getPrecoFinal(){
        return this.preco_final;
    }
}
