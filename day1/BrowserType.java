package week1.day1;

public class BrowserType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Browser = "Chrome";
		switch (Browser) {
		
		case "Chrome":
		System.out.println("Google");
		break;
		case "Firefox":
			System.out.println("Mozilla");
		break;

		case "Edge":
			System.out.println("Microsoft");
			break;
		case "safari":
			System.out.println("Apple");
			break;
		default:
				System.out.println("Not valid");
				break;
				


	}

}
}
