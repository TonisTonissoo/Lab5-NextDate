package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv122() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(8, 8, 8);
	    String string0 = nextDateNDv12_0.run(8, 31, 1861);
	    assertEquals("9/1/1861", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv121() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(1, 1, 1);
	    String string0 = nextDateNDv12_0.run(1, 1, 1848);
	    assertEquals("1/2/1848", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv120() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(12, 12, 12);
	    String string0 = nextDateNDv12_0.run(12, 1827, 1827);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(2, 2, 2);
	    String string0 = nextDateNDv12_0.run(2, 28, 1825);
	    assertEquals("3/1/1825", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1214() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(5, 5, 5);
	    String string0 = nextDateNDv12_0.run(5, 5, 1829);
	    assertEquals("5/6/1829", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv129() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(7, 7, 7);
	    String string0 = nextDateNDv12_0.run(7, 7, 1826);
	    assertEquals("7/7/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1215() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(10, 10, 10);
	    String string0 = nextDateNDv12_0.run(10, 10, 1813);
	    assertEquals("10/11/1813", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv128() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(12, 12, 12);
	    String string0 = nextDateNDv12_0.run(12, 31, 1861);
	    assertEquals("1/1/1862", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1212() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(2, 2, 2);
	    String string0 = nextDateNDv12_0.run(2, 29, 1827);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv127() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(12, 12, 12);
	    String string0 = nextDateNDv12_0.run(12, 12, 1813);
	    assertEquals("12/13/1813", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1213() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(3, 3, 3);
	    String string0 = nextDateNDv12_0.run(3, 3, 1830);
	    assertEquals("3/4/1830", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(0, 0, 0);
	    String string0 = nextDateNDv12_0.run(0, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv126() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(17, 12, 12);
	    String string0 = nextDateNDv12_0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1210() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(2, 2, 2);
	    String string0 = nextDateNDv12_0.run(2, 2, 1827);
	    assertEquals("2/3/1827", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv125() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(11, 11, 11);
	    String string0 = nextDateNDv12_0.run(11, 30, 1813);
	    assertEquals("12/1/1813", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1211() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(2, 2, 2);
	    String string0 = nextDateNDv12_0.run(2, 30, 1825);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv124() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(12, 12, 12);
	    String string0 = nextDateNDv12_0.run(11, 31, 2021);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv123() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(9, 9, 9);
	    String string0 = nextDateNDv12_0.run(9, 9, 1834);
	    assertEquals("9/10/1834", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndZero() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(0, 1621, 0);
	    String string0 = nextDateNDv12_0.run(0, 1621, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(17, 12, 12);
	    String string0 = nextDateNDv12_0.run(12, 12, 569);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(1595, 1595, 1595);
	    String string0 = nextDateNDv12_0.run(1595, 1595, 1595);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(3537, 3537, 3537);
	    String string0 = nextDateNDv12_0.run(8, 8, 3537);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1216() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(7, 7, 7);
	    String string0 = nextDateNDv12_0.run(4, 4, 1826);
	    assertEquals("4/5/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1217() throws Throwable {
	    NextDateNDv12 nextDateNDv12_0 = new NextDateNDv12(6, 6, 6);
	    String string0 = nextDateNDv12_0.run(6, 6, 1826);
	    assertEquals("6/7/1826", string0);
	}

}