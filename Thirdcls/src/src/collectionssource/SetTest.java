package collectionssource;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Immutable class
class Interval{ // implements Comparable<Interval>{
	
	private int min;
	private int sec;
	
	public Interval(int m, int s) {
		min = m;
		sec = s;
	}
	
	public int minutes() {
		return min;
	}
	
	public int seconds() {
		return sec;
	}
	
	public int time() {
		return 60 * min + sec;
	}
	
	@Override
	public int hashCode() {
		return min + sec;	//Return something unique 
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Interval) {
			Interval that = (Interval) other;
			return this.min == that.min && this.sec == that.sec;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return min + ":" + sec;
	}

	/*
	@Override
	public int compareTo(Interval o) {
		// TODO Auto-generated method stub
		return this.time() - o.time();
	}
	*/
}

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> weeks = new TreeSet<String>();
		weeks.add("Monday");
		weeks.add("Tuesday");
		weeks.add("Wednesday");
		weeks.add("Thursday");
		weeks.add("Monday");
		
		Comparator<Interval> c = new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return a.seconds() - b.seconds();
			}
		};
		
		Set<Interval> store = new TreeSet<Interval>(c);
		store.add(new Interval(2, 5));	//a.compareTo(b);
		store.add(new Interval(5, 7));
		store.add(new Interval(1, 15));
		store.add(new Interval(6, 2));
		store.add(new Interval(5, 7));
		
		for (String day : weeks) {
			System.out.println(day);
		}
		
		for (Interval interval : store) {
			System.out.println(interval);
		}
	}

}
