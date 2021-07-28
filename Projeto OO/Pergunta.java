
package Projeto.OO;

public class Pergunta {
    private int tipo;
    private String materia;
    private int urgencia;
    private String pergunta;
    private String aluno;
    
    public int getTipo(){
        return this.tipo;
    };
    public void setTipo(int tipo){
        this.tipo = tipo;
        
    };
    public int getUrgencia(){
        return this.urgencia;
    };
    public void setUrgencia(int urgencia){
        this.urgencia = urgencia;
        
    };
    public String getMateria(){
      return this.materia;
    };
    public void setMateria(String materia){
        this.materia=materia;
    };
    public String getpergunta(){
      return this.pergunta;
    };
    public void setPergunta(String pergunta){
        this.pergunta=pergunta;
    };
    public String getAluno(){
      return this.aluno;
    };
    public void setAluno(String aluno){
        this.aluno=aluno;
    };


}
