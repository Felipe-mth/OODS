package Colecaodecontas;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Colecao {
    ArrayList<Conta> listaDeContas= new ArrayList<>();
   public void Adicionar(Object conta){
           if(conta instanceof Poupança == true){
               listaDeContas.add((Poupança) conta);
               
           }
           else if(conta instanceof Poupança == false){
               listaDeContas.add((Conta) conta);
           }
           System.out.println("\nA conta foi adicionada a colecao");
    };
     public void Remover(int id){
          for(int i=0; i<listaDeContas.size();i++){
              if(listaDeContas.get(i).getId() == id){
               listaDeContas.remove(listaDeContas.get(i));
               System.out.println("\nA conta selecionada foi deletada com sucesso!!");
              }
          }           
    };
     public void Listar(){
         
            for(int i=0; i<listaDeContas.size();i++ ){
                System.out.println("\n-------------------");
                 System.out.println("\nNumero da Conta: " + listaDeContas.get(i).getId() + "\nSaldo: " + listaDeContas.get(i).getSaldo());
            }
     }
     
    public void renderPoupanca(){
        for(int i=0; i<listaDeContas.size();i++ ){
               if(listaDeContas.get(i) instanceof Poupança){
                   Poupança auxiliar = (Poupança) listaDeContas.get(i);
                   auxiliar.renderJuros(0.1f);
                   System.out.println("\nParabens conta:"+listaDeContas.get(i).getId()+"\nSeu novo saldo e: " + listaDeContas.get(i).getSaldo());
               }
            }
    }    
}
