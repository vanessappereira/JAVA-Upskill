package IndependentWork6.Ex3;

public class Person {
    private String firstName, lastName, morada, nacionalidade;
    private int idade;

    //Constructor
    public Person(String firstName, String lastName, int idade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idade = idade;
    }

    // Imprime o nome completo seguido de idade
    public String toString() {
        return "Nome: " + this.getFirstName() + " " + this.getLastName() + " Idade: " + this.getIdade();
    }

    ////////////////////////////    SETS    ////////////////////////////
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    ////////////////////////////    GETS    ////////////////////////////

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdade() {
        return idade;
    }

    public String getMorada() {
        return morada;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}

