package com.onebill.productbilling.TestConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.productbilling.TestRepo.PlanDaoTestStub;
import com.onebill.productbilling.TestRepo.ProductDaoTestStub;
import com.onebill.productbilling.dao.PlanDao;
import com.onebill.productbilling.dao.ProductDao;
import com.onebill.productbilling.service.PlanService;
import com.onebill.productbilling.service.PlanServiceImpl;
import com.onebill.productbilling.service.ProductService;
import com.onebill.productbilling.service.ProductServiceImpl;

@Configuration
public class ProductServiceTestConfig {

	@Bean
	ProductDao getObj() {
		return new ProductDaoTestStub();
	}
	
	@Bean
	ProductService getService() {
		return new ProductServiceImpl();
	}

	@Bean
	PlanDao getPlanObj() {
		return new PlanDaoTestStub();
	}
	
	@Bean
	PlanService getPlanService() {
		return new PlanServiceImpl();
	}
	
}
