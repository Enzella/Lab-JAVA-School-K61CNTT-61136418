package Lab1;
import java.io.*;
import java.util.*;
import java.math.*;
public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập chiều dài:");
		double dai = sc.nextDouble();
		System.out.println("Nhập chiều rộng: ");
		double rong = sc.nextDouble();
		System.out.println("Chu vi: "+(dai+rong)/2);
		System.out.println("Diện tích:"+(dai*rong));
		System.out.println("Cạnh nhỏ nhất:"+Math.min(dai, rong));
		
	}

}
