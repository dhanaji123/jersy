package com.capgemni.webservice;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer1 {
	String  abc;
	int  id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}
	
}
