package P3;

public class StringDemo {

	public static void main(String[] args) {
		
		String name="Divya is trainee";
		System.out.println("Name");
		
		String s = new String("Diksha");
		System.out.println(s);
		
		System.out.println(" My Name is :"+name.toUpperCase());
		System.out.println(" My Name is"+name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.trim().length());
		System.out.println(""+name.replace("D","Z"));
		System.out.println(s.startsWith("D"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.concat(name));
		System.out.println(s.equals("diksha"));
		System.out.println(s.equalsIgnoreCase("diksha"));
		System.out.println(s.charAt(2));
		
	}

}
