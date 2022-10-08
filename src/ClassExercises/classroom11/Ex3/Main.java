package TA11.Ex3;

public class Main {
    public static void main(String[] args) {
        weekDay[] week = weekDay.values();
        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i].name());
            System.out.println(week[i].isWeekDay());
       //   System.out.println(week[i].isWeekEnd());
        }
    }
}
