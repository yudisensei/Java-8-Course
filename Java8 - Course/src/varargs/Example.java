package varargs;

public class Example {

	public static void main(String[] args) {
		
		System.out.println(sum(1,23));// you can input as many numbers as you want
		
	}

	// Varargs needs to use ... between the data type and a parameter	as vector
	static int sum(int...notes) {// obs: Notes is converted to an integer type array 
		int totalSum =0;
		for(int num:notes) {
			totalSum+=num;
		}
		return totalSum; // return a total sum of all elements in a array notes
	}

}
