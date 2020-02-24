package com.cg.controllers;

import java.time.LocalDate;
import com.cg.beans.ProductStock;
import com.cg.services.ProductServiceImp;


public class ProductController {

	public String setProcessDate(String orderid, LocalDate date) {
		ProductServiceImp psi=new ProductServiceImp();
		return psi.setProcessDate(orderid, date);
	}

	public String updateProductStock(String orderid, LocalDate manufacturingDate, LocalDate expiryDate, double quantityValue) {
		ProductStock p = new ProductStock();
		p.setOrderId(orderid);
		p.setManufacturingDate(manufacturingDate);
		p.setExpiryDate(expiryDate);
		p.setQuantityValue(quantityValue);
		ProductServiceImp psi=new ProductServiceImp();
		return psi.updateProductStock(p);
	}

}
