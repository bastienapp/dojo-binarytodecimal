import junit.framework.*;
import org.junit.Test;

public class BinaryToDecimalTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		assertEquals(1, BinaryToDecimal.convert("1"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(3, BinaryToDecimal.convert("11"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(-1, BinaryToDecimal.convert("3"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(13, BinaryToDecimal.convert("1101"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(167, BinaryToDecimal.convert("10100111"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(255, BinaryToDecimal.convert("11111111"));
	}
}
