package AppTest.java;

import static org.junit.Assert.assertEquals;

import com.nt.JacacoProject_01.App;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private App app = new App();

	@org.junit.Test
	public void testWithValidCredentials() {
		String result = app.login("aarish", "1313");
		assertEquals("test1", "Valid credentials", result);
	}

	@org.junit.Test
	public void testWithInValidCredentials() {
		String result = app.login("aarisha", "13513");
		assertEquals("test2", "InValid credentials", result);
	}

	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testWithNoCredentials() {
		String result = app.login("", "");
	}

}
