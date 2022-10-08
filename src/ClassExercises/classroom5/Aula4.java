public class Aula4 {

    public static void somaWhile(){
        int soma = 0;
        int i = 0;
        while(i<=100){
            soma += i;
            i++;
        }
        System.out.println(soma);
    }

    public static void somaFor(){
        int soma = 0;
        for(int i = 0;i<=100;i++){
            soma += i;
        }
        System.out.println(soma);
    }

    public static int divisores(int n){
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        return count;
    }

    public static int divisoresSomatorio(int n){
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean ePrimo(int n){
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean primoIntervalo(int a, int b){
        for(int i = a+1; i<b; i++){
            if(ePrimo(i)){
                return true;
            }
        }
        return false;
    }

    public static int[] naturals(int n){
        int[] naturals = new int[n];
        for(int i = 0; i<naturals.length; i++){
            naturals[i] = i+1;
        }
        return naturals;
    }

    public static int[] randomDigits(int n){
        int[] aleatorio = new int[n];
        for(int i = 0; i<aleatorio.length; i++){
            aleatorio[i] = (int) (Math.random()*10);
        }
        return aleatorio;
    }

    public static int[] inteiros(){
        int[] inteiros = new int[50];
        for(int i = 0; i<inteiros.length; i++){
            inteiros[i] = 101+i;
        }
        return inteiros;
    }

    public static int[] copy(int[] v, int a){
        int[] novo = new int[a];
        for(int i = 0; i<novo.length; i++){
            if(i >= v.length){
                novo[i] = 0;
            } else {
                novo[i] = v[i];
            }
        }
        return novo;
    }

    public static int count(char a, char[] chars){
        int count = 0;
        for(int i = 0; i<chars.length; i++){
            if(chars[i]==a){
                count++;
            }
        }
        return count;
    }

    public static char[] subarray(int a, int b, char[] v){
        char[] novo = new char[b-a+1];
        for(int i = 0; i<novo.length; i++){
            novo[i] = v[i+a];
        }
        return novo;
    }

}
