package ObjectClass;

public class Patient {
	
	private String patientName;
	private double height;
	private double weight;
	
	public Patient(String patientName, double height, double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double computeBMI() {
		return (weight / height)*height;
		
	}
	
	public static void main(String[] args) {
		
		
		Patient pat= new Patient("Ram", 5.9, 70);
		
		double result=pat.computeBMI();
		System.out.println("Result ->"+result);
		
	}

}
