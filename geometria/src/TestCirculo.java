import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCirculo {

	@Test
	void testArea() {
		fail("Not yet implemented");
	}

	@Test
	void testPerimetro() {
		fail("Not yet implemented");
	}

	@Test
	public void testArea1() {
		Circulo_AMB c=new Circulo_AMB(7,"circulo_1");
		assertEquals((7*7*3.1416), c.area(), 0.01);
	}
	
	@Test
	public void testArea2() {
		Circulo_AMB c=new Circulo_AMB(0,"circulo_2");
		assertEquals((0*0*3.1416), c.area(), 0.01);
	}
	
	@Test
	public void testArea3() {
		Circulo_AMB c=new Circulo_AMB(7,"circulo_1");
		assertEquals((-3*-3*3.1416), c.area(), 0.01);
	}
	
	@Test
	public void testPerimetro1() {
		Circulo_AMB c=new Circulo_AMB(7,"circulo_1");
		assertEquals((2*7*3.1416), c.area(), 0.01);
	}
	
	@Test
	public void testPerimetro2() {
		Circulo_AMB c=new Circulo_AMB(0,"circulo_2");
		assertEquals((2*0*3.1416), c.area(), 0.01);
	}
	
	@Test
	public void testPerimetro3() {
		Circulo_AMB c=new Circulo_AMB(7,"circulo_1");
		assertEquals((2*-3*3.1416), c.area(), 0.01);
	}
	
}
