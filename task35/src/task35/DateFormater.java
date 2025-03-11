package task35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class DateFormater {
    public static Optional<String> getFormattedDate() {
        try {
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return Optional.of(currentDate.format(formatter));
        } catch (Exception e) {
            return Optional.empty(); // Return an empty Optional in case of any exception
        }
    }

    public static void main(String[] args) {
        Optional<String> formattedDate = getFormattedDate();
        formattedDate.ifPresent(date -> System.out.println("Formatted Date: " + date));
    }
}

