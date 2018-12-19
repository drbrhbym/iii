
public class Distance {

	private int feet;
	private int inch;
	private static final int INCH_PER_FEET = 12;

	public int getFeet() {
		return feet;
	}

	public int getInch() {
		return inch;
	}

	public Distance() {

	}

	public Distance(int feet, int inch) throws OverInchException {
		if (inch >= INCH_PER_FEET) // (inch >= 12)
			throw new OverInchException("Inch over 12, inch = ", inch);
		this.feet = feet;
		this.inch = inch;
	}

	public static void main(String[] args) {
		try {
			Distance d1 = new Distance(5, 6);
			System.out.println("Feet = " + d1.getFeet() + ", Inch = " + d1.getInch());
			Distance d2 = new Distance(3, 13);
			System.out.println("Feet = " + d2.getFeet() + ", Inch = " + d2.getInch());
		} catch (OverInchException e) {
			System.out.println(e.getMsg() + e.getInch());
		}

	}
}
