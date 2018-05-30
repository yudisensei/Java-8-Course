package comparable;

/**
 * Using in a class Employee, the interface comparable, which will be compare
 * objects from this class
 * 
 * @author yudisensei
 * @category Entity
 * @version 1.0
 */
public class Employee implements Comparable {

	private String job;
	private double salary;

	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String job, double salary) {
		super();
		this.job = job;
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**@category compare Objects
	 * @param o - received a object variable to Compare
	 * @return -1 = if the object being compared is less than the compared object
	 * 			0 = if the object being compared is same the compared object
	 * 			+1 = if the object being compared is larger than the compared object
	 * Converted o To a instance of Employee 
	 * */
	
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		
		if(getSalary()>e.getSalary()) {
			return 1;
		}else if(getSalary()==e.getSalary()) {
			return 0;
		}else {
			return -1;
		}
		
	
	}

}
