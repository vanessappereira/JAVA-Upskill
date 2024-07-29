
public class AWork5 {
    /*
     * Get the first half a vector v, including a boolean parameter for allow if
     * middle element is to include (if the length of the vector is odd). If the
     * length is even, this parameter will have no effect.
     * Example: firstHalf({1,2,3,4,5}, true)->{1,2,3}
     */
    public static int[] firstHalf(int[] v, boolean includeMiddle) {
        int t = v.length / 2;
        if (v.length % 2 == 1 && includeMiddle)
            t = t + 1;
        int[] newVector = new int[t];
        int i = 0;
        while (i < newVector.length) {
            newVector[i] = v[i];
            i = i + 1;
        }
        return newVector;
    }

    /*
     * Build a vector by joining two other vectors (left part and right part).
     * Example: merge({1,2},{9,10})
     */
    public static int[] merge(int[] v1, int[] v2) {
        int[] newVector = new int[v1.length + v2.length];
        int i = 0;
        while (i < v1.length) {
            newVector[i] = v1[i];
            i += 1;
        }
        int j = 0;
        while (j < v2.length) {
            newVector[v1.length + i] = v2[j];
            i += 1;
        }
        return newVector;
    }

    /*
     * Construct an inverted vector based on another. That is, the new vector
     * will be composed of the elements of the given vector in reverse order.
     * Example: invert({1,2,3)}->{3,2,1}
     */
    public static int[] invert(int[] v) {
        int[] newVector = new int[v.length];
        int i;
        for (i = 0; i < v.length; i++) {
            newVector[i] = v[v.length - i - 1];
        }
        return newVector;
    }

    /*
     * Construct a vector based on another, so that it is twice the size and that
     * each element is duplicated.
     * Example: duplicateEveryElement({1,2,3})->{1,1,2,2,3,3}
     */
    public static int[] duplicateEveryElement(int[] v) {
        int[] newVector = new int[v.length * 2];
        int i, count = 0;
        for (i = 0; i < v.length; i++) {
            newVector[count] = v[i];
            newVector[count + 1] = v[i];
            count += 2;
        }
        return newVector;
    }

    /*
     * Construct a vector based on another, with the first half being a copy and the
     * second half being the same elements
     * in reverse order.
     * Example: duplicateInverted({3,2,1})->(3,2,1,1,2,3)
     */
    public static int[] duplicateInverted(int[] v) {
        // used exercise 2 and 3
        return merge(v, invert(v));
    }

    /*
     * Construct a vector based on another, representing a copy without the middle
     * element (if the size is odd).
     * Example: copyWithoutMiddleElement({1,2,3,4,5})->{1,2,4,5}
     */
    // Creation of a subArray with the start value, end value, and a vector of
    // integers.
    private static int[] subArray(int a, int b, int[] vetor) {
        int[] v = new int[b - a + 1]; // Inicialização de uma variável v
        for (int i = 0; i < v.length; i++) {
            v[i] = vetor[i + a];
        }
        return v;
    }

    public static int[] copyWithoutMiddleElement(int[] vetor) {
        int[] firstHalf1 = firstHalf(vetor, false);
        int[] secondHalf1 = subArray(vetor.length / 2 + 1, vetor.length - 1, vetor);

        return merge(firstHalf1, secondHalf1);
    }

    /*
     * Construct a vector with n numbers from the Fibonacci sequence.
     * Example: fibonacciSequence(7)-> {0,1,1,2,3,5,8}
     */
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int[] fibonacciSequence(int n) {
        int[] newFibonacci = new int[n];

        for (int i = 0; i < newFibonacci.length; i++) {
            newFibonacci[i] = fibonacci(i);
        }
        return newFibonacci;
    }

}