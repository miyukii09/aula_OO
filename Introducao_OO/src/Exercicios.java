/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felip
 */
public class Exercicios {
    private String nome;
    private String sexo;
    private int idade;
    private int meses;
    
    public Exercicios()
    {
        nome  = "Nao informado";
        sexo  = "Nao informado";
        idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }
     public void calcularMesesVividos()
    {
        meses = idade*12;
    }
}
