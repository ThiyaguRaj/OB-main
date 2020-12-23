package com.onebill.productbilling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.productbilling.dao.ProductDao;
import com.onebill.productbilling.dto.PlanDetailRespDto;
import com.onebill.productbilling.dto.PlanRespDto;
import com.onebill.productbilling.dto.ProductDto;
import com.onebill.productbilling.exception.BillingException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	public void setProductDao(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public ProductDto addProduct(ProductDto pro) {
		ProductDto product = null;
		try {
			product = dao.addProduct(pro);
			if (product != null) {
				return product;
			} else {
				throw new BillingException("Failed to add product with Name " + pro.getProductName() + " and Type "
						+ pro.getProductType());
			}
		} catch (Exception e) {
			throw new BillingException(
					"Failed to add product with Name " + pro.getProductName() + " and Type " + pro.getProductType());
		}
	}

	@Override
	public ProductDto getProduct(String productName) {
		ProductDto product = null;
		try {
			product = dao.getProduct(productName);
			if (product != null) {
				return product;
			} else {
				throw new BillingException("No Product Found for " + productName);
			}
		} catch (Exception e) {
			throw new BillingException("No Product Found for " + productName);
		}
	}

	@Override
	public List<ProductDto> getAllProducts() {
		List<ProductDto> product = null;
		try {
			product = dao.getAllProducts();
			if (!product.isEmpty()) {
				return product;
			} else {
				throw new BillingException("No product present to display");
			}
		} catch (Exception e) {
			throw new BillingException("No product present to display");
		}
	}

	@Override
	public ProductDto updateProduct(ProductDto pro) {
		ProductDto product = null;
		try {
			product = dao.updateProduct(pro);
			if (product != null) {
				return product;
			} else {
				throw new BillingException("Failed to Update product with given product id of " + pro.getProductId()
						+ " and name " + pro.getProductName() + " and type of " + pro.getProductType());
			}
		} catch (Exception e) {
			throw new BillingException("Failed to Update product with given product id of " + pro.getProductId()
					+ " and name " + pro.getProductName() + " and type of " + pro.getProductType());
		}
	}

	@Override
	public ProductDto removeproduct(int productId) {
		ProductDto product = null;
		try {
			product = dao.removeproduct(productId);
			if (product != null) {
				return product;
			} else {
				throw new BillingException("Failed to remove product");
			}
		} catch (Exception e) {
			throw new BillingException("Failed to remove product of id : " + productId);
		}
	}

	@Override
	public ProductDto getProductWithId(int productId) {
		ProductDto product = null;
		try {
			product = dao.getProductWithId(productId);
			if (product != null) {
				return product;
			} else {
				throw new BillingException("No Products found for given id " + productId);
			}
		} catch (Exception e) {
			throw new BillingException("No Products found for given id " + productId);
		}
	}

	@Override
	public List<PlanRespDto> getProductPlan(int productId) {
		List<PlanRespDto> plan1 = null;
		try {
			plan1 = dao.getProductPlan(productId);
			if (!plan1.isEmpty()) {
				return plan1;
			} else {
				throw new BillingException("No plan available for this product");
			}
		} catch (Exception e) {
			throw new BillingException("No plan available for this product");
		}
	}

	@Override
	public List<PlanDetailRespDto> getPlanDetail(int productId, int planId) {
		List<PlanDetailRespDto> detail = null;
		try {
			detail = dao.getPlanDetail(productId,planId);
			if (!detail.isEmpty()) {
				return detail;
			} else {
				throw new BillingException("No details available for this plan");
			}
		} catch (Exception e) {
			throw new BillingException("No details available for this plan id ("+planId+") of product ID ("+productId+")");
		}
	}

}