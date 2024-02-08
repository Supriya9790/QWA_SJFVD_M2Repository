package pompackage;

import java.io.IOException;

public class InvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BaseTest test = new BaseTest();
		test.setup();
		 
		LoginPage lp = new LoginPage(driver);
		AllMethods method = new AllMethods();
		int rowcount = method.getRowCount(EXCELPATH, INVALIDSHEETNAME);
		
		for(int i = 1; i<=rowcount;i++ )
		{
			lp.loginIntoActitime(method.getDataFromExcel(EXCELPATH, INVALIDSHEETNAME, i, 0),
					method.getDataFromExcel(EXCELPATH, INVALIDSHEETNAME, i, 1));
		}
		 

	}

}
