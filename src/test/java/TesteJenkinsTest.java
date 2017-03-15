import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TesteJenkinsTest {

	TesteJenkins tj;
	
	@Before
	public void init() {
		tj = new TesteJenkins();
	}
	
	@Test
	public void test() {
		tj.setName("Hugo");
		Assert.assertEquals("Hugo", tj.getName());
	}
	

}
