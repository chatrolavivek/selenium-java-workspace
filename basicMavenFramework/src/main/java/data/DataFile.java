package data;

import org.testng.annotations.DataProvider;

import utilities.Xls_Reader;

public class DataFile {
	Xls_Reader d = new Xls_Reader("E:\\Computer Science\\Software Testing\\Projects\\testing\\BasicFrameworkData.xlsx");

	public String correctEmail = d.getCellData("Data1", "correctEmail", 2);
	public String wrongEmail = d.getCellData("Data1", "wrongEmail", 2);
	public String expectedEmailError = d.getCellData("Data1", "emailError", 2);
	public String wrongPassword = d.getCellData("Data1", "wrongPassword", 2);
	public String expectedPasswordError = d.getCellData("Data1", "passwordError", 2);

	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data = new Object[5][2];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 1; j++) {
				if (j == 0) {
					data[i][j] = d.getCellData("Data1", "correctEmail", i+2);
				} else {
					data[i][j] = d.getCellData("Data1", "wrongPassword", i+2);
				}
			}
		}
		return data;

	}
}
