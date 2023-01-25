package com.xworkz.watch.constants;

	public enum SqlCredential {
		
		URL("jdbc:mysql://localhost:3306/clock"),USERNAME("root"),PASSWORD("Xworkzodc@123");

		String value;
		
		private SqlCredential(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}

