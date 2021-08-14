
package Colecaodecontas;

/**
 *
 * @author Felipe
 */
public class Conta {
  private final int Numero;
  private float saldo;
   
  public Conta(int idConta){
      this.Numero = idConta;
  }
  public int getId(){
      return this.Numero;
  }
  
  public float getSaldo(){
  return this.saldo;
  }
 public void Creditar(float valor){
     this.saldo+=valor;
 }
    public void Debitar(float valor){
     if(this.saldo - valor>=0){
         this.saldo-=valor;
     }
     else{
         System.out.println("Saldo insuficiente!!");
     }
 }
}
