package Aula4CiclosEVetores.aulas;

public class ex3 {
    public static void main(String[] args) {
        int[]vetor =new int[5]; //ou int vetor[] = {5,12,3,66,12}
        vetor[0]=5;
        vetor[1]=12;
        vetor[2]=3;
        vetor[3]=66;
        vetor[4]=12;

        System.out.println(valormaximo(vetor));
    }
    public static int valormaximo(int[]vetor){
        int max=0;
        for(int i=0; i<vetor.length; i++){
            if (vetor[i] > max){
                max = vetor[i];
            }
        }
        return max;
    }
}
