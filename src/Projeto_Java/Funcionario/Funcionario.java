package Projeto_Java.Funcionario;

public class Funcionario {

    //ATRIBUTOS E DADOS
    public String nome;
    public Double valorPorHora;
    public int horas;

    //METODOS (FUNÇÕES) (COMPORTAMENTOS)
    public double total(){
    return valorPorHora * horas;
}
}