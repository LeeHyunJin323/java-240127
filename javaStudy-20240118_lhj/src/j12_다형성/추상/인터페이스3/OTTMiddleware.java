package j12_다형성.추상.인터페이스3;



public class OTTMiddleware {

	private OTT ott;

	public OTTMiddleware(OTT ott) {
		this.ott = ott;
	}
	
	
	public void ssdrama() {
		ott.drama();
	}
	public void ssmovie() {
		ott.movie();
	}
	public void ssanimation() {
		ott.animation();
	}
	
	
	public void runAddOns() {
		if(ott instanceof Netflix) {
			((Netflix)ott).sale();
		}else if(ott instanceof Tving)
		{
			((Tving)ott).bundle();
		}
		else if (ott instanceof Wave) {
			((Wave)ott).freetier();
		}
		
	}
}
