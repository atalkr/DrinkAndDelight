import java.time.LocalDate;
import java.util.Date;

import com.cg.controllers.ProductController;

public class Main {

	public static void main(String[] args) {


	}
	public static String setExitDate(String id,LocalDate d) {
		ProductController pc=new ProductController();
		return pc.exitDateCheck(id, d);
	}
	public static String updateProductStock(String oderid,LocalDate manufacturing,LocalDate expiry,double qa) {
		ProductController pc=new ProductController();
		return pc.updateProductStock(oderid, manufacturing, expiry, qa);
	}
	

}
