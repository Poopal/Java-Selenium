package JavaPractice;

public class maxMultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		
		1 2 3
		4 5 6
		7 8 9
		
		*/
		
		int def[][]= {{1,2,3}, {4,5,6},{7,8,9}};
		int max=def[0][0]; 
		
		for(int i=0; i<3;i++)
			
		{
			for (int j=0;j<3;j++)
				
			{
				if (def[i][j]>max)
				{
					max=def[i][j];
				}
			}
		}
		
		System.out.println(max);
	}

}
