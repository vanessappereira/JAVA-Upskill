package Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(1);
        list.forEach(
                (n) -> System.out.println(n * 2)
        );
    }
}
