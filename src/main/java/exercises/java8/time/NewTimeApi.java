package exercises.java8.time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static exercises.Exercise.TODO;

public class NewTimeApi {

     /**
      * Return the day after 2024-2-28
      */
    public LocalDate nextDay() {
        //return LocalDate.of(2024, 2, 28).plusDays(1);
        return TODO("Return the day after 2024-2-28");
    }

    /**
     * Which day of the week is 2024-2-29?
     */
    public DayOfWeek dayOfWeek() {
        //return LocalDate.of(2024, 2, 29).getDayOfWeek();
        return TODO("find the 'DayOfWeek' of 2024-2-29");
    }

    /**
     * The Unix timestamp measures the number of (mili) seconds since Jan. 1st, 1970. 0:00:0 UTC.
     * Which day of the week was that?
     */
    public DayOfWeek epochDayOfWeek() {
        Instant epoch = TODO("create an Instant of the Unix epoch");
        return TODO("return the DayOfWeek");

//        return ZonedDateTime.ofInstant(epoch, ZoneOffset.UTC)
//                .getDayOfWeek();
    }

    /**
     * How many days are there between Christmas in 2023 and Easter in 2024?
     */
    public long daysBetweenChristmasAndEaster() {
        return TODO("calculate the number of days");

//        LocalDateTime christmas = LocalDate.of(2023, 12, 24)
//                .atStartOfDay();
//
//        LocalDateTime easter = LocalDate.of(2024, 3, 31)
//                .atStartOfDay();
//
//        return Duration.between(christmas, easter).toDays();
    }
}
