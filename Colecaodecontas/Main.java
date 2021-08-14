package Colecaodecontas;
import java.util.ArrayList;

public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Colecao co = new Colecao();
        Conta c1= new Conta(1);
        Conta c2= new Conta(2);
        Poupança p = new Poupança(3);
        
        System.out.println(c1 instanceof Poupança);
        System.out.println(p instanceof Poupança);
        
       
       c1.Creditar(500);
       c2.Creditar(1500);
       p.Creditar(100);
       p.renderJuros((float) 0.1);
       
       System.out.println(c1.getSaldo());
       System.out.println(c2.getSaldo());
       
       c1.Debitar(1000);
       
       System.out.println(c1.getSaldo());
       
       c2.Debitar((float) 250);
       
       c2.Debitar((float) 150);
       
       System.out.println(c2.getSaldo());
        co.Adicionar(c1);
        co.Adicionar(c2);
        co.Adicionar(p);
        
        co.Listar();
        
        co.Remover(2);
       
        co.Listar();
        
        co.renderPoupanca();
        
        
        
        
        
    }
    
}
