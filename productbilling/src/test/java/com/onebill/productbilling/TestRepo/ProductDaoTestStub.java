package com.onebill.productbilling.TestRepo;

import java.util.ArrayList;
import java.util.List;

import com.onebill.productbilling.dao.ProductDao;
import com.onebill.productbilling.dto.PlanChargeRespDto;
import com.onebill.productbilling.dto.PlanDetailRespDto;
import com.onebill.productbilling.dto.PlanOverdueRespDto;
import com.onebill.productbilling.dto.PlanRespDto;
import com.onebill.productbilling.dto.ProductDto;

public class ProductDaoTestStub implements ProductDao {

	@Override
	public ProductDto addProduct(ProductDto pro) {
		ProductDto dto = new ProductDto();
		dto.setProductId(100);
		dto.setProductName("Airtel");
		dto.setProductType("Sim");
		return dto;
	}

	@Override
	public ProductDto getProduct(String productName) {
		ProductDto dto = new ProductDto();
		dto.setProductId(100);
		dto.setProductName("Airtel");
		dto.setProductType("Sim");
		return dto;
	}

	@Override
	public List<ProductDto> getAllProducts() {
		ProductDto dto=new ProductDto();
		dto.setProductId(100);
		dto.setProductName("Airtel");
		dto.setProductType("Sim");
		ProductDto dto1=new ProductDto();
		dto1.setProductId(101);
		dto1.setProductName("JIO");
		dto1.setProductType("Sim");
		List<ProductDto> list=new ArrayList<ProductDto>();
		list.add(dto);
		list.add(dto1);
		return list;
	}

	@Override
	public ProductDto updateProduct(ProductDto pro) {
		ProductDto dto=new ProductDto();
		dto.setProductId(pro.getProductId());
		dto.setProductName("Airtel Band");
		dto.setProductType("Broadband");
		return dto;
	}

	@Override
	public ProductDto getProductWithId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDto removeproduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanRespDto> getProductPlan(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanDetailRespDto> getPlanDetail(int productId, int planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanChargeRespDto> getPlanCharge(int productId, int planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanOverdueRespDto> getPlanOverdue(int productId, int planId) {
		// TODO Auto-generated method stub
		return null;
	}

}
