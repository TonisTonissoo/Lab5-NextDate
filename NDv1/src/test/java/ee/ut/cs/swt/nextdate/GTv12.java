package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv122() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(8, 8, 8);
		assertEquals("9/1/1861", nextDate.run(8, 31, 1861));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv121() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(1, 1, 1);
		assertEquals("1/2/1848", nextDate.run(1, 1, 1848));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv120() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(12, 12, 12);
		assertEquals("invalid Input Date", nextDate.run(12, 1827, 1827));
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(2, 2, 2);
		assertEquals("3/1/1825", nextDate.run(2, 28, 1825));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1214() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(5, 5, 5);
		assertEquals("5/6/1829", nextDate.run(5, 5, 1829));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv129() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(7, 7, 7);
		assertEquals("7/7/1826", nextDate.run(7, 7, 1826));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1215() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(10, 10, 10);
		assertEquals("10/11/1813", nextDate.run(10, 10, 1813));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv128() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(12, 12, 12);
		assertEquals("1/1/1862", nextDate.run(12, 31, 1861));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1212() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(2, 2, 2);
		assertEquals("Invalid Input Date", nextDate.run(2, 29, 1827));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv127() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(12, 12, 12);
		assertEquals("12/13/1813", nextDate.run(12, 12, 1813));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1213() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(3, 3, 3);
		assertEquals("3/4/1830", nextDate.run(3, 3, 1830));
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(0, 0, 0);
		assertEquals("invalid Input Date", nextDate.run(0, 0, 0));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv126() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(17, 12, 12);
		assertEquals("Invalid Next Year", nextDate.run(12, 31, 2021));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1210() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(2, 2, 2);
		assertEquals("2/3/1827", nextDate.run(2, 2, 1827));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv125() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(11, 11, 11);
		assertEquals("12/1/1813", nextDate.run(11, 30, 1813));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1211() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(2, 2, 2);
		assertEquals("Invalid Input Date", nextDate.run(2, 30, 1825));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv124() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(12, 12, 12);
		assertEquals("Invalid Input Date", nextDate.run(11, 31, 2021));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv123() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(9, 9, 9);
		assertEquals("9/10/1834", nextDate.run(9, 9, 1834));
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndZero() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(0, 1621, 0);
		assertEquals("invalid Input Date", nextDate.run(0, 1621, 0));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(17, 12, 12);
		assertEquals("invalid Input Date", nextDate.run(12, 12, 569));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(1595, 1595, 1595);
		assertEquals("invalid Input Date", nextDate.run(1595, 1595, 1595));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(3537, 3537, 3537);
		assertEquals("invalid Input Date", nextDate.run(8, 8, 3537));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1216() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(7, 7, 7);
		assertEquals("4/5/1826", nextDate.run(4, 4, 1826));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateNDv1217() throws Throwable {
		NextDateNDv2 nextDate = new NextDateNDv2(6, 6, 6);
		assertEquals("6/7/1826", nextDate.run(6, 6, 1826));
	}

}