import java.time.LocalDate;
import com.cg.beans.ProductStock;
import com.cg.controllers.ProductController;
import com.cg.repositories.Database;

public class Main {

	public static void main(String[] args) {
		ProductController pc = new ProductController();
		pc.setProcessDate("87", LocalDate.of(2020,02,01));
		pc.updateProductStock("99", LocalDate.of(2020,02,01),LocalDate.of(2020,02,01), 10.0);
		for(ProductStock p: Database.list)
			System.out.println(p.getProcessDate());
	}


}
