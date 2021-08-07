package Colecaodecontas;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Colecao {
    ArrayList<Conta> listaDeContas= new ArrayList<>();
   public void Adicionar(Object conta){
           listaDeContas.add((Conta) conta); 
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
             System.out.println("\nNumero da Conta: " + listaDeContas.get(i).getId() + "\nDono da conta: " + listaDeContas.get(i).getNome() + "\nSaldo: " + listaDeContas.get(i).getSaldo());
         }
     }
     
    
}
