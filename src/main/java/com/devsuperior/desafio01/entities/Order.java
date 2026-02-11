package com.devsuperior.desafio01.entities;

public class Order {
	private Integer id;
	private Double basic;
	private Double discount;
	
	public Order(Integer id, Double basic, Double discount) {
		this.id = id;
		this.basic = basic;
		this.discount = discount;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
}
