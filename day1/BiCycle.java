package week1.day1;

public class BiCycle {
	public int getCycleCount() {
		return 4;
	}
		public String getCycleColor (String brandName) {
			return "Blue";
		}
			public char getlogo (String brandName) {
				return 'B';
			}
			public boolean isNew() {
				return false;
			}

		public void printBrand() {
			System.out.println("Hero");
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	BiCycle myCycle = new BiCycle();
	System.out.println(myCycle.getCycleCount());
	System.out.println(myCycle.getCycleColor("Hero"));
	}
}


