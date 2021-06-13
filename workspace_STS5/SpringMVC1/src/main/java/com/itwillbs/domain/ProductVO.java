package com.itwillbs.domain;

// 도메인 : 프로젝트안에서 중요한 역활을하는 단어(명사)

// 자바빈 -> 디비 데이터를 한번에 저장하기위한 공간
// => DTO (Data Transfer Obeject), VO(Value Object)

public class ProductVO {
	
	private String name;
	private int price;
	private String model;
	
	public ProductVO() {}
	public ProductVO(String n,int p,String m) {
		this.name = n;
		this.price = p;
		this.model = m;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", model=" + model + "]";
	}

}
