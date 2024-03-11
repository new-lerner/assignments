package assignments;

public class assignment_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double count = 0;
		double sum = 0;
		double avg = 0;
		for(i=1;i<11;i++)
		{
			count++;
			sum=sum+i;
		}
		System.out.println("sum is "+sum);
		avg=sum/count;
		System.out.println("average is "+avg);
	}

}
