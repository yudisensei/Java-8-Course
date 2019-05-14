package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee e = new Employee("Director",50000.00);
		Employee e1 = new Employee("Project Manager",35000.00);
		Employee e2 = new Employee("Manager",25000.00);
		Employee e3 = new Employee("Developer Senior",15000.00);
		Employee e4 = new Employee("Intern",3500.00);
		
		employees.add(e);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
	
		//Collections.sort(employees,Collections.reverseOrder());
		
			
		// Testing Comparable
		for(int l=0;l<employees.size();l++) {
			for(int j=0;j<employees.size();j++) {
				int i = employees.get(l).compareTo(employees.get(j));
				if(i>0) {
					employees.set(l, employees.get(l));
				}else {
					employees.set(j, employees.get(j));
				}
			}
		}
		for(Employee emp : employees) {
			System.out.println("Employee: "+emp.getJob()+"\nSalary: "+emp.getSalary());
		}

	}
		

}
