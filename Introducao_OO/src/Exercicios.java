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
    private int ValConsulta;
    private int QtdeConsulta;
    private int salario;
    private double SalBruto;
    private double INSS;
    private double SalLiquido;
        
    public Exercicios()
    {
        nome         = "Nao informado";
        sexo         = "Nao informado";
        idade        = 0;
        ValConsulta  = 0;
        QtdeConsulta = 0;
        salario      = 0;
        SalBruto     = 0;
        INSS         = 0;
        SalLiquido   = 0;
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

    public int getQtdeConsulta() {
        return QtdeConsulta;
    }

    public void setQtdeConsulta(int QtdeConsulta) {
        this.QtdeConsulta = QtdeConsulta;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getValConsulta() {
        return ValConsulta;
    }

    public void setValConsulta(int ValConsulta) {
        this.ValConsulta = ValConsulta;
    }

    public void setINSS(double INSS) {
        this.INSS = INSS;
    }

    public double getINSS() {
        return INSS;
    }

    public void setSalBruto(double SalBruto) {
        this.SalBruto = SalBruto;
    }

    public double getSalBruto() {
        return SalBruto;
    }

    public void setSalLiquido(double SalLiquido) {
        this.SalLiquido = SalLiquido;
    }

    public double getSalLiquido() {
        return SalLiquido;
    }
    
    
    /* atividades*/
     public void calcularMesesVividos()
    {
        meses = idade*12;
    }
     
     public void calcularSalario()
     {
         salario = QtdeConsulta * ValConsulta;
     }
     
     public void CalcularSararioLiquido()
     {
         SalLiquido = SalBruto - INSS;
     }
}
