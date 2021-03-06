import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringLabTest {

	@Test
	void testCapitalize() {
		String expected = "Java";
		String actual = StringLab.capitalize("jAvA");
		assertEquals(expected,actual);
	}
	
	@Test
	void testWaldo() {
		int expected = 8;
		int actual = StringLab.wheresWaldo("Striped Waldo!");
		assertEquals(expected,actual);
	}
	
	@Test
	void testFirstThingsFirst() {
		String expected = ("pine tree");
		String actual = StringLab.firstThingsFirst("tree","pine");
		assertEquals(expected,actual);
	}
	
	@Test
	void testReverse() {
		String expected = ("yppah");
		String actual = StringLab.reverse("happy");
		assertEquals(expected,actual);
	}
	
	@Test
	void testSoLong() {
		String expected = ("bean");
		String actual = StringLab.soLong("bean","pea");
		assertEquals(expected,actual);
	}
	
	@Test
	void testAfterMath() {
		String expected = ("mathematics test!");
		String actual = StringLab.afterMath("She aced the mathematics test!");
		assertEquals(expected,actual);
	}

	@Test
	void testLetterize() {
		String expected = ("J" + "\n" + "a" + "\n" + "v" + "\n" + "a" + "\n");
		String actual = StringLab.letterize("Java");
		assertEquals(expected,actual);
	}
	
	


}
