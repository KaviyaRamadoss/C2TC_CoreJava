package com.TNS.day1;

public class FirstProgram {
	 public static void main(String args[]) {
	 int g = 5;
	 int b = 6;
	 int c = g+b;
	
	 System.out.println("add " +c);
	 //relational operator
	 if(g==b)
		 System.out.println("g equal to b");
	 else
		 System.out.println("not equal");
	 
	 //INC AND DEC
	 int n1= 5;
     int n2= ++n1;  // Pre-increment: 'a' is incremented first, then 'b' is assigned the value of 'a'
     System.out.println("Pre-increment: n1 = " + n1+ ", n2= " + n2);  // Output: a = 6, b = 6

     int n3 = 5;
     int n4= n3++;  // Post-increment: 'd' is assigned the value of 'c', then 'c' is incremented
     System.out.println("Post-increment: n3= " + n3 + ", n4= " + n4);  // Output: c = 6, d = 5
     //assignment
     int a = 10;  // Assigns 10 to variable 'a'
     System.out.println("a = " + a);  // Output: a = 10

     // Compound assignment operators
     a += 5;  // Equivalent to a = a + 5
     System.out.println("a += 5: " + a);  // Output: a = 15

     a -= 3;  // Equivalent to a = a - 3
     System.out.println("a -= 3: " + a);  // Output: a = 12

     a *= 2;  // Equivalent to a = a * 2
     System.out.println("a *= 2: " + a);  // Output: a = 24

     a /= 4;  // Equivalent to a = a / 4
     System.out.println("a /= 4: " + a);  // Output: a = 6

     a %= 5;  // Equivalent to a = a % 5
     System.out.println("a %= 5: " + a);  // Output: a = 1
     
     //ternary
     int m1 = 10;
     int m2 = 20;

     // Using the ternary operator to find the maximum of two numbers
     int max = (m1 > m2) ? m1 : m2;
     System.out.println("The maximum of " + m1 + " and " + m2 + " is: " + max);  // Output: 20



	 
	 
}
	 
}