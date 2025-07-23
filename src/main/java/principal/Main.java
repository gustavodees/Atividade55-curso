package principal;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.Duration;


public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pasWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocaDate = d01.plusDays(7);



        System.out.println("pasWeekLocalDate = " + pasWeekLocalDate);
        System.out.println("nextWeekLocaDate = " + nextWeekLocaDate);

        System.out.println("###############################################");
        LocalDateTime pasWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocaDateTime = d02.plusDays(7);


        System.out.println("pasWeekLocalDateTime = " + pasWeekLocalDateTime);
        System.out.println("nextWeekLocaDateTime = " + nextWeekLocaDateTime);
        System.out.println("###############################################");

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println("###############################################");

        Duration t1 = Duration.between(pasWeekLocalDateTime, d02);
        Duration t2 = Duration.between(pasWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d03);
        Duration t4 = Duration.between(d03,pastWeekInstant );
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());


        System.out.println("###############################################");




    }
}