/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farma;

/**
 *
 * @author Felipe
 */
public class Main {
      public static void main(String[] args) {
        Venda v1 = new Venda();
        Medicamento m1 = new Medicamento(1);
        Cosmetico c1 = new Cosmetico(2);
        Cliente ct = new Cliente();
        Cliente ct2 = new Cliente();
        
        ct.setCpf("110.328.264.60"); 
        ct.setCarteira((float) 10);
        ct2.setCpf("110.328.264.06");
        
        m1.setDesconto((float)0.1);
        m1.setDescricao("textinho legal");
        m1.setEstoque(50);
        m1.setNome("Dramin");
        m1.setPreco(10);
        m1.setValidade("01/10/2021");
        m1.setPrecoFinal();
        
        c1.setDesconto((float)0.2);
        c1.setDescricao("maquiagem");
        c1.setEstoque(100);
        c1.setNome("Batom");
        c1.setPreco(15);
        c1.setValidade("02/15/2023");
        c1.setPrecoFinal();
        
        v1.Comanda(ct);
        v1.Comanda(c1);
        v1.Comanda(m1);
        
        
        v1.Venda();
        v1.pagamento();
         
         
        
       
      }
}
