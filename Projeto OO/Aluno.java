package Projeto.OO;

 class Aluno {
    private String email;
    private String nome;
    private int desempenho;
    private int idade;
    private int turma;
    private String dificuldades;
    
    public String getNomeA(){
      return this.nome;
    };
    public void setNomeA(String name){
        this.nome=name;
    };
    public String getEmailA(){
        return this.email;
    };
    public void setEmailA(String email){
        this.email=email;
    };

    public int getIdade(){
        return this.idade;
    };
    public void setidade(int idade){
      this.idade=idade;
    };
    public int getDesempenho(){
        return this.desempenho;
    };
    public void setDesempenho(int desempenho){
      this.desempenho=desempenho;
    };
    
    public String getDificuladades(){
        return this.dificuldades;
    };
    public void setDificuldades(String dificuldade){
      this.dificuldades= dificuldade;
    };
    public int getTurma(){
        return this.turma;
    };
    public void SetTurma(int turma){
      this.turma=turma;
    };
    
}
