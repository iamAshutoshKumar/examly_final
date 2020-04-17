package net.codejava;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	@Id
	private Long product_code;
	private String product_name;
	private float product_price;
	private float product_gst;
}
