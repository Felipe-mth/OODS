
package farma;
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
    private float preco;
    private String fornecedor;
    
    
    public Produto (int identificador){
        this.id = identificador;
    }
    public int getId(){
        return this.id;
    }
    
    public void setNome(String nome){
        this.nome =  nome;
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
    
    public void setPreco(float preco){
        if(preco> 0){
            this.preco = preco;
        }
        else{
            System.out.println("Por favor insira um valor valido");
        }
        
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