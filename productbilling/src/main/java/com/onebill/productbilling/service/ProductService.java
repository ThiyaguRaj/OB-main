package com.onebill.productbilling.service;

import java.util.List;

import com.onebill.productbilling.dto.PlanDetailRespDto;
import com.onebill.productbilling.dto.PlanRespDto;
import com.onebill.productbilling.dto.ProductDto;

public interface ProductService {

	public ProductDto addProduct(ProductDto pro);
	
	public ProductDto getProduct(String productName);
	
	public ProductDto getProductWithId(int productId);
	
	public List<PlanDetailRespDto> getPlanDetail(int productId,int planId);
	
	public List<PlanRespDto> getProductPlan(int productId);
	
	public List<ProductDto> getAllProducts();
	
	public ProductDto updateProduct(ProductDto pro);
	
	public ProductDto removeproduct(int productId);
}
