package jenkins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleaddTest {
	Simpleadd Obj;
	
int a, b;
	@Before
	public void setUp() throws Exception {
		a=2;
		b=7;
		Obj=new Simpleadd();
}

	@Test
	public void test() {
		assertEquals (11, Obj.add(a, b));
	}

}
