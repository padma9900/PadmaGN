package com.TY.RMG.Projects;

import org.testng.annotations.Test;

public class ReadDataFromCmdTest {

	@Test
	public void readDataFromCmdTest() {
		
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println(url);
		System.out.println(browser);
		
	}
}
