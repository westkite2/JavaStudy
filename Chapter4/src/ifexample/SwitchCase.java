package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 1;
		String medalColor = "Gold";
		
		switch(rank) {
			case 1:
				medalColor = "Gold";
				break;
			case 2:
				medalColor = "Silver";
				break;
			case 3:
				medalColor = "Bronze";
				break;
			default: medalColor = "A";
		}
		System.out.println(rank + "���� �޴�: " + medalColor);
		
		int month = 10;
		int day;
		switch (month) {
		case 1: case 3: case 5: case 7: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default:
			day = 0;
			break;
		}
		System.out.println(month + "��: " + day + "��");
	}

}
