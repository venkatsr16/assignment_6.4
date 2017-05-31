package exception;
class TestException {
	static void validate(int age) throws NegativeAgeException {
		if(age<0)
			throw new NegativeAgeException("Age is negative. Enter positive values");
		else
			System.out.println("No problem.Go ahead");
	}
	public static void main(String args[]) {
	try {
		validate(-5);
		// validate(23);
	} catch(Exception e) {
		System.out.println("Exception occurred "+e);
	}
	System.out.println("Good Bye");
   }
}