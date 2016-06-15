package package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testMaximumResult() {
		int[] array ={-3,1,2,-2,5,6};
		int expectResult = 60;
		assertEquals(expectResult,Kolokwium.maximumOfResult(Kolokwium.productOfTriplet(array)) );
	}

}
