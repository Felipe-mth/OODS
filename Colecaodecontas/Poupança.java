package Colecaodecontas;

/**
 *
 * @author Felipe
 */
public class Poupan�a extends Conta{
    public Poupan�a(int idDaConta){
        super(idDaConta);
    }
    public void renderJuros(float juros){
        this.Creditar(juros*super.getSaldo());
    }
}
