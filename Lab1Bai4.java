package Lab1;
import java.util.*;
import java.io.*;
import java.math.*;
public class Lab1Bai4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập a:");
		double a = sc.nextDouble();
		System.out.println("Nhập b:");
		double b = sc.nextDouble();
		System.out.println("Nhập c:");
		double c = sc.nextDouble();
		double delta;
		System.out.println("Delta:"+(delta=Math.pow(b,2)-4*a*c));
		System.out.println("Căn Delta:"+(Math.sqrt(delta)));
	}
}
