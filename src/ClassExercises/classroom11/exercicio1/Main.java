package Aula11.exercicio1;

public class Main {

    public static void main(String[] args) {


        Calculadora cal = new Calculadora();

        //cal.mult(2, 3);

        Ope op = Ope.MUL;
        //cal.operacao(op, 2, 4);

        switch (op){
            case MUL:
                cal.mult(2, 4);
                break;
            case DIV:
                ///
                break;
        }


    }

}
