/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Felipe
 */
public class Main {
      public static void main(String[] args) {
        Venda v1 = new Venda();
        Medicamento m1 = new Medicamento(1,"Dramin", 20f );
        Cosmetico c1 = new Cosmetico(2, "batom", 10f);
        Cliente ct = new Cliente();
        Cliente ct2 = new Cliente();
        
        ct.setCpf("110.328.264.60"); 
        ct.setCarteira((float) 30);
        ct.setCartao("1234567891011123");
        ct.setSenha("1234");
        ct.setSenhaAntiga("4321");
        ct2.setCpf("110.328.264.06");
        
        m1.setDesconto((float)0.1);
        m1.setDescricao("textinho legal");
        m1.setEstoque(50);
        m1.setValidade("01/10/2021");
        m1.setPrecoFinal();
        m1.setTipo("Visao");
        
        c1.setDesconto((float)0.2);
        c1.setDescricao("maquiagem");
        c1.setEstoque(100);
        c1.setValidade("02/15/2023");
        c1.setPrecoFinal();
        c1.setTipo("caBELOS E UNHAS");
        
        v1.Comanda(ct);
        v1.Comanda(c1);
        v1.Comanda(m1);
        
        
        v1.Venda();
        //v1.pagamento();
        v1.maquininha("1234", "1234567891011123", 2);
        
        
       
      }
}
