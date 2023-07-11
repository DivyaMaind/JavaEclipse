package java8features;

public class Demo4 {

	public static void main(String[] args) {
		
	//multiple try blocks also allowed in java8
		try {

        }
        catch (ArithmeticException | NullPointerException ae) {
            // TODO: handle exception
        }
        catch (Exception e) {
            // TODO: handle exception
        }

	}

}
