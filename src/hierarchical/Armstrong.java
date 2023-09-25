package hierarchical;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter nunber to for armstrong ");
		int number = scan.nextInt();
		
		int a,temp,sum=0;
		temp=number;
		
		while(temp>0) {
			a=temp%10;
			temp=temp/10;
			sum=sum +(a*a*a);
			
			
		}
		if (number == sum) {
			System.out.println(number +" is armstrong number");
			
		}
		else {
			System.out.println(number +" is not armstrong number");
		}
	}
}