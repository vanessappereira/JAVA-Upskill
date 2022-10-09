package ClassExercises.classroom5;

public class Aula2 {

    public static int soma(int a, int b){
        return a+b;
    }

    public static int quadrado(int a){
        return a*a;
    }

    public static int diff(int a, int b){
        return a-b;
    }

    public static double media(int a, int b){
        return (a+b)/2;
    }

    public static int area(int a, int b){
        return a*b;
    }

    public static double celsiusToFare(double a){
        return (a*1.8)+32;
    }

    public static double celsiusToKelvin(double celsius){
        return celsius+273.15;
    }

    public static double cmToInches(double cm){
        return cm/2.54;
    }

    public static double iva(int preco){
        return preco-(preco/1.23);
    }

    public static int arredondar(double valor){
        return (int) Math.round(valor);
    }

    // argumento -> calculo auxiliar -> arredondado
    // 2.8 -> 3.3 -> 3
    // 3.1 -> 3.6 -> 3
    // 5.4 -> 5.9 -> 5
    // 5.5 -> 6 -> 6
    public static int arredondarSemMathRound(double valor){
        return (int) (valor+0.5);
    }

    public static double perimetroCirculo(double diametro){
        return Math.PI * diametro;
    }

    //A = 2 * (l*c + a*c + a*l)
    public static double areaPrisma(int largura, int altura, int comprimento){
        return 2 * ( (largura * comprimento) + (altura * comprimento) + (altura * largura) );
    }

    public static double arredondarDuasCasas(double valor){
        return arredondarSemMathRound(valor*100.0)/100.0;
    }

    public static double arredondarXCasasDecimais(double valor, int x){
        //x = 2 ---- 100
        //x = 3 ---- 1000
        //x = 4 ---- 10000
        double potencia = Math.pow(10,x);
        return arredondarSemMathRound(valor*potencia)/potencia;
    }

    public static void main(String[] args) {
        System.out.println(arredondarXCasasDecimais(2.687543214567,3));
    }


}
