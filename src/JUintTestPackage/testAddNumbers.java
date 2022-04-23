package JUintTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFucntions jUnit=new jUnitFucntions();
		int result=jUnit.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}
