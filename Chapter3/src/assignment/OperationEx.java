package assignment;

public class OperationEx {

	public static void main(String[] args) {
		int age = 24;
		System.out.println(age);
		
		int num = 10;
		int num2 = -num;
		System.out.println(num);
		System.out.println(num2);
		
		int a = 10;
		System.out.println(++a); //11
		System.out.println(a--); //11
		System.out.println(a); //10
		
		int n1 = 10;
		int n2 = 5;
		boolean flag = (n1 > n2);
		System.out.println(flag);
		
		int i = 10;
		int j = 2;
		boolean value = ((i = i + 10) < 10) && ((j = j + 2) > 10);;
		System.out.println(value);
		System.out.println(i);
		System.out.println(j); //not 4
		
	}

}
