package uf2_pe1;




import org.junit.Assert;
import org.junit.Test;


public class Testuf2_pe1 {

	@Test
	public void test() {
		Primordial prim = new Primordial();
		Assert.assertEquals(2, prim.get_primordial(2),0.005);
		Assert.assertEquals(6, prim.get_primordial(3),0.005);
		Assert.assertEquals(6, prim.get_primordial(4),0.005);
		Assert.assertEquals(30, prim.get_primordial(5),0.005);
		Assert.assertEquals(210, prim.get_primordial(7),0.005);
		Assert.assertEquals(2310, prim.get_primordial(11),0.005);
		Assert.assertEquals(30030, prim.get_primordial(13),0.005);
		Assert.assertEquals(510510, prim.get_primordial(17),0.005);
		Assert.assertEquals(9699690, prim.get_primordial(19),0.005);
		Assert.assertEquals(223092870, prim.get_primordial(23),0.005);

	}

}
