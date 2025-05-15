package com.learning.examples.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.SneakyThrows;

public class DateExample {

  @SneakyThrows
  public static void main(String[] args) throws InterruptedException {
    //        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    //        System.out.println(date);
    //        LocalDate localDate = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    //        System.out.println(localDate);
    //        localDate = localDate.plusMonths(1);
    //        System.out.println(localDate);

    //        LocalDate localDate = LocalDate.now();
    //        LocalDate nextInstallmentDate =
    // LocalDate.parse("02-08-2022",DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    //        int result = localDate.compareTo(nextInstallmentDate);
    //
    //        long results = DAYS.between(localDate, nextInstallmentDate);
    //        System.out.println(results);

    //    System.out.println(Instant.now());
    //    System.out.println(ZonedDateTime.now());
    //    System.out.println(LocalDateTime.now());
    //    System.out.println(LocalDate.now());
    //    System.out.println(LocalDateTime.now(ZoneId.of("Asia/Calcutta")));
    //    System.out.println("-----------------------");
    //    LocalDateTime d1 = LocalDateTime.now();
    //    Thread.sleep(1000);
    //    LocalDateTime d2 = LocalDateTime.now();
    //    System.out.println(d1);
    //    System.out.println(d2);
    //    System.out.println(d1.compareTo(d2));
    //    System.out.println("-----------------------");
    //    System.out.println(ZoneId.systemDefault());
    //    System.out.println(ZoneId.of("Asia/Calcutta"));
    //    System.out.println(ZoneId.of("Asia/Calcutta").getId());
    //    LocalDate date1 = LocalDate.parse("05-03-1995",
    // DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    //    System.out.println(date1);
    //    System.out.println(date1.atStartOfDay());
    //    Integer i = 5;
    //    System.out.println(LocalDate.now());
    //    System.out.println(Instant.parse(LocalDate.now().atStartOfDay().withHour(6) + ":00.00Z"));
    //    System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
    //    System.out.println(LocalDate.now().atStartOfDay().withHour(6));
    //    System.out.println(
    //        Instant.parse(LocalDate.now().atStartOfDay().withHour(6).toLocalTime().toString()));

    //    Instant now = Instant.now();
    //    Instant otherInstant = now.plusSeconds(1);
    //    Instant otherInstantOther = now.minusSeconds(1);
    //    assertThat(now, is(greaterThan(otherInstantOther)));
    //    assertThat(now, is(lessThan(otherInstant)));
    //    assertThat(now, is(lessThan(otherInstantOther)));
    //    assertThat(now, is(otherInstant));

    //    Instant now = Instant.now();
    //    System.out.println(Duration.between(now, now.plusSeconds(5)).getSeconds());

    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
    System.out.println(new SimpleDateFormat("ddMMM").format(sdf.parse("111220")));
    LocalDate dat = (LocalDate) DateTimeFormatter.ofPattern("ddMMyy").parse("111220");
    System.out.println(DateTimeFormatter.ofPattern("ddMMyy").format(LocalDate.now()));
  }
}
