package ProductServiceLayer;

import java.util.Date;

import Beans.ProductStock;
import ProductServiceLayer.ProductServiceInterface;
import DAOLayer.DAO;

public class ProductServiceImp implements ProductServiceInterface {

	public String trackProductOrder(ProductStock productStock) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean doesProductOrderIdExist(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean exitDateCheck(ProductStock productStock) {
		if (productStock.getExitDate() == null)
			return false;
		return true;
	}

	public boolean updateExitDateinStock(ProductStock productStock) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validateManufacturingDate(Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validateExpiryDate(Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	public String updateProductStock(ProductStock productStock) {
		ProductStock p = DAO.findById(productStock.getOrderId());
		if (this.validateManufacturingDate(productStock.getManufacturingDate()) == true
				&& this.validateExpiryDate(productStock.getExpiryDate()) == true) {
			p.setManufacturingDate(productStock.getManufacturingDate());
			p.setExpiryDate(productStock.getExpiryDate());
			p.setQuantityValue(productStock.getQuantityValue());
			return "Data Inserted";
		}
		return "ERROR : Data was not inserted";
	}

	public boolean doesProductIdEXistInStock(String id) {
		// TODO Auto-generated method stub
		return false;
	}


}
