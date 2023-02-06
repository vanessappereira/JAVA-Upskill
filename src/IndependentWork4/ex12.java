package IndependentWork4;

/*
Construir um sub-vetor de outro vetor, dados os índices do primeiro elemento e último a incluir.
Exemplo: subarry(2,4,{a,d,r,a,c,r,w})}->{r,a,c}
*/
public class ex12 {

    public static char[] subarray(int a, int b, char[] v) {
        char[] novo = new char[b - a + 1];
        for (int i = 0; i < novo.length; i++) {
            novo[i] = v[i + a];
        }
        return novo;
    }

    public static void main(String[] args) {
        System.out.println(subarray(2, 4, new char[]{'a', 'd', 'r', 'a', 'c', 'r', 'w'}));
    }
}
