package JavaPractice;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="SandeshPoonam";
		String t="";
		
		for (int i=s.length()-1;i>=0;i--)
			
		{
			System.out.print(s.charAt(i));
			
			t=t+ s.charAt(i);
			
		}
		
		if (s==t)
			
		{
			System.out.println("String is palindrome");
		}
		
		else
		{
			System.out.println("String is not palindrome");
			
		}
	}

}
