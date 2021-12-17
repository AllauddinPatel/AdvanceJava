package java8;

import java.time.*;
import java.util.Date;

public class localDateTimeDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());
        Date obj = new Date(1639737919019L);
        System.out.println(obj);


        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.minusDays(1));
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

        ZoneId zoneId=ZoneId.of("Europe/Paris");
        LocalDate localDate1=LocalDate.now(zoneId);
        System.out.println(localDate1);

        LocalDateTime localDateTime=LocalDateTime.now(zoneId);
        System.out.println(localDateTime);

        LocalDate from=LocalDate.of(2021,12,22);
        LocalDate to=LocalDate.of(2022,10,10);
        Period period=Period.between(from,to);
        System.out.println(period);


        LocalTime fromtime = LocalTime.of(22,40,57);
        LocalTime totime = LocalTime.of(11,20,22);
        Duration duration=Duration.between(fromtime,totime);
        System.out.println(duration);
    }
}
