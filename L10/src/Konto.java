import java.util.ArrayList;

public class Konto {
    private int ID;
    private double saldo = 0;
    private Kontotype kontotype;
    private ArrayList<Transaktion> transactions = new ArrayList<>();
    private static int idCount = 1;

    public Konto(Kontotype kontotype){
        this.kontotype = kontotype;
        this.ID = idCount++;
    }

    public void indæstBeløb(int amount){
        Transaktion transaktion = new Transaktion(amount);
        transactions.add(transaktion);
        saldo += amount;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "ID=" + ID +
                ", saldo=" + saldo +
                ", kontotype=" + kontotype.getName() +
                ", transactions=" + transactions +
                '}';
    }
}
