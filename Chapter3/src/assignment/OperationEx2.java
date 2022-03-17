package assignment;

public class OperationEx2 {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1 += 1);
		System.out.println(num1 %= 10);
		
		int num2 = (5>3) ? 10:20;
		System.out.println(num2);
		
		int num3 = 5; //0101
		int num4 = 10; //1010
		int result = num3 & num4; //0000
		System.out.println(result);
		
		int num5 = 5;
		System.out.println(num5 << 1); //*2
		System.out.println(num5 << 3); //*8
		System.out.println(num5);
		System.out.println(num5 <<= 1);
		System.out.println(num5);
		
		System.out.println(num5 >> 1);
	}
}
