package cz.pandatechnika.api;

import java.io.Serializable;
import java.sql.Date;

public class Transakce implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 34645646584L;

	
	private long id;
	
	private String product;
	
	private String requestor;
	
	private Date date;
	
	private String shop;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getRequestor() {
		return requestor;
	}

	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}
}
