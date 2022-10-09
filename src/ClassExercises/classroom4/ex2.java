package ClassExercises.classroom4;
public class ex2 {
    public static void main(String[] args) {
        int[]vetor =new int[5];
        vetor[0]=5;
        vetor[1]=12;
        vetor[2]=3;
        vetor[3]=66;
        vetor[4]=12;

        System.out.println(existevalor(3,vetor));
    }
public static boolean existevalor(int a, int[]v){
    for(int c=0; c<v.length; c++){
        if (v[c]==a){
            return true;
        }
    }
    return false;
}
}