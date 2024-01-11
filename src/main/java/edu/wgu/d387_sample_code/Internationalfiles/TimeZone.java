package edu.wgu.d387_sample_code.Internationalfiles;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class TimeZone {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public static String timeZones(){
        ZonedDateTime etTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime mtTime = etTime.withZoneSameInstant(ZoneId.of("America/Phoenix"));
        ZonedDateTime utcTime = etTime.withZoneSameInstant(ZoneId.of("UTC"));

        String etFormattedTime = etTime.format(formatter);
        String mtFormattedTime = mtTime.format(formatter);
        String utcFormattedTime = utcTime.format(formatter);


        return "ET: " + etFormattedTime + ", MT: " + mtFormattedTime + ", UTC: " + utcFormattedTime;


    }
}
