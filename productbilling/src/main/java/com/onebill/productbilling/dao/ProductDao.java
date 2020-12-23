package com.onebill.productbilling.dao;

import java.util.List;

import com.onebill.productbilling.dto.PlanDetailRespDto;
import com.onebill.productbilling.dto.PlanRespDto;
import com.onebill.productbilling.dto.ProductDto;

public interface ProductDao {

	public ProductDto addProduct(ProductDto pro);

	public ProductDto getProduct(String productName);

	public ProductDto getProductWithId(int productId);
	
	public List<PlanRespDto> getProductPlan(int productId);
	
	public List<PlanDetailRespDto> getPlanDetail(int productId,int planId);

	public List<ProductDto> getAllProducts();

	public ProductDto updateProduct(ProductDto pro);
	
	public ProductDto removeproduct(int productId);
}
