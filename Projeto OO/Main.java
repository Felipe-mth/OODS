
package Projeto.OO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // write your code here
       Professores p1 = new Professores();
       Aluno a1 = new Aluno();
       System.out.println(a1);
       int fim=0;
        Scanner ler = new Scanner(System.in);
       while(fim==0){
           System.out.println("Se voce for professor digite 1, se for aluno digite 2");
        int tipo = ler.nextInt();
        
        switch(tipo){
            case 1: 
            System.out.println("Bem vindo professor!!");
            System.out.println("\n insira aqui seu nome");
            p1.setNome(ler.next());
            System.out.println("\n insira aqui seu CPF");
            p1.setId(ler.next());
            System.out.println("\n insira aqui seu email de contato");
            p1.setEmail(ler.next()); 
            System.out.println("\n insira aqui a disciplina que voce leciona");
            p1.setCurso(ler.next()); 
            System.out.println("\n insira aqui sua instituicao de ensino");
            p1.setInstituicao(ler.next());    
            System.out.println("\n Qual turma você leciona");
            p1.setTurma(ler.nextInt());   
            int turmas[]= {p1.getTurma()};
            break;
            case 2:
                int correto = 0;
                System.out.println("Bemvindo aluno!!");
                System.out.println("\n Por favor insira seu nome");
                a1.setNomeA(ler.next());
                System.out.println("\n Por favor insira sua idade");
                a1.setidade(ler.nextInt());
                System.out.println("\n Por favor insira seu email");
                a1.setEmailA(ler.next());
                System.out.println("\n Por favor insira sua turma");
                int valido = ler.nextInt();
                if(valido == p1.getTurma()){
                    a1.SetTurma(valido);
                }
                else{
                    System.out.println("a turma que você digitou não existe");
                }
                while(correto == 0){
                System.out.println("\n Em uma escala de 0 a 10 avalie seu desempenho acadÃªmico");
                int avaliacao = ler.nextInt();
                if(avaliacao<0 || avaliacao>10){
                    System.out.println("\n Em uma escala de 0 a 10 avalie seu desempenho acadÃªmico");
                    avaliacao = ler.nextInt();
                    correto=0;
                }
                else{
                    a1.setDesempenho(avaliacao);
                    correto=1;
                        }
            }
                System.out.println("Insira aqui a materia que voce tem dificuldade");
                a1.setDificuldades(ler.next());
                break;
            default:
                System.out.println("\npor favor insira um valor valido");                
        }
        if(tipo == 1){
            System.out.println(p1.getNome());
            System.out.println(p1.getId());
            System.out.println(p1.getCurso());
            System.out.println(p1.getEmail());
            System.out.println(p1.getInstituicao());
        }
        if(tipo == 2){
            String pergunta = "";
            System.out.println("deseja  fazer uma pergunta? \n1-sim\t2-não");
            int valido = ler.nextInt();
            if(valido == 1){
                Pergunta pe1 = new Pergunta();
                pe1.setAluno(a1.getNomeA());
                System.out.println("Numa escala de 0 a 10 qual a urgencia da pergunta?");
                pe1.setUrgencia(ler.nextInt());
                System.out.println("Qual a materia da pergunta?");
                pe1.setMateria(ler.next());
                System.out.println("Qual e a sua pergunta?");
                pe1.setPergunta(ler.next());
                pergunta =pe1.getpergunta();
            }
            
            System.out.println(a1.getNomeA());
            System.out.println(a1.getIdade());
            System.out.println(a1.getTurma());
            System.out.println(a1.getDesempenho());
            System.out.println(a1.getDificuladades());
            if("".equals(pergunta)){
                System.out.println("Perguntas feitas:");
                System.out.println("Não foram feitas perguntas");
            }
            else{
                System.out.println("Perguntas feitas:");
                System.out.println(pergunta);
                        }
            }
            
        }
        System.out.println("deseja cadastrar mais uma pessoa?\n1-sim\t2-não");
        int resposta = ler.nextInt();
        if(resposta == 1){
            fim=0;
        }
        if(resposta==2){
            fim=1;
        }
       }
    }
