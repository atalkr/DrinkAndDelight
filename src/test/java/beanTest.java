import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.cg.beans.ProductStock;

class beanTest {

	@Mock
	private ProductStock ps;
	
	@Before
	public void setup() {
		Mockito.when(ps.getName()).thenReturn("Ramesh");
	}
	@Test
	void test() {
		assertEquals("Ramesh",ps.getName());
	}

}
