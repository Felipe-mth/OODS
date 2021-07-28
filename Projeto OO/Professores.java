package Projeto.OO;

class Professores {
    
  private  String id;
  private  String nome;
  private  float nota;
  private  String curso;
  private  String instituicao;
  private String email;
  private int turma;

    public float getNota(){
        return this.nota;
    };
    public void setNota(float nota){
        this.nota = nota;
        
    };
    public String getNome(){
      return this.nome;
    };
    public void setNome(String name){
        this.nome=name;
    };
    public String getInstituicao(){
        return this.instituicao;
    };
    public void setInstituicao(String colegio){
        this.instituicao=colegio;
    };
    public String getEmail(){
        return this.email;
    };
    public void setEmail(String email){
        this.email=email;
    };
    public String getCurso(){
        return this.curso;
    };
    public void setCurso(String curso){
      this.curso=curso;
    };
    public String getId(){
        return this.id;
    };
    public void setId(String id){
        this.id=id;
    };

    public int getTurma(){
        return this.turma;
    }
    public void setTurma(int turma){
        if(turma>=0 || turma<=10){
            this.turma=turma;
        }
        else{
        System.out.println("valor inválido");
        }
    }
   
};


