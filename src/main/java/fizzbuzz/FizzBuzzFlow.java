package fizzbuzz;

public class FizzBuzzFlow implements IFizzBuzzFlow {
	private IConvertString _ICS;
	private IRangeVal _IRV;
	private IGetFizzBuzz _IGFB;

	public FizzBuzzFlow(IConvertString ICS, IRangeVal IRV, IGetFizzBuzz IGFB) {
		this._ICS = ICS;
		this._IRV = IRV;
		this._IGFB = IGFB;
	}
	
	public boolean getResult(String s) {
		boolean convertStringCheck = this._ICS.getResult(s);
		if (convertStringCheck) {
			boolean rangeValCheck = this._IRV.getResult(Integer.parseInt(s));
			if (rangeValCheck) {			
				this._IGFB.getResult(Integer.parseInt(s));
			}
		}
		return true;
	}
}
