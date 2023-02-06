package IndependentWork4;

/*
Contar o número de ocorrências de um determinado caractere.
Exemplo: count(a,{a,b,c,a})->2
 */
public class ex11 {
    private static int countOccurrences(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("asdfgsghgsdfgthrydaasffgd", 'f'));
    }
}
