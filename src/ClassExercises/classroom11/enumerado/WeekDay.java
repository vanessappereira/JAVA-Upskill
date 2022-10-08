package Aula11.enumerado;

public enum WeekDay {
    Monday("Mon"), Tuesday("Tue"), Wednesday("Wed"),
    Thursday("Thu"), Friday("Fri"), Saturday("Sat"), Sunday("Sun");

    private String abr;

    private WeekDay(String abr){

        this.abr=abr;
    }

    public String getAbr() {

        return abr;
    }
}
