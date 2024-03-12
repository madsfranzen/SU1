package OPG2;

public class NedarvningTest {

	public static void main(String[] args) {

		System.out.println("model.Person:");

		Person person = new Person("Hanne", "Sydbakken 27", "Datalog");

		Student student = new Student("Margrethe", "Ringvej 7", "STX", 9.5, "DMU01");

		Teacher teacher = new Teacher("Bob", "Bygvej 21","None", 35000);

		teacher.udskrivPerson();
	}
}
