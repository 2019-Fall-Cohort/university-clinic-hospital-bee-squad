package u_clinic_hospital;

public class Janitor extends Employee {

	private int salary = 40000;
	private boolean sweeping = true;

	public Janitor(String name) {
		super(name);
	}

	public int getSalary() {
		return salary;
	}

	public boolean getSweeping() {
		return sweeping;
	}

	public void setSweeping(boolean b) {
		this.sweeping = b;
	}

}
