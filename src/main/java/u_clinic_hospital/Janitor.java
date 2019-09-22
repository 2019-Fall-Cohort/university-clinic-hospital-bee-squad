package u_clinic_hospital;

public class Janitor extends Employee {

	int salary = 40000;
	private boolean sweeping;

	public Janitor(String name) {
		super(name);
	}

	public boolean getSweeping() {
		return sweeping;
	}

	public void setSweeping(boolean b) {
		this.sweeping = b;
	}

	public int getSalary() {
		return salary;
	}
}
