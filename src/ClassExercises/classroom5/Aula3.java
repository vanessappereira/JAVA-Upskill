package ClassExercises.classroom5;

import java.time.LocalDate;
import java.util.Scanner;

public class Aula3 {

    public static int idade(int ano){
        int currentYear = LocalDate.now().getYear();
        return currentYear-ano;
    }

    public static double divide(int a, int b){
        if(b==0){
            return 0;
        } else {
            return a/b;
        }
    }

    public static boolean isPar(int a){
        return a%2==0;
    }

    public static void devolve(){
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        System.out.println(line);
    }

    public static int numeroRodas(String tipoVeiculo){
        switch (tipoVeiculo){
            case "automovel":
                return 4;
            case "bicicleta":
            case "mota":
                return 2;
            case "camiao":
                return 2;
            case "monociclo":
                return 1;
            default:
                return 0;
        }
    }

    public static String nota(int nota){
        if(nota < 0 || nota > 100){
            return "Nota inválida!";
        } else if (nota < 30) {
            return "Muito Insuficiente!";
        } else if (nota >= 30 && nota < 50) {
            return "Insuficiente!";
        } else if (nota >= 50 && nota < 70) {
            return "Suficiente!";
        } else if (nota >= 70 && nota < 80) {
            return "Bom!";
        } else if (nota >= 80 && nota < 90) {
            return "Muito Bom!";
        } else {
            return "Excelente!";
        }
    }

    public static String mes (int mes){
        switch(mes){
            case 1:
                return "janeiro";
            case 2:
                return "fevereiro";
            case 3:
                return "marco";
            case 4:
                return "abril";
            case 5:
                return "maio";
            case 6:
                return "junho";
            case 7:
                return "julho";
            case 8:
                return "agosto";
            case 9:
                return "setembro";
            case 10:
                return "outubro";
            case 11:
                return "novembro";
            case 12:
                return "dezembro";
            default:
                return "Mês Inválido!";
        }
    }

    public static String signo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduza o seu dia de nascimento");
        int dia = s.nextInt();
        System.out.println("Introduza o número do seu mês de nascimento");
        int mes = s.nextInt();
        if(mes == 1){
            if(dia < 20){
                return "Capricornio";
            } else {
                return "Aquario";
            }
        }
        //restantes datas dos signos...
        return "A data não é válida";
    }

    public static void ordenar(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduza o primeiro número");
        int valor1 = s.nextInt();
        System.out.println("Introduza o segundo número");
        int valor2 = s.nextInt();
        System.out.println("Introduza o terceiro número");
        int valor3 = s.nextInt();

        if (valor1 < valor2) {
            if (valor2 < valor3) {
                System.out.println(valor1 + "\n" + valor2 + "\n" + valor3);
            } else if (valor1 < valor3) {
                System.out.println(valor1 + "\n" + valor3 + "\n" + valor2);
            } else {
                System.out.println(valor3 + "\n" + valor1 + "\n" + valor2);
            }
        } else if (valor2 < valor3) {
            if (valor3 < valor1) {
                System.out.println(valor2 + "\n" + valor3 + "\n" + valor1);
            } else if (valor1 < valor3) {
                System.out.println(valor2 + "\n" + valor1 + "\n" + valor3);
            } else {
                System.out.println(valor3 + "\n" + valor2 + "\n" + valor1);
            }
        }
    }

}
