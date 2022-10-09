package ClassExercises.classroom11.Ex3;

public enum weekDay {
    Monday(2), Tuesday(3), Wednesday(4), Thursday(5),
    Friday(6), Saturday(7), Sunday(1);
    private int dia;
    private boolean isWeekDay;
    private boolean isWeekEnd;

    weekDay(int dia) {
        this.dia = dia;

    }
    public int getDia() {
        return dia;
    }
//usar comparador
    public boolean isWeekDay() {
        if (getDia() >= 2 && getDia() >= 6) {
            System.out.println("Dia de Semana");
            return true;
        }
        return false;
    }
    public boolean isWeekEnd(){
        if (getDia() == 7){
            System.out.println("Fim de Semana");
            return true;
        }
        if (getDia()==1) {
            System.out.println("Fim de Semana");
        }
            return true;
    }
}
