package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FrameTest {

	public Frame frame;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {	
		this.frame = new Frame (null, 640, 500);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDysplay() {
		final int expected = 1;
        assertEquals(expected, this.frame.CreateDysplay);
	}

	public void testgetFrame() {
		final int expected = 2;
        assertEquals(expected, this.frame.getFrame());

	}

}
