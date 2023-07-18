package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Map<String, Integer> feeStr;
	private Properties dbProperties;
	
	
	public Person() {
		super();
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStr() {
		return feeStr;
	}
	
	public void setFeeStr(Map<String, Integer> feeStr) {
		this.feeStr= feeStr;
	}
	
	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	@Override
	public String toString() {
		return ("Friends: " + friends + "\nFee Structure: " + feeStr + "\nDB Credentials: " + dbProperties );
	}
	

}
