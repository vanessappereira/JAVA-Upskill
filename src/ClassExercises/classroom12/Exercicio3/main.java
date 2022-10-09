package ClassExercises.classroom12.Exercicio3;

import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
       PriorityQueue<senha> senhas = new PriorityQueue<senha>();

        senha nr1 =  new senha(1, "Maria", "25232466");
        senha nr2 =  new senha(9,"Marquelete", "259719999");
        senha nr3 =  new senha(7,"Jack", "215615050");

        senhas.add(nr1);
        senhas.add(nr2);
        senhas.add(nr3);

        System.out.println(senhas.poll());


    }
}
