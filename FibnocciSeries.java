//Implimenting a java program using FibnocciSeries 
//package declaration
package apjfsa;
import java.util.Scanner;
//class declaration
public class FibnocciSeries { 
         //main function
	public static void main(String[] args) {
		//instance variable
		int num1,num2,num3,range;
	    int i=1;
		num1=0;
		num2=1; 
		System.out.print("Enter range value :");
		//reading input for range  from console
		Scanner sc=new Scanner(System.in);
		range=sc.nextInt();
		System.out.print(num1+"\t"+num2);
		range-=2; 
		//while loop
		while(i<=range) { 
			num3=num1+num2;
			System.out.print("\t"+num3);
			num1=num2;
			num2=num3;
			i++;
		}

	}

}
