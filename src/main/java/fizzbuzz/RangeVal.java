package fizzbuzz;

public class RangeVal implements IRangeVal{
	public boolean getResult(int num) {
		if (num >= 1 && num <=300) {
			return true;
		}
		return false;
	}
}

