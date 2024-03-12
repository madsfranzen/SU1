package GrønneFingre;

public class Bonsai extends Plante{

    private int beskæring;
    private int planteHøjde;
    private int planteDybde;

    public Bonsai(String name, String latinName, int beskæring, int planteHøjde, int planteDybde){
        super(name, latinName);
        this.beskæring = beskæring;
        this.planteHøjde = planteHøjde;
        this.planteDybde = planteDybde;
    }

    public void printPlant(){
        super.printPlant();
        System.out.println("Beskæring: " + beskæring);
        System.out.println("Plantehøjde: " + planteHøjde);
        System.out.println("Plantedybde: " + planteDybde);
    }
}
