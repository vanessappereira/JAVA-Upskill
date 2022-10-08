package IndependentWork6.ex3_addCar;

public class Person {
    private String firstName, lastName, address, nationality;
    private int age;

    //Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Imprime o nome completo seguido de age
    public String toString() {
        return "Name: " + this.getFirstName() + " " + this.getLastName() + " Age: " + this.getAge();
    }

    ////////////////////////////    SETS    ////////////////////////////
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    ////////////////////////////    GETS    ////////////////////////////

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }
}

