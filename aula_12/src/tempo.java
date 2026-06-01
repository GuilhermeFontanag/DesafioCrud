import java.time.LocalDate;
import java.time.LocalDateTime;

public class lerInt {
    static void main(String[] args) {
        LocalDate data = LocalDate.of(2025,12,25);
        LocalDate algo= LocalDate.of(2025,12,25);

        int ano = data.getYear();
         int mes = data.getMonthValue();
         int dia = data.getDayOfMonth();
        IO.println(data.isAfter(algo));
    }
}