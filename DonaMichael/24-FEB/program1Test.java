import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class program1Test {

	@Test
	void test() {
		program1 obj=new program1();
		String expResult="Hello World";
		String actResult=obj.say();
		assertEquals(expResult, actResult);
		
	}

}
