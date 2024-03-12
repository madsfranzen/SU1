package OPG2;

public class Person
{

    private String name;
    protected String address;
    private String qualification;

    public Person(String name, String address, String qualification)
    {
        this.name = name;
        this.address = address;
        this.qualification = qualification;
    }

    public void udskrivPerson() {
        System.out.println("Navn: " + name);
        System.out.println("Adresse: " + address);
        System.out.println("Kvalifikation: " + qualification);
    }

    // region # SETTER & GETTER #
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    // endregion
}
