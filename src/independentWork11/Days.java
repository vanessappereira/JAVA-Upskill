package independentWork11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Days {
    public static void main(String[] args) {

        // Get DayOfWeek enums value
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        for (int i = 0; i < dayOfWeeks.length; i++) {
            DayOfWeek dayOfWeek = dayOfWeeks[i];
            System.out.println("dayOfWeek[" + i + "] = " + dayOfWeek + "; value = " + dayOfWeek.getValue());
        }
        // Get DayOfWeek of a date object
        LocalDate date = LocalDate.now();
        DayOfWeek dow = date.getDayOfWeek();
        // Get DayOfWeek display name in different locale.
        Locale locale = new Locale("id", "ID");
        String indonesian = dow.getDisplayName(TextStyle.SHORT, locale);
        System.out.println("ID = " + indonesian);

        String english = dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("EN = " + english);
    }
}



