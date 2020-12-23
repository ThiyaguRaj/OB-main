package com.onebill.productbilling.TestRepo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.onebill.productbilling.dao.ProductDaoImpl;
import com.onebill.productbilling.dto.ProductDto;

public class ProductDaoTest {

	@Test
	public void testAdd() {
		ProductDaoImpl repo=new ProductDaoImpl();
		ProductDto dto=new ProductDto();
		dto.setProductId(100);
		dto.setProductName("Airtel");
		dto.setProductType("Sim");
		ProductDto pro=repo.addProduct(dto);
		assertEquals(dto.getProductName(), pro.getProductName());
	}

}
