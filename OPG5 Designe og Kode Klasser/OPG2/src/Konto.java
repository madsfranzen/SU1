public class Konto {
    private int nr;
    private int saldo;
    private String kontoType;
    private String status;

    public Konto(String kontoType, int nr){
        this.kontoType = kontoType;
        this.nr = nr;
        saldo = 0;
        status = "open";
    }

    public void indsætBeløb(int beløb){
        if (status == "open") {
            saldo += beløb;
        }
    }

    public void hævBeløb(int beløb){
        if (status == "open") {
            saldo -= beløb;
        }
    }

    public void lukKonto(){
        status = "closed";
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getKontoType() {
        return kontoType;
    }

    public void setKontoType(String kontoType) {
        this.kontoType = kontoType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
