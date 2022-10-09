package ClassExercises.classroom4;
/*
e Fibonnaci é dada por:
F(0) = 0
F(1) = 1
F(n) = F(n-2) + F(n-1) (n>=2)

 */
public class fibonnacci {
    /*public static int fibonnacci(int p){
        if (p<=1) {
            return p;
        }else{
                return fibonnacci(p-2) + fibonnacci(p=p-1);
        }
    }
}*/
    public static void main(String[] args) {
        int[]vetor =new int[3];
        vetor[0]=5;
        vetor[1]=12;
        vetor[2]=3;
        System.out.println(sum(vetor));
    }

public static int sum (int[] v ){

    int soma=0;
    int b=0;
    while(b!= v.length){
        soma=soma+v[b];
        b++;
    }
    return soma;
}
}
