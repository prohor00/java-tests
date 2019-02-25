public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		int minus = first - second;
		int multiply = first * second;
		int share = first / second;
		System.out.println("sum = " + sum);
		System.out.println("minus = " + minus);
		System.out.println("multiply = " + multiply);
		System.out.println("share = " + share);
	}	
}