package IndependentWork5;

import java.util.Arrays;

/*
Construir um vetor com base noutro, de modo a ter o dobro do tamanho e que cada elemento esteja duplicado.
Exemplo: duplicateEveryElement({1,2,3})->{1,1,2,2,3,3}
 */
public class ex4_duplicate {
    public static int[] duplicateEveryElement(int[] vetor) {
        //Criação do vetor duplicado
        int[] duplicado = new int[vetor.length * 2];
        int count = 0;

        for (int i = 0; i < vetor.length; i++) {
            duplicado[count] = vetor[i];        //o vetor duplicado irá ter um contador para o vetor introduzido
            duplicado[count + 1] = vetor[i];    //irá ser adicionado e copiado
            count += 2;                         //e o contador irá ficar com o valor a 2
        }
        return duplicado;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicateEveryElement(new int[]{1, 2, 3})));
    }
}
