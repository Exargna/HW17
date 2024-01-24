import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wine wine = new Wine("Чертополох", "Грузинья",
                "Швеция", "Аристократичный вкус",
                LocalDate.of(2001, 1, 15));
        wine.winePeriod(LocalDate.now());
    }
}