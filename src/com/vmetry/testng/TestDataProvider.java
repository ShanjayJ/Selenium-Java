package com.vmetry.testng;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name = "TestCase Data")
	public Object[][] getData() {
		Object data[][] = new Object[3][2];
		data[0][0] = "A";
		data[0][1] = "Erlang";
		
		data[1][0] = "j";
		data[1][1] = "Clojure";
		
		data[2][0] = "v";
		data[2][1] = "Groovy";
		
		return data;
		
	}

}
