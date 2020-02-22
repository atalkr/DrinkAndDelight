package com.cg.daosTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import com.cg.beans.ProductStock;
import com.cg.repositories.Database;

public class DAOTest {
	static Database mockDatabase;
	static ProductStock productStock;

	@InjectMocks
	private Database mockDataBase;
	
	@Before
	public void setup() {
		Mockito.when(mockDatabase.list.add(productStock)).thenReturn(true);
	}

	public static boolean save(ProductStock productStock) {
		if (mockDatabase.list.add(productStock))
			return true;
		return false;
	}

	@Test
	public void test() {
		boolean a = save(productStock);
		assertEquals(true, a);
	}
	

}
