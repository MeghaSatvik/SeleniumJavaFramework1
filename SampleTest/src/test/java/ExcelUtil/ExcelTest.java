package ExcelUtil;

import utils.ExcelUtils;

public class ExcelTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ExcelUtils excel=new ExcelUtils(null, null);
		excel.getCellDataString(0, 1);
		excel.getCellDataNumber(1, 1);
		

	}

}
