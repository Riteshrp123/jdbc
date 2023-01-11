package com.xworkz.bag.sqlcredential;

public enum SqlcCredential {
		
		URL("jdbc:mysql://localhost:3306/ritesh"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	   
	 String value;
	 
	private SqlcCredential(String value) {
		this.value=value;
	}

	   public String getValue() {
		   return value;
	   }
	}
