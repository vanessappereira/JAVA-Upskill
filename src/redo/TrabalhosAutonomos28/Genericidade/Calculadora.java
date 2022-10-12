package TrabalhosAutonomos.Genericidade;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    List<Integer> list = new ArrayList<Integer>();

    public double soma(int a, int b){
        return a+b;
    }

    public double subtracao(int a, int b){
        return a-b;
    }

    public double divisao(int a, int b){
        return a/b;
    }

    public double multiplicacao(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {

    }

}
