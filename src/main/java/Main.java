import java.util.Date;

import 	ControllerLayer.ProductController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String setExitDate(String id,Date d) {
		ProductController pc=new ProductController();
		return pc.exitDateCheck(id, d);
	}
	public static String updateProductStock(String oderid,Date manufacturing,Date expiry,double qa) {
		ProductController pc=new ProductController();
		return pc.updateProductStock(oderid, manufacturing, expiry, qa);
	}
	

}
