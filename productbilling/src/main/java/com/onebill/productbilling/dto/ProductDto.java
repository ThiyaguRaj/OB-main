package com.onebill.productbilling.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.onebill.productbilling.Entities.Plan;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class ProductDto  implements Serializable{

	private int productId;

	private String productName;

	private String productType;
	
	private List<Plan> plan;
}
