import java.time.LocalDate;

public class Transaktion {
    private int amount;
    private LocalDate date;

    public Transaktion(int amount){
        this.amount = amount;
        date = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Transaktion{" +
                "amount=" + amount +
                ", date=" + date +
                '}';
    }
}
