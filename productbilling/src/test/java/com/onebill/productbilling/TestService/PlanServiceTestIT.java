package com.onebill.productbilling.TestService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.onebill.productbilling.Entities.Plan;
import com.onebill.productbilling.Entities.Product;
import com.onebill.productbilling.TestConfig.ProductServiceTestConfig;
import com.onebill.productbilling.dto.PlanChargeDto;
import com.onebill.productbilling.dto.PlanChargeRespDto;
import com.onebill.productbilling.dto.PlanDetailDto;
import com.onebill.productbilling.dto.PlanDetailRespDto;
import com.onebill.productbilling.dto.PlanDto;
import com.onebill.productbilling.dto.PlanOverdueDto;
import com.onebill.productbilling.dto.PlanOverdueRespDto;
import com.onebill.productbilling.dto.PlanRespDto;
import com.onebill.productbilling.service.PlanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ProductServiceTestConfig.class })
public class PlanServiceTestIT {

	private PlanService planService;

	@Autowired
	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}

	private Plan plan;
	
	private PlanDto planDto;
	
	private Product dto;
	
	private PlanDetailDto detail;
	
	private PlanChargeDto charge;
	
	private PlanOverdueDto due;

	@Before
	public void setup() {
		dto = new Product();
		dto.setProductId(100);
		dto.setProductName("Airtel");
		dto.setProductType("Sim");
		
		plan=new Plan();
		plan.setPlanId(1);
		plan.setPlanFrequency(28);
		plan.setPlanAmount(199);
		plan.setType("Data");
		plan.setProduct(dto);
		
		planDto=new PlanDto();
		planDto.setPlanId(1);
		planDto.setPlanFrequency(28);
		planDto.setPlanAmount(199);
		planDto.setType("Data");
		planDto.setProduct(dto);
		
		detail=new PlanDetailDto();
		detail.setDetail(2);
		detail.setServiceType("Data");
		detail.setUnit("GB");
		detail.setPlan(plan);
		
		charge=new PlanChargeDto();
		charge.setCharge(100);
		charge.setChargeType("Activation");
		charge.setDocument("Adhar");
		charge.setPlan(plan);
		
		due=new PlanOverdueDto();
		due.setOverageService(1);
		due.setOverageType("Data");
		due.setPlan(plan);
		due.setServiceCost(46);
		due.setUnit("GB");
	}
	
	@Test
	public void testAddPlan() {
		PlanRespDto obj=planService.addPlan(planDto);
		assertEquals(planDto, obj);
	}
	
	@Test
	public void testGetAllPlans() {
		List<PlanRespDto> list=planService.getAllPlans();
		assertNotNull(list);
	}
	
	@Test
	public void testUpdatePlan() {
		PlanRespDto obj=planService.updatePlan(planDto);
		assertNotEquals(planDto, obj);
	}
	
	@Test
	public void testRemovePlan() {
		PlanRespDto obj=planService.removePlan(planDto.getPlanId());
		assertEquals(planDto, obj);
	}
	
	@Test
	public void testAddCharge() {
		PlanChargeRespDto obj=planService.addPlanCharge(charge);
		assertEquals(charge,obj);
	}
	
	@Test
	public void testGetCharges() {
		List<PlanChargeRespDto> list=planService.getPlanCharge(planDto.getPlanId());
		assertFalse(list.size()==0);
	}
	
	@Test
	public void testUpdateCharge() {
		PlanChargeRespDto obj=planService.updatePlanCharge(charge);
		assertEquals(charge,obj);
	}
	
	@Test
	public void testRemovePlanCharge() {
		PlanChargeRespDto obj=planService.removePlanCharge(charge);
		assertEquals(charge, obj);
	}
	
	@Test
	public void testAddOverdue() {
		PlanOverdueRespDto obj=planService.addOverdueDetails(due);
		assertEquals(due,obj);
	}
	
	@Test
	public void testGetOverdueDetails() {
		List<PlanOverdueRespDto> list=planService.getOverdueDetails(planDto.getPlanId());
		assertFalse(list.size()==0);
	}
	
	@Test
	public void testUpdateOverdue() {
		PlanOverdueRespDto obj=planService.updateOverdueDetails(due);
		assertEquals(due,obj);
	}
	
	@Test
	public void testRemovePlanOverdue() {
		PlanOverdueRespDto obj=planService.removeOverdueDetails(due);
		assertEquals(due, obj);
	}
	
	@Test
	public void testAddDetail() {
		PlanDetailRespDto obj=planService.addPlanDetail(detail);
		assertEquals(detail,obj);
	}
	
	@Test
	public void testGetDetails() {
		List<PlanDetailRespDto> list=planService.getPlanDetail(planDto.getPlanId());
		assertFalse(list.size()==0);
	}
	
	@Test
	public void testUpdateDetails() {
		PlanDetailRespDto obj=planService.updatePlanDetail(detail);
		assertEquals(detail,obj);
	}
	
	@Test
	public void testRemovePlanDetail() {
		PlanDetailRespDto obj=planService.removePlanDetail(detail);
		assertEquals(detail, obj);
	}
	
	
}
