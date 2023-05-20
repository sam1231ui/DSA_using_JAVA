package assign.queueDynamic;

public class Emp {
	private int id;
	private String name;
	private double sal;
	
	public Emp() {
		this.id = -1;
		this.name = "empty";
		this.sal = 0;
	}
	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
