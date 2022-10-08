package Aula6Objectos.Aulas;

public class Objectos {

    public class Person {
        private String FName;
        private String LName;

        public Person(String FName, String LName) {
            this.FName=FName;
            this.LName=LName;
        }

        public String getFName() {
            return FName;
        }

        public void setFName(String FName) {
            this.FName = FName;
        }

        public String getLName() {
            return LName;
        }

        public void setLName(String LName) {
            this.LName = LName;
        }
    }
}
