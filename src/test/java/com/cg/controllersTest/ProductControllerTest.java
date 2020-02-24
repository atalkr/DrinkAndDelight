package com.cg.controllersTest;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import com.cg.controllers.ProductController;

public class ProductControllerTest {
	ProductController pc=new ProductController();
	
	@Test
	public void validSetProcessDate() {
		String s=pc.setProcessDate("87",LocalDate.of(2010,02,16));
		assertEquals("Process date updated",s);
	}
	@Test
	public void invalidexitDateCheck() {
		String s=pc.setProcessDate("123",LocalDate.of(2020,02,20));
		assertEquals("Error: unable to set process date",s);
	}
	@Test
	public void failedupdateStockCheck() {
		String s=pc.updateProductStock("221",LocalDate.of(2020,02,20),LocalDate.of(2020,02,20), 10.0);
		assertEquals("ERROR : Data was not inserted",s);
	}
	@Test
	public void validupdateStockCheck() {
		String s=pc.updateProductStock("87",LocalDate.of(2020,01,01),LocalDate.of(2020,01,01), 10.0);
		assertEquals("Data Inserted",s);
	}
	

}
