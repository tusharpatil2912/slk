package com.slksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product {

	private Integer id;
	private String name;
	private String category;
	private String brand;
	private Double unitPrice;
	private String description;
	private String quantityPerUnit;
	private String picture;
	private Integer discount;

}
