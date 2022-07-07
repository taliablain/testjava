package com.modernjava;

import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

	@Test
	void testReverse() {
	    StringReverser reverser = new StringReverser();
	    assertEquals("thgislarulP", reverser.reverse("Pluralsight"));
	}

}
}
