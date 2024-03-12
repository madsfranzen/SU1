package OPG2;

public class Teacher extends Person {

    private double salary;

    public Teacher(String name, String address, String qualification, double salary) {

        super(name, address, qualification);
        this.salary = salary;
    }

    public void udskrivPerson(){
        super.udskrivPerson();
        System.out.println("Salary: $" + salary);
        System.out.println("Yearly Salary (including FeriePenge): $" + yearlySalary());
    }

    public double yearlySalary(){
        double yearlySalary = salary * 12;
        double feriePenge = salary * 12.5;
        return yearlySalary += feriePenge;
    }
}
