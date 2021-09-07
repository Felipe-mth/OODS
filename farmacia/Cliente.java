package farmacia;

/**
 *
 * @author Felipe
 */
public class Cliente {
    private String cpf;
    private float carteira;
    private String cartao;
    private String senha_atual;
    private String senha_anterior;
    
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
    public void setCartao(String numero){
        if(numero.length() == 16){
            this.cartao = numero;
        }else{
            System.out.println("insira um numero de cartao valido");
        }
    }
    public String getCartao(){
        return this.cartao;
    }
    public void setSenha(String senha){
        this.senha_atual = senha;
    }
    public String getSenha(){
        return this.senha_atual;
    }
    public void setSenhaAntiga(String senha){
        this.senha_anterior = senha;
    }
    public String getSenhaAntiga(){
        return this.senha_anterior;
    }
    
    public void atualizarSenha(String senha){
        this.senha_anterior = this.senha_atual;
        this.senha_atual = senha;
    }
}
