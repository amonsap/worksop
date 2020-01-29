package th.ac.kku.member;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LevelTest {
	@Test
	
	public void
	memberShouldUpLvevlToGoldMemberWhenSequenceIs150() {
		Member member = new Member(123456,"Silver",50);
		Order order = new Order();
		Level level = new Level(order);
		
		Member newMember = level.up(member);
		assertEquals(newMember.getLevel(), "Gold");
		assertEquals(newMember.getSpecialPoint(), 250);
	}
}
