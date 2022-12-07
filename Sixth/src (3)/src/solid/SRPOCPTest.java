package solid;

class Interval{
	
	/*
	 * private int minutes; private int seconds;
	 */
	private int time;
	
	public Interval(int time) {
		/*
		minutes = time / 60;
		seconds = time % 60;
		*/
		this.time = time;
	}
	
	public int time() {
		int minutes = time / 60;
		int seconds = time % 60;
		return 60 * minutes + seconds;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		int minutes = time / 60;
		int seconds = time % 60;
		return minutes + ":" + seconds;
	}
}


public class SRPOCPTest {

	public static void main(String[] args) {
		Interval i = new Interval(125);
		System.out.println(i);
	}
}


