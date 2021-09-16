package com.adactin.property;

import com.adactin.helper.ConfigurationReader;

public class FileReaderManager {

	
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFRM() {
		
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getInstanceCR() throws Throwable {
		
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}
