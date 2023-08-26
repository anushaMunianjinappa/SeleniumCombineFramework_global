package contacts;

import org.testng.annotations.Test;

import generics.ExcelUtility;

public class DemoData1 {
	
		@Test(dataProvider = "testdata", dataProviderClass = ExcelUtility.class)
		public void demo(String data1) {
			System.out.println(data1);
//			System.out.println(data2);
		}

}
