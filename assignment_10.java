package assignments;

import java.util.Scanner;

public class assignment_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter age");
		int age = s1.nextInt();
		if(age>=18)
		{
			System.out.println("person is an adult");
		}
		else if(age<=10) {
			System.out.println("person is child");
		}
		else
		{
			System.out.println("person is adolescent");
		}
	}

	}


