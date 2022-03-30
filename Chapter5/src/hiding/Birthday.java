package hiding;

class Birth {
	public int day;
	public int month;
	public int year;
}

public class Birthday{
	public static void main(String[] args) {
		Birth day = new Birth();
		day.day = 2;
		day.month = 10;
		day.year = 2020;
	}
	
}
