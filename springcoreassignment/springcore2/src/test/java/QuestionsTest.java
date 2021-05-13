import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class QuestionsTest {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Quest.xml");
		Questions que=(Questions) context.getBean("Questions");
		assertAll(
				()->assertEquals(que.getQuestion(),"HOW ARE YOU"),
				()->assertEquals(que.getQuestionId(),54)
			);
	}

}
