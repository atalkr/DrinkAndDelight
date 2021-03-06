package com.cg.servicesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import com.cg.beans.ProductStock;
import com.cg.daos.DAO;
import com.cg.services.ProductServiceImp;

public class ProductServiceImpTest {
	ProductServiceImp psi=new ProductServiceImp();
	
	@InjectMocks
	private ProductStock mockProductStock;
	private DAO mockDAO;
	
	@Before
	public void setup() {
	
	}
	@Test
	public void validsetProcessDate() {
		String s=psi.setProcessDate("87",LocalDate.of(2010,02,16));
		assertEquals("Process date updated",s);
	}
	@Test
	public void invalidSetProcessDate() {
		String s=psi.setProcessDate("77",LocalDate.of(2010,02,16));
		assertEquals("Error: unable to set process date",s);
}
	@Test
	public void errorupdateCheck() {
		ProductStock ps=new ProductStock();
		String s =psi.updateProductStock(ps);
		assertEquals("ERROR : Data was not inserted",s);
	}
	@Test
	public void updateCheck() {
		ProductStock ps=new ProductStock("87","Rum",10.0);
		ps.setManufacturingDate(LocalDate.of(2020,01,01));
		String s =psi.updateProductStock(ps);
		assertEquals("Data Inserted",s);
	}
	
	
}
