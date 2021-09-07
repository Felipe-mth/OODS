/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Felipe
 */
public class Cosmetico extends Produto{
    private float desconto;
    private float preco_final;
    private String tipo;
    public Cosmetico(int id, String nome, float preco){
        super(id, nome, preco);
       
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
        
    }
     public float getPrecoFinal(){
        return this.preco_final;
    }
     public void setTipo(String tipo){
        if("olhos e labios".equals(tipo.toLowerCase()) || "tratamento facial".equals(tipo.toLowerCase()) || "maos e pes".equals(tipo.toLowerCase()) || "cabelos e unhas".equals(tipo.toLowerCase())){
            this.tipo = tipo;
        }
        else{
            System.out.println("insira um tipo de cosmetico valido");
        }
    }
    public String getTipo(){
        return this.tipo;
    }
}
