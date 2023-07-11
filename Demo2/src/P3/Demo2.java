package P3;

public class Demo2 {

	public static void main(String[] args) {
		
		String s = new String("Diksha");
		System.out.println(s);
		
		s.concat("Maind");
		System.out.println(s);
		
		s= s.concat("Maind");
		System.out.println(s);
		
		//its  thread safe : one will exceute
		StringBuffer sb = new StringBuffer("XYZ");
		sb.append("ABC");
		System.out.println(sb);
		
		sb.insert(0, "BC");
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		//thread not safe
		StringBuffer sbl= new StringBuffer("PQR");
		sb.append("ABC");
		System.out.println(sbl);
	

	}

	

}
