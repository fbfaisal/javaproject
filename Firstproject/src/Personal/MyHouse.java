package Personal;

public class MyHouse {
	
	
	private String Name;
	private String OwnerName;
	private int FloorNum;
	
	
	public MyHouse(String Name, String OwnerName, int FloorNum) {
		
	//this.OwnerName=OwnerName;
	//this.Name=Name;
	//this.FloorNum=FloorNum;
	this.setName(OwnerName);	
	this.setOwnerName(OwnerName);
	this.setFloorNum(FloorNum);

	}


	public void setName(String name) {
		Name = name;
	}


	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}


	public void setFloorNum(int floorNum) {
		FloorNum = floorNum;
	}


	public String getName() {
		return Name;
	}


	public String getOwnerName() {
		return OwnerName;
	}


	public int getFloorNum() {
		return FloorNum;
	}

}
