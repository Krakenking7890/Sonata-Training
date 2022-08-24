package com.sonata.online;

//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalTest {
	Calculator c1 = new Calculator();
	//@Test
	public void addTest() {
		assertEquals(4,c1.add(2,2));
	}
	//@Test
	public void divTest() {
		assertThrows(ArithmeticException.class,()->c1.div(1,0),"It is an error");
	}
}
