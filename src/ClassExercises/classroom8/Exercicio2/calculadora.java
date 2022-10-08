package Aula8ClasseAbstrata.Exercicio2;

public abstract class calculadora {


//existe tb por omisso
    public calculadora(){ }

    public double soma(double a, double b){
        return a+b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public double mul(double a, double b){
        return a*b;
    }
    public double div(double a, double b){
        return a/b;
    }
}

