package farma;

/**
 *
 * @author Felipe
 */
public class Medicamento extends Produto{
    private float desconto;
    private float preco_final;
    
    public Medicamento(int id){
        super(id);
    }
    
    public void setDesconto(float valor){
        
        if(valor> 0 && valor<= (float)0.1){
          
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
