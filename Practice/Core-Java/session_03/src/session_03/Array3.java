package session_03;

public class Array3 {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{12,32,44}};
		
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
