package ClassExercises.classroom11.enumerado;

public class Main {

    public static void main(String[] args) {
        WeekDay wd = WeekDay.valueOf("Monday");
     /*   System.out.println(wd);

        System.out.println(wd.name()); //Monday
        System.out.println(wd.ordinal());//0
*/
        WeekDay[] week = WeekDay.values();
        for(int i =0; i<week.length; i++){
            System.out.println(week[i].name());
           // System.out.println(week[i].getAbr());
        }


    }
}
