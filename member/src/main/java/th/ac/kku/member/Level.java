package th.ac.kku.member;

public class Level {

	private Order order;
	public Level(Order order) {
		// TODO Auto-generated constructor stub
		this.order = order;
	}
	
	//check order more than 4 orders
	//and spend more than 1000 bath
	
	// 
	//and within 6 months
	


	//and sequence in between 1-199 candidates
	public Member up(Member member) {
		// TODO Auto-generated method stub
		if (order.getTargetOrder(member.getId()) >= 4) {
			return new Member(member.getId(),"Gold", member.getSpecialPoint( )+ 200); 
		}
		return null;
	}

}
