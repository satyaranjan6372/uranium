package patterns;

public class P1 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)// for no of rows 
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==0 || j==n-1 || i==n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}