package farma;

/**
 *
 * @author Felipe
 */
public class Cliente {
    private String cpf;
    private float carteira;
    
    public void setCpf(String numero){
        this.cpf = numero;
    }
    public String getCpf(){
       return this.cpf;
    }
    public void setCarteira(float dinheiro){
        this.carteira = dinheiro;
    }
    public float getCarteira(){
     return this.carteira;   
    }
}
