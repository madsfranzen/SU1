package OPG2;

public class Student extends Person {

	private double gradeAverage;
	private String studentId;

	public Student(String name, String address, String qualification, double gradeAverage, String studentId) {
		super(name, address, qualification);
		this.gradeAverage = gradeAverage;
		this.studentId = studentId;
	}

	public void udskrivAdresse() {
		System.out.println("Adresseoplysninger: " + address);
	}

	@Override
	public void udskrivPerson() {
		super.udskrivPerson();
		System.out.println("Gennemsnit: " + gradeAverage);
		System.out.println("model.Student identifikation: " + studentId);
	}

	// region # GETTER & SETTER #
	public double getGradeAverage() {
		return gradeAverage;
	}

	public void setGradeAverage(double gradeAverage) {
		this.gradeAverage = gradeAverage;
	}
	// endregion
}
