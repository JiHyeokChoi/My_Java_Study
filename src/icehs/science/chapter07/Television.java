package icehs.science.chapter07;

public class Television {
	String name;
	int price;
	String description;
	
	Television(String name, int price){
		this.name = name;
		this.price = price;
	}
			
	Television(String name, int price, String description){
		this.name = name;
		this.description = description;
		this.price = price;
		
	}
	
	void printTelevisionInfo(){
		
		if(description == null) {
			System.out.println(name + " : " + price);
		}else {
			System.out.println(name + "(" + description + ")" + " : " + price);
		
			
	}
	
	
}
}
