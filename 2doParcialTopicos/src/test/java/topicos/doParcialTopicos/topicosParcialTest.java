package topicos.doParcialTopicos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class topicosParcialTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		topicos topico=new topicos();
		int resultado = topico.puntoFramePleno(10, 5, 4);
		assertEquals(19, resultado);
	}

}
