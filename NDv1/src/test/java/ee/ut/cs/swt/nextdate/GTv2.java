package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv210() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(2, 2, 2);
	    String string0 = nextDateNDv2_0.run(2, 2, 1810);
	    assertEquals("2/3/1810", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(2, 2, 2);
	    String string0 = nextDateNDv2_0.run(2, 28, 1974);
	    assertEquals("3/1/1974", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2((-702), (-702), (-702));
	    String string0 = nextDateNDv2_0.run((-702), (-702), (-702));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv216() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(6, 6, 6);
	    String string0 = nextDateNDv2_0.run(6, 6, 1893);
	    assertEquals("6/7/1893", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv215() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(10, 10, 10);
	    String string0 = nextDateNDv2_0.run(10, 10, 1959);
	    assertEquals("10/11/1959", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(12, 12, 12);
	    String string0 = nextDateNDv2_0.run((-708), 12, (-708));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv214() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(8, 8, 8);
	    String string0 = nextDateNDv2_0.run(8, 8, 1812);
	    assertEquals("8/9/1812", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv213() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(1, 1, 1);
	    String string0 = nextDateNDv2_0.run(1, 1, 1893);
	    assertEquals("1/2/1893", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv28() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(12, 12, 12);
	    String string0 = nextDateNDv2_0.run(12, 31, 1948);
	    assertEquals("1/1/1949", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv212() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(29, 29, 29);
	    String string0 = nextDateNDv2_0.run(2, 29, 1810);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv29() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(7, 7, 7);
	    String string0 = nextDateNDv2_0.run(7, 7, 1893);
	    assertEquals("7/7/1893", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv211() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(2, 2, 2);
	    String string0 = nextDateNDv2_0.run(2, 30, 1958);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(10, 10, 10);
	    String string0 = nextDateNDv2_0.run(10, 10, 10);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv26() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(12, 12, 12);
	    String string0 = nextDateNDv2_0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(12, 12, 12);
	    String string0 = nextDateNDv2_0.run(31, 12, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv27() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(12, 12, 12);
	    String string0 = nextDateNDv2_0.run(12, 12, 1908);
	    assertEquals("12/13/1908", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv24() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(4, 4, 4);
	    String string0 = nextDateNDv2_0.run(4, 31, 1939);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(2431, 2431, 2431);
	    String string0 = nextDateNDv2_0.run(1, 2431, 2431);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv25() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(9, 9, 9);
	    String string0 = nextDateNDv2_0.run(9, 30, 1958);
	    assertEquals("10/1/1958", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv22() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(3, 3, 3);
	    String string0 = nextDateNDv2_0.run(3, 3, 1977);
	    assertEquals("3/4/1977", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv23() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(11, 11, 11);
	    String string0 = nextDateNDv2_0.run(11, 11, 1962);
	    assertEquals("11/12/1962", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv20() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(12, 12, 12);
	    String string0 = nextDateNDv2_0.run(12, 1908, 1908);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv21() throws Throwable {
	    NextDateNDv2 nextDateNDv2_0 = new NextDateNDv2(5, 5, 5);
	    String string0 = nextDateNDv2_0.run(5, 31, 1948);
	    assertEquals("6/1/1948", string0);
	}

}