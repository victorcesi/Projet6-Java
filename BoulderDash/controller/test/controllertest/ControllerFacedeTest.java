package controllertest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.ControllerFacade;

public class ControllerFacedeTest {
	
	private static final String view = null;
	private static final String expected = null;
	private static final String model = null;
	ControllerFacade controllerFracade;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		controllerFracade = new ControllerFacade(null, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getviewtest (){
		assertnotnull(expected, ControllerFacedeTest.this.view );
	}
	
	@Test
	public void testgetmodel() {
		assertnotnull(expected, ControllerFacedeTest.this.model );
	}

	private void assertnotnull(String expected2, String model) {
		// TODO Auto-generated method stub
		
	}

}
