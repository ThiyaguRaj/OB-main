package com.onebill.productbilling.TestRepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.onebill.productbilling.Entities.Plan;
import com.onebill.productbilling.Entities.Product;
import com.onebill.productbilling.dao.PlanDao;
import com.onebill.productbilling.dto.PlanChargeDto;
import com.onebill.productbilling.dto.PlanChargeRespDto;
import com.onebill.productbilling.dto.PlanDetailDto;
import com.onebill.productbilling.dto.PlanDetailRespDto;
import com.onebill.productbilling.dto.PlanDto;
import com.onebill.productbilling.dto.PlanOverdueDto;
import com.onebill.productbilling.dto.PlanOverdueRespDto;
import com.onebill.productbilling.dto.PlanRespDto;

public class PlanDaoTestStub implements PlanDao {

	@Override
	public PlanRespDto addPlan(PlanDto plan) {
		PlanRespDto planDto = new PlanRespDto();
		planDto.setPlanId(1);
		planDto.setPlanFrequency(28);
		planDto.setPlanAmount(199);
		planDto.setType("Data");
		Product p = new Product();
		p.setProductId(100);
		p.setProductName("Airtel");
		p.setProductType("Sim");
		return planDto;
	}

	@Override
	public List<PlanRespDto> getPlan(int productId) {
		return null;
	}

	@Override
	public List<PlanRespDto> getAllPlans() {

		PlanRespDto planDto = new PlanRespDto();
		planDto.setPlanId(1);
		planDto.setPlanFrequency(28);
		planDto.setPlanAmount(199);
		planDto.setType("Data");
		Product p = new Product();
		p.setProductId(100);
		p.setProductName("Airtel");
		p.setProductType("Sim");
		List<PlanRespDto> list = new ArrayList<>();
		list.add(planDto);
		return list;
	}

	@Override
	public PlanRespDto updatePlan(PlanDto plan) {
		PlanRespDto planDto = new PlanRespDto();
		planDto.setPlanId(plan.getPlanId());
		planDto.setPlanFrequency(28);
		planDto.setPlanAmount(399);
		planDto.setType("Data");
		return planDto;
	}

	@Override
	public PlanRespDto removePlan(int planId) {
		PlanRespDto planDto = new PlanRespDto();
		planDto.setPlanId(planId);
		planDto.setPlanFrequency(28);
		planDto.setPlanAmount(399);
		planDto.setType("Data");
		return planDto;
	}

	@Override
	public PlanDetailRespDto addPlanDetail(PlanDetailDto detail) {
		PlanDetailRespDto dto = new PlanDetailRespDto();
		BeanUtils.copyProperties(detail,dto);
		return dto;
	}

	@Override
	public List<PlanDetailRespDto> getPlanDetail(int planId) {
		Plan p = new Plan();
		p.setPlanId(planId);
		PlanDetailRespDto dto = new PlanDetailRespDto();
		dto.setDetail(1);
		List<PlanDetailRespDto> list = new ArrayList<>();
		list.add(dto);
		return list;
	}

	@Override
	public PlanDetailRespDto updatePlanDetail(PlanDetailDto plan) {
		PlanDetailRespDto dto = new PlanDetailRespDto();
		BeanUtils.copyProperties(plan,dto);
		return dto;
	}

	@Override
	public PlanDetailRespDto removePlanDetail(PlanDetailDto plan) {
		Plan p = new Plan();
		p.setPlanId(plan.getPlan().getPlanId());
		PlanDetailRespDto dto = new PlanDetailRespDto();
		dto.setDetail(1);
		return dto;
	}

	@Override
	public PlanChargeRespDto addPlanCharge(PlanChargeDto plan) {
		PlanChargeRespDto dto=new PlanChargeRespDto();
		BeanUtils.copyProperties(plan,dto);
		return dto;
	}

	@Override
	public List<PlanChargeRespDto> getPlanCharge(int planId) {
		Plan p = new Plan();
		p.setPlanId(planId);
		PlanChargeRespDto dto = new PlanChargeRespDto();
		dto.setCharge(100);
		List<PlanChargeRespDto> list = new ArrayList<>();
		list.add(dto);
		return list;
	}

	@Override
	public PlanChargeRespDto updatePlanCharge(PlanChargeDto plan) {
		PlanChargeRespDto dto=new PlanChargeRespDto();
		BeanUtils.copyProperties(plan,dto);
		return dto;
	}

	@Override
	public PlanChargeRespDto removePlanCharge(PlanChargeDto plan) {
		PlanChargeRespDto dto=new PlanChargeRespDto();
		BeanUtils.copyProperties(plan,dto);
		return dto;
	}

	@Override
	public PlanOverdueRespDto addOverdueDetails(PlanOverdueDto plan) {
		PlanOverdueRespDto dto = new PlanOverdueRespDto();
		BeanUtils.copyProperties(plan,dto);
		return dto;
	}

	@Override
	public List<PlanOverdueRespDto> getOverdueDetails(int planId) {
		Plan p = new Plan();
		p.setPlanId(planId);
		PlanOverdueRespDto dto = new PlanOverdueRespDto();
		dto.setOverageType("Data");
		List<PlanOverdueRespDto> list = new ArrayList<>();
		list.add(dto);
		return list;
	}

	@Override
	public PlanOverdueRespDto updateOverdueDetails(PlanOverdueDto plan) {
		PlanOverdueRespDto dto = new PlanOverdueRespDto();
		BeanUtils.copyProperties(plan,dto);
		return dto;
	}

	@Override
	public PlanOverdueRespDto removeOverdueDetails(PlanOverdueDto plan) {
		PlanOverdueRespDto dto = new PlanOverdueRespDto();
		BeanUtils.copyProperties(plan,dto);
		return dto;
	}

}
