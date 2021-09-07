
package farmacia;
/**
 *
 * @author Felipe
 */
public class Produto {
    private final int id;
    private String nome;
    private int estoque;
    private String validade;
    private String descricao;
    float preco;
    private String fornecedor;
    
    
    public Produto (int identificador, String nome,float preco){
        this.id = identificador;
      
         if(preco> 0){
            this.preco = preco;
        }
        else{
            System.out.println("Por favor insira um valor valido");
        }
        this.nome = nome;
    }
    public int getId(){
        return this.id;
    }
    
      
    public String getNome(){
        return this.nome;
    }
    
    public void setEstoque(int quantidade){
        this.estoque = quantidade;
    }    
    public int getEstoque(){
        return this.estoque;
    }
    
    public void setValidade(String data){
        this.validade = data;
    }    
    public String getValidade(){
        return this.validade;
    }
    
    public void setDescricao(String texto){
        this.descricao = texto;
    }    
    public String getDescricao(){
        return this.descricao;
    }
    
  
    public float getPreco(){
        return this.preco;
    }
    
    public void setFornecedor(String nome){
        this.fornecedor = nome;
    }
    public String getFornecedor(){
        return this.fornecedor;
    }
}