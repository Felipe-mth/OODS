package Colecaodecontas;
import java.util.ArrayList;

public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Colecao co = new Colecao();
        Conta c1= new Conta(1);
        Conta c2= new Conta(2);
        
        c1.setNome("Jorge");
        c1.setSaldo(10000);
        
        c2.setNome("Lucas");
        c2.setSaldo(5000);
        
        co.Adicionar(c1);
        co.Adicionar(c2);
        
        co.Listar();
        
        co.Remover(2);
       
        co.Listar();
        
        
        
        
    }
    
}
