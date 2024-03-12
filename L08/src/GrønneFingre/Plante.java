package GrønneFingre;

public class Plante {
    private String name;
    private String latinName;

    public Plante(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public void printPlant(){
        System.out.println("Name: " + name);
        System.out.println("Latin Name: " + latinName);
    }
}
