package Aula8ClasseAbstrata.Exercicio2;

public class calculadoraCientifica extends calculadora {

    public calculadoraCientifica(){}


    public double raizQua(double a){
        return Math.sqrt(a);
    }
    public double potencia (double a, double exp){
        return Math.pow(a,exp);
    }
}
