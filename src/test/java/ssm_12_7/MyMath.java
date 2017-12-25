package ssm_12_7;

import java.util.Scanner;

import org.junit.Test;

public class MyMath {

	public static int add(int x, int y) {
		return x + y;
	}

	public static int subStract(int x, int y) {
		return x - y;
	}

	public static int myltiply(int x, int y) {
		return x * y;
	}

	public static int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("+是：" + add(x, y));
		System.out.println("-是：" + subStract(x, y));
		System.out.println("*是：" + myltiply(x, y));
		System.out.println("/是：" + divide(x, y));
	}
	
	@Test
	public void test1(){
		String url = "www.baidu.com";
		System.out.println(url.substring(url.lastIndexOf(".")));
	}

}
