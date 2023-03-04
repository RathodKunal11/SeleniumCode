package SeleniumPractice;

public class ExceptionHandlingInJava {
	
	public static void main(String[] args) {
		
		int i=50;
		 try {
			 System.out.println(i/0);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
