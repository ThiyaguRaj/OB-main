package com.onebill.productbilling.TestService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.onebill.productbilling.TestRepo.ProductDaoTestStub;
import com.onebill.productbilling.dto.ProductDto;
import com.onebill.productbilling.service.ProductServiceImpl;

public class ProductServiceImplTest {

	private ProductServiceImpl productService;
	private ProductDto dto;

	@Before
	public void setup() {
		productService = new ProductServiceImpl();
		productService.setProductDao(new ProductDaoTestStub());
		dto = new ProductDto();
		dto.setProductId(100);
		dto.setProductName("Airtel");
		dto.setProductType("Sim");
	}

	@Test
	public void testAddProduct() {

		ProductDto prod = productService.addProduct(dto);
		assertEquals(prod.getProductName(), dto.getProductName());
	}

	@Test
	public void testGetProducts() {
		List<ProductDto> li = productService.getAllProducts();
		assertNotNull(li);
	}

	@Test
	public void testGetProduct() {
		ProductDto dto = productService.getProduct("Airtel");
		assertEquals("Airtel", dto.getProductName());
	}

	@Test
	public void testUpdateProduct() {
		ProductDto pro = productService.updateProduct(dto);
		assertNotEquals(dto, pro);
	}

}
