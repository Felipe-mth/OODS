
package TesteString;
import java.util.Arrays;
/**
 *
 * @author Felipe
 */
public class Main {

    public static void main(String[] args) {
        // Quest�o 3
        String nome="fj11";
        char[] lista = new char [nome.length()];
        //primeira ideia
        for(int i=0; i<nome.length();i++ ){
            lista[i] = nome.charAt(i);
        }
        for(int i=0; i<nome.length();i++ ){
            if(lista[i] == '1'){
                lista[i] = '2';
            }
        
        }
         Arrays.toString(lista);
        System.out.println(lista);
        //usando replace
        nome = nome.replace("1", "2");
        System.out.println(nome);
        
        //Quest�o 4
        //Como	sabemos	se uma String se encontra dentro de outra?
        String str = "casamento";
        System.out.println(str.contains("casa"));
        System.out.println(str.contains("mento"));
        System.out.println(str.contains("mulher"));
        //Como fazemos para tirar os espa�o branco das pontas de uma String?
        String frase = "        Valor        ";
        System.out.println(frase);
	String result = frase.replaceAll("\\s+","");
	System.out.println(result);
        //Como sabemos se uma String est� vazia?
        String str1 = "";
        String str2 ="frase";
        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        //Quantos caracteres tem uma String?
        System.out.println(str2.length());
        
        //Quest�o 5
        for(int i =0; i< str.length(); i++){
            System.out.println( str.charAt(i));
        }
        
        //Quest�o 6
        String p1 ="Socorram-me, subi no �nibus	em Marrocos";
        
        for(int i = p1.length()-1; i >= 0; i--) { 
            System.out.println(p1.charAt(i));
    }
        //QUest�o 7 ela � mais eficiente no contexto de m�ltiplas altera��es dentro de uma string.
        StringBuilder mensagem= new StringBuilder("Bem vindo");
         StringBuilder inverso = mensagem.reverse();
         System.out.println(inverso);
        
     }
    
} 
