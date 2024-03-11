package assignments;

public class assignment_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=369;
		if(j%2==0)
		{
			System.out.println("number is even");
			if(j%8==0)
			{
				System.out.println("number is divisible by 8");
			}
			else {
				System.out.println("number is even but not divisible by 8");
			}
		}
		else {
			System.out.println("number is odd");
			if(j%9==0) {
				System.out.println("number is divisible by 9");
			}
			else {
				System.out.println("number is odd but not divisible by 9");
			}
		}
	}

}
