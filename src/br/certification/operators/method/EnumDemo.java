package br.certification.operators.method;

public class EnumDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());
		System.out.println("Priority.MEDIUM.ordinal(): " + Priority.MEDIUM.ordinal());
		
		
		Priority[] values = Priority.values();
		for (Priority priority3 : values) {
			System.out.println(priority3);
		}
		
        System.out.println("============ Enum fields and methods");
		
		System.out.println("Month.JANUARY.getDaysAmount(): " + Month.JANUARY.getDaysAmount());
	}
	
	public enum Priority {
		HIGH, MEDIUM, LOW;
	}
	
	
	public enum Month {

		JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31),
		AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

		private int daysAmount;

		private Month(int daysAmount) {
			this.daysAmount = daysAmount;
		}

		public int getDaysAmount() {
			return this.daysAmount;
		}

	}

}
