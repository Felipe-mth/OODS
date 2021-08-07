
package Colecaodecontas;

/**
 *
 * @author Felipe
 */
public class Conta {
  private int id;
  private int saldo;
  private String nome;
  
  public Conta(int idConta){
      this.id = idConta;
  }
  public int getId(){
      return this.id;
  }
  
  public int getSaldo(){
  return this.saldo;
  }
  void setSaldo(int saldo){
      this.saldo = saldo;
  }
   public String getNome(){
  return this.nome;
  }
  void setNome(String nome){
      this.nome = nome;
  }
    
}
