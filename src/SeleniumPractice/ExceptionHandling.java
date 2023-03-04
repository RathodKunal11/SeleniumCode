package SeleniumPractice;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		String a="1583";
				try {
				int i = Integer.parseInt(a);
				System.out.println(i);
				}catch(ArithmeticException e) {
					e.printStackTrace();
				}catch(Exception e) {
					e.printStackTrace();
				}
	}

}
