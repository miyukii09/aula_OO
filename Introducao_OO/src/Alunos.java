/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Alunos {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    private String situacao;
    
    public Alunos(){
        nome="";
        nota1=0;
        nota2=0;
        media=0;
        situacao="não informado";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public double FazerMedia(double n1, double n2){
      media = (n1+n2)/2;
      setMedia(media);
      
      if(media>=6){
           setSituacao("Aprovado");
        }
        else{
           setSituacao("Reprovado");
        }
      return media;
    }
    
    
}
