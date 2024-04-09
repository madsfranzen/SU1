public class App {
    public static void main(String[] args) {


        Kontotype opsparing = new Kontotype("Opsparing", "Opsparingskonto med højere rente.");
        Kontotype forbrug = new Kontotype("Forbrug", "Forbrugskonto, Ingen rente.");

        Konto madsOpsparing = new Konto(opsparing);
        Konto jakobOpsparing = new Konto(forbrug);

        System.out.println(madsOpsparing.toString());
        madsOpsparing.indæstBeløb(200);
        jakobOpsparing.indæstBeløb(25000);

        System.out.println(madsOpsparing.toString());
        System.out.println(jakobOpsparing.toString());


    }
}
