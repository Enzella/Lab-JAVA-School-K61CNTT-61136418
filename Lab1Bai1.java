package Lab1;
import java.io.*;
import java.util.*;
import java.math.*;

public class Lab1Bai1 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Nhập họ và tên:");
	String hoten = sc.nextLine();
	System.out.print("Nhập điểm TB: ");
	double diemTB = sc.nextDouble();
	System.out.println("Họ và tên:"+hoten);
	System.out.print("Điểm trung bình: "+diemTB);
	}
}
