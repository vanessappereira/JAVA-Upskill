package IndependentWork6.ex3_addCar;

public class Main {
    public static void main(String[] args) {
        //Create cars
        Car car1 = new Car("23-AB-42", "ford", "focus", 4,
                2, 12, 6.23, 58);

        Car car2 = new Car("ab-ac-br", "opel", "corsa", 5,
                5, 10, 7.8, 45);

        //Creation of persons
        Person person1 = new Person("João", "Alves", 32);
        Person person2 = new Person("Maria", "Filipa", 24);


        car1.registerCarOwner(person1);
        car2.registerCarOwner(person2);

        System.out.println(car1.getCarOwner());
        System.out.println(car2.getCarOwner());

        //Fill Tank
        car1.fillTank();
        car2.fillTank();

        System.out.println("The car " + car1 + " have the gas tank with " + car1.getCurrentCapacity() + " litres \n");
        System.out.println("The car " + car2 + " have the gas tank with " + car2.getCurrentCapacity() + " litres \n");

        car1.run(30);
        car2.run(300);

        System.out.println("The car " + car1 + " have the gas tank with " + car1.getCurrentCapacity() + " L of "
                + car1.getMaxFuel() + " L \n");

        System.out.println("O carro " + car2 + " have the gas tank with " + car2.getCurrentCapacity() + " L of "
                + car2.getMaxFuel() + " L \n");

    }
}
