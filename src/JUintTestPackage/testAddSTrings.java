package JUintTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddSTrings {

	@Test
	public void test() {
		jUnitFucntions jUnit=new jUnitFucntions();
		String result=jUnit.AddStrings("abc","def");
		assertEquals("abcdef",result);
	}

}
