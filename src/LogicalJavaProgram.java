
public class LogicalJavaProgram {
	
	public static void main(String[] args) {
		//Reverse the String
		
		String s="Automation Engineer";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			r=r+s.charAt(i);
			
		}
		System.out.println(r);
		
		if(s.equalsIgnoreCase(r)) {
			System.out.println("String is pallindrome");
		}else {
			System.out.println("String is not Pallindrone");
		}
		
		
		
	}

}
