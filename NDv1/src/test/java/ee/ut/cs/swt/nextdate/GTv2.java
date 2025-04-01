package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv210() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(2, 2, 2);
		assertEquals("2/3/1810", nextDate.run(2, 2, 1810));
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(2, 2, 2);
		assertEquals("3/1/1974", nextDate.run(2, 28, 1974));
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(-702, -702, -702);
		assertEquals("invalid Input Date", nextDate.run(-702, -702, -702));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv216() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(6, 6, 6);
		assertEquals("6/7/1893", nextDate.run(6, 6, 1893));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv215() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(10, 10, 10);
		assertEquals("10/11/1959", nextDate.run(10, 10, 1959));
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(12, 12, 12);
		assertEquals("invalid Input Date", nextDate.run(-708, 12, -708));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv214() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(8, 8, 8);
		assertEquals("8/9/1812", nextDate.run(8, 8, 1812));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv213() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(1, 1, 1);
		assertEquals("1/2/1893", nextDate.run(1, 1, 1893));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv28() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(12, 12, 12);
		assertEquals("1/1/1949", nextDate.run(12, 31, 1948));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv212() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(29, 29, 29);
		assertEquals("Invalid Input Date", nextDate.run(2, 29, 1810));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv29() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(7, 7, 7);
		assertEquals("7/7/1893", nextDate.run(7, 7, 1893));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv211() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(2, 2, 2);
		assertEquals("Invalid Input Date", nextDate.run(2, 30, 1958));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(10, 10, 10);
		assertEquals("invalid Input Date", nextDate.run(10, 10, 10));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv26() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(12, 12, 12);
		assertEquals("Invalid Next Year", nextDate.run(12, 31, 2021));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(12, 12, 12);
		assertEquals("invalid Input Date", nextDate.run(31, 12, 2021));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv27() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(12, 12, 12);
		assertEquals("12/13/1908", nextDate.run(12, 12, 1908));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv24() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(4, 4, 4);
		assertEquals("Invalid Input Date", nextDate.run(4, 31, 1939));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(2431, 2431, 2431);
		assertEquals("invalid Input Date", nextDate.run(1, 2431, 2431));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv25() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(9, 9, 9);
		assertEquals("10/1/1958", nextDate.run(9, 30, 1958));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv22() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(3, 3, 3);
		assertEquals("3/4/1977", nextDate.run(3, 3, 1977));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv23() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(11, 11, 11);
		assertEquals("11/12/1962", nextDate.run(11, 11, 1962));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv20() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(12, 12, 12);
		assertEquals("invalid Input Date", nextDate.run(12, 1908, 1908));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv21() throws Throwable {
		NextDateNDv22 nextDate = new NextDateNDv22(5, 5, 5);
		assertEquals("6/1/1948", nextDate.run(5, 31, 1948));
	}
}
