package th.ac.kku.member;

public class Member {

	private int id;
	private String level;
	private int specialPoint;

	public Member(int id,String level, int specialPoint) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.level = level;
		this.specialPoint = specialPoint;
	}

	public String getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}

	public int getSpecialPoint() {
		// TODO Auto-generated method stub
		return specialPoint;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
