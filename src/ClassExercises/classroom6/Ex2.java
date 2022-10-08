package Aula6Objectos.Aulas;

public class Ex2 {
        public static class Person {
            private String FirstName, LastName,Address, Nationality;
            private int Age;

            public String getFirstName() {
                return FirstName;
            }

            public void setFirstName(String firstName) {
                FirstName = firstName;
            }

            public String getLastName() {
                return LastName;
            }

            public void setLastName(String lastName) {
                LastName = lastName;
            }

            public String getAddress() {
                return Address;
            }

            public void setAddress(String address) {
                Address = address;
            }

            public String getNationality() {
                return Nationality;
            }

            public void setNationality(String nationality) {
                Nationality = nationality;
            }

            public int getAge() {
                return Age;
            }

            public void setAge(int age) {
                Age = age;

            }

            @Override
            public String toString() {
                return "Person{" +
                        "FirstName='" + FirstName + '\'' +
                        ", LastName='" + LastName + '\'' +
                        ", Age=" + Age +
                        '}';
            }

            public Person(String FirstName, String LastName, int Age) {
                this.FirstName = FirstName;
                this.LastName = LastName;
                this.Age = Age;
                this.Address = "";
                this.Nationality = "";


            }
            public static void main(String[] args) {
                Ex1.Person p1 = new Ex1.Person("Maria", "Silva", 60) ;

                System.out.println(p1);
            }
        }
    }
/*
System.out.println(p1)podera aparecer como Person@idsvsv51
neste caso colocar System.out.println(p1.toString())
 */

