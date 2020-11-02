package exercise2;

import java.util.*;
public class exercise2 {
	
	public static void main(String[] args) {
	
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
		exercise7();
		exercise8();
		exercise9();
		exercise10();
		
		
		
	}
	
	public static void exercise1() {
		//7
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input a number: ");
		int num = in.nextInt();
		for (int i=0;i<10;i++) {
			System.out.println(num + "x" + (i+1) + "=" + (num*(i+1)));
	}

	}

	public static void exercise2() {
		//11
		Scanner in = new Scanner (System.in);
		
		double radius = 9.18;
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("Perimeter is " + perimeter);
		System.out.println("Area is " + area);
	
	}
	
	public static void exercise3() {
		//13
		Scanner in = new Scanner (System.in);
		
		double w = 6.5;
		double h = 8.4;
		double perimeter = 2*(w+h);
		double area = w * h;
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", h ,w ,perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f \n", h , w, area);
				
	}
	
	public static void exercise4() {
		//55
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input seconds: ");
		int sec = in.nextInt();
		int s1 = sec % 60;
		int s2 = sec / 60;
		int s3 = s2 % 60;
		s2 = s2 /60;
		System.out.println(s2 + ":" + s3 + ":" + s1);
		
	}
	
	public static void exercise5() {
		//12
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input 1st number: ");
		int num1 = in.nextInt();
		System.out.print("Input 2nd number: ");
		int num2 = in.nextInt();
		System.out.print("Input 3rd number: ");
		int num3 = in.nextInt();
		System.out.println("Average is: " + (num1 + num2 +num3)/3);
				
	}
	
	public static void exercise6() {
		//15
		Scanner in = new Scanner (System.in);
		
		int a, b, temp;
		a = 12;
		b = 87;
		System.out.println("Before swapping: a, b = "+a+"," + + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping: a, b = " +a+ "," + + b);
		
	}
	
	public static void exercise7() {
		//5
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input 1st number: ");
		int num1 = in.nextInt();
		System.out.print("Input 2nd number: ");
		int num2 = in.nextInt();
		System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
			
	}
	public static void exercise8() {
		//32
		Scanner in = new Scanner (System.in);
		
		/* ==:equal to
		 * !=: not equal to
		 * <:less than
		 * >:more than
		 * <=:less or equal to
		 *>=:more or equal to
		 */
		System.out.print("Input 1st number: ");
		int num1 = in.nextInt();
		System.out.print("Input 2nd number: ");
		int num2 = in.nextInt();
		
		if (num1 == num2)
			System.out.printf("%d == %d\n", num1, num2);
		if (num1 != num2)
			System.out.printf("%d != %d\n", num1, num2);
		if (num1 < num2)
			System.out.printf("%d < %d\n", num1, num2);	
		if (num1 > num2)
			System.out.printf("%d > %d\n", num1, num2);
		if (num1 >= num2)
			System.out.printf("%d >= %d\n", num1, num2);			
		if (num1 <= num2)
			System.out.printf("%d <= %d\n", num1, num2);
	}
	
	public static void exercise9() {
		//6
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input 1st number: ");
		int num1 = in.nextInt();
		System.out.print("Input 2nd number: ");
		int num2 = in.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "+" + num2 + "=" + (num1/num2));
		System.out.println(num1 + "mod" + num2 + "=" + (num1%num2));
		
	}
	
	public static void exercise10() {
		//50
		Scanner in = new Scanner (System.in);
		
		System.out.println("\nDivided by 2:");
		for (int i=1;i<50;i++) {
			if (i%2==0)
			System.out.print(i + ",");
		}
		System.out.println("\nDivided by 5:");
		for (int i=1;i<50;i++) {
			if (i%5==0)
			System.out.print(i + ",");
		}
		System.out.println("\nDivided by 10:");
		for (int i=1;i<50;i++) {
			if (i%10==0)
			System.out.print(i + ",");
		}
		
		
	}
}
