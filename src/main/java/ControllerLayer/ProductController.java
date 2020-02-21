package ControllerLayer;

import java.util.Date;
import Beans.ProductStock;
import ProductServiceLayer.ProductServiceImp;
import DAOLayer.DAO;

public class ProductController extends ProductServiceImp {

	public String exitDateCheck(String orderid, Date date) {
		ProductStock p = DAO.findById(orderid);
		p.setExitDate(date);
		if (super.exitDateCheck(p))
			return "Exit date updated";
		return "Error : exit method not updated";
	}

	public String updateProductStock(String orderid, Date manufacturingDate, Date expiryDate, double quantityValue) {
		ProductStock p = new ProductStock();
		p.setOrderId(orderid);
		p.setManufacturingDate(manufacturingDate);
		p.setExpiryDate(expiryDate);
		p.setQuantityValue(quantityValue);
		return super.updateProductStock(p);
	}

}
