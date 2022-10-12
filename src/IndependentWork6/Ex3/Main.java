package IndependentWork6.Ex3;

public class Main {
    public static void main(String[] args) {
        //Criar carros
        Car car1 = new Car("23-AB-42", "ford", "focus", 4,
                2, 12, 6.23, 58);

        Car car2 = new Car("ab-ac-br", "opel", "corsa", 5,
                5, 10, 7.8, 45);

        //Criação de pessoas
        Person person1 = new Person("João", "Alves", 32);
        Person person2 = new Person("Maria", "Filipa", 24);


        car1.registoProprietario(person1);
        car2.registoProprietario(person2);

        System.out.println(car1.getProprietario());
        System.out.println(car2.getProprietario());

        //Encher o deposito
        car1.encherDeposito();
        car2.encherDeposito();

        System.out.println("O carro " + car1 + " tem o deposito com " + car1.getCapacidadeAtual() + " litros \n");
        System.out.println("O carro " + car2 + " tem o deposito com " + car2.getCapacidadeAtual() + " litros \n");

        car1.run(30);
        car2.run(300);

        System.out.println("O carro " + car1 + " tem o deposito com " + car1.getCapacidadeAtual() + " L de "
                + car1.getCombustivelMaximo() + " L \n");

        System.out.println("O carro " + car2 + " tem o deposito com " + car2.getCapacidadeAtual() + " L de "
                + car2.getCombustivelMaximo() + " L \n");

    }
}
