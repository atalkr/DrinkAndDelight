package com.cg.services;

import java.time.LocalDate;
import com.cg.beans.ProductStock;
import com.cg.daos.DAO;
import com.cg.services.ProductServiceInterface;

public class ProductServiceImp implements ProductServiceInterface {

	
	public String setProcessDate(String orderid,LocalDate date) {
		ProductStock p = DAO.findById(orderid);
		if(p!=null) {
			p.setProcessDate(date);
			return "Process date updated";
		}
		return "Error: unable to set process date";
	}

	public String trackProductOrder(ProductStock productStock) {
		return null;
	}

	public boolean doesProductOrderIdExist(String id) {
		return false;
	}

	public boolean exitDateCheck(ProductStock productStock) {
		if (productStock.getExitDate().compareTo(LocalDate.now())<0)
			return true;
		return false;
	}

	public boolean updateExitDateinStock(ProductStock productStock) {
		return false;
	}

	public boolean validateManufacturingDate(LocalDate date) {
		if(date.compareTo(LocalDate.of(2020,02,01))<0) return true;
		return false;
	}

	public boolean validateExpiryDate(LocalDate date) {
		return true;
	}

	public String updateProductStock(ProductStock productStock) {
		ProductStock p = DAO.findById(productStock.getOrderId());
		if (p!=null && this.validateManufacturingDate(productStock.getManufacturingDate()) == true
				&& this.validateExpiryDate(productStock.getExpiryDate()) == true) {
			p.setManufacturingDate(productStock.getManufacturingDate());
			p.setExpiryDate(productStock.getExpiryDate());
			p.setQuantityValue(productStock.getQuantityValue());
			return "Data Inserted";
		}
		return "ERROR : Data was not inserted";
	}

	public boolean doesProductIdEXistInStock(String id) {
				return false;
	}


}
