package com.cg.services;

import java.time.LocalDate;
import java.util.Date;

import com.cg.beans.ProductStock;

public interface ProductServiceInterface {
	public String trackProductOrder(ProductStock productStock);

	public boolean doesProductOrderIdExist(String id);

	public boolean exitDateCheck(ProductStock productStock);

	public boolean updateExitDateinStock(ProductStock productStock);

	public boolean validateManufacturingDate(LocalDate date);

	public boolean validateExpiryDate(LocalDate date);

	public String updateProductStock(ProductStock productStock);

	public boolean doesProductIdEXistInStock(String id);

}
