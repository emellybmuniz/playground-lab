public class Main {
    public static void main(String[] args) {
        // OffsetDateTime and LocalDateTime example
        java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.now();
        System.out.println("Current OffsetDateTime: " + offsetDateTime);

        java.time.LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
        System.out.println("Converted LocalDateTime: " + localDateTime);

        // Formatting OffsetDateTime
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss Z");
        String formattedDateTime = offsetDateTime.format(formatter);
        System.out.println("Formatted OffsetDateTime: " + formattedDateTime);

        // LocalDate and LocalTime example
        java.time.LocalDate localDate = java.time.LocalDate.now();
        java.time.LocalTime localTime = java.time.LocalTime.now();
        System.out.println("Current LocalDate: " + localDate);
        System.out.println("Current LocalTime: " + localTime);

        // Combining LocalDate and LocalTime to form LocalDateTime
        java.time.LocalDateTime combinedDateTime = java.time.LocalDateTime.of(localDate, localTime);
        System.out.println("Combined LocalDateTime: " + combinedDateTime);

        // .plus and .minus
        java.time.LocalDateTime futureDateTime = combinedDateTime.plusDays(5).minusHours(3);
        System.out.println("Future LocalDateTime: " + futureDateTime);

        // .isBefore, .isAfter, .isEqual
        System.out.println("Is combinedDateTime before futureDateTime? " + combinedDateTime.isBefore(futureDateTime));
        System.out.println("Is combinedDateTime after futureDateTime? " + combinedDateTime.isAfter(futureDateTime));
        System.out.println("Is combinedDateTime equal to futureDateTime? " + combinedDateTime.isEqual(futureDateTime)); 
        
        // .equals vs .isEqual
        // .equals checks for exact object equality, while .isEqual checks for value equality.

        // ofPattern and ofLocalizedDateTime
        java.time.format.DateTimeFormatter localizedFormatter = java.time.format.DateTimeFormatter.ofLocalizedDateTime(java.time.format.FormatStyle.MEDIUM);
        String localizedFormattedDateTime = combinedDateTime.format(localizedFormatter);
        System.out.println("Localized Formatted LocalDateTime: " + localizedFormattedDateTime);
    }
}
