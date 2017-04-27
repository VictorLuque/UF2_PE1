package uf2_pe1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testboolean {

	@Test
	public void test() {
		Primordial prim = new Primordial();
		Assert.assertTrue(prim.get_primordial(8)>200);
		Assert.assertTrue(prim.get_primordial(6)<30);
		Assert.assertTrue(prim.get_primordial(2)<=2);

	}

}
