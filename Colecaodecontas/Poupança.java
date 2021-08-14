package Colecaodecontas;

/**
 *
 * @author Felipe
 */
public class Poupança extends Conta{
    public Poupança(int idDaConta){
        super(idDaConta);
    }
    public void renderJuros(float juros){
        this.Creditar(juros*super.getSaldo());
    }
}
