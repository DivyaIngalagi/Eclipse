package constructorreference;

class Room{
	
	int roomNumber;
	boolean taken;
	
	public Room() {
		// TODO Auto-generated constructor stub
		roomNumber = 1;
	}

	public Room(int roomNumber, boolean taken) {
		super();
		this.roomNumber = roomNumber;
		this.taken = taken;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Room number %d is %s%n", roomNumber, taken ? "Occupied" : "Available");
	}
}

interface Hotel{
	Room createRoom();
}

/*
class TajHotel implements Hotel{

	@Override
	public Room createRoom() {
		// TODO Auto-generated method stub
		return new Room();					//Room::new
	}
	
}
*/


public class Test {

	private static Room createBusinessRoom() {
		return new Room();
	}
	
	public static void main(String[] args) {
		/*
		Hotel taj = new TajHotel();
		System.out.println(taj.createRoom());
		*/
		
		Hotel taj = Test::createBusinessRoom;
		System.out.println(taj.createRoom());
		
		Hotel oberoi = Room::new;
		System.out.println(oberoi.createRoom());
	}
}








