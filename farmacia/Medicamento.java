package farmacia;

/**
 *
 * @author Felipe
 */
public class Medicamento extends Produto{
    private float desconto;
    private float preco_final;
    private String tipo;
    
    public Medicamento(int id, String nome, float preco){
        super(id, nome, preco);
       
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
        
    }
    public float getPrecoFinal(){
        return this.preco_final;
    }
    
    public void setTipo(String tipo){
        if("bem estar".equals(tipo.toLowerCase()) || "pele,cabelo e unha".equals(tipo.toLowerCase()) || "visao".equals(tipo.toLowerCase()) || "digestão".equals(tipo.toLowerCase())){
            this.tipo = tipo;
        }
        else{
            System.out.println("insira um tipo de medicamento valido");
        }
    }
    public String getTipo(){
        return this.tipo;
    }
}
    

