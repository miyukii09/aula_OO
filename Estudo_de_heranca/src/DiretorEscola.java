/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class DiretorEscola extends Professores{

    public DiretorEscola() {
    }

    public DiretorEscola(int quantidadeAula, double valorHoraAula, int matricula, String nome) {
        super(quantidadeAula, valorHoraAula, matricula, nome);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.5;
    }

    @Override
    public String toString() {
        return "Diretor da Escola";
    }
    
    
    
}
