package javaBasics;

public class WraperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		
		//data conversion: String to int
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		//String to double conversion.
		
		String y = "12.44";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		//String to Boolean
		
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		//int to String
		int j = 200;
		System.out.println(j+20);
		
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
//		
//		String u = "100A";
//		Integer.parseInt(u);
	}

}
