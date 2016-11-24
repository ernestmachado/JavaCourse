package ASSIGNMENTS;
//Write a program to print the sum of two numbers without using + operator. Other operators have to be used.
public class Assignment1_1 {

	public static void main(String[] args) 
	{
		int a = 25;
		int b = 16;
	
		int carry;
        while(b!=0)
        {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
    
	System.out.println(a);
	}

}
