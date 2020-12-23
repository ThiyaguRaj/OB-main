package com.onebill.productbilling.TestService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.onebill.productbilling.TestConfig.ProductServiceTestConfig;
import com.onebill.productbilling.dto.ProductDto;
import com.onebill.productbilling.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ProductServiceTestConfig.class })
public class ProductServiceImplIT {

	private ProductService productService;

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	private ProductDto dto;

	@Before
	public void setup() {
		dto = new ProductDto();
		dto.setProductId(100);
		dto.setProductName("Airtel");
		dto.setProductType("Sim");
	}

	@Test
	public void testAddProduct() {
		ProductDto pro = productService.addProduct(dto);
		assertEquals(pro.getProductName(), dto.getProductName());
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
