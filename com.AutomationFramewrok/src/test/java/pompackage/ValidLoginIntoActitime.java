package pompackage;

import java.io.IOException;

public class ValidLoginIntoActitime extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 BaseTest test = new BaseTest();
		 test.setup();
		 
		 LoginPage lp = new LoginPage(driver);
		 AllMethods method = new AllMethods();
		 lp.loginIntoActitime(method.getDataFromExcel(EXCELPATH, SHEETNAME, 1, 0),
				 method.getDataFromExcel(EXCELPATH, SHEETNAME, 1, 1));
		 Thread.sleep(3000);
		 test.tearDown();
		 
		 
		 

	}

}
