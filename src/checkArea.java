import junit.framework.TestCase;

public class checkArea extends TestCase {

	test newTest;
	protected void setUp() throws Exception {
		super.setUp();
		
		newTest = new test(10,20);
	}
	
	public void testPrintArea() {
		int area = newTest.getArea();
		assertEquals(200, area);
	}

}
