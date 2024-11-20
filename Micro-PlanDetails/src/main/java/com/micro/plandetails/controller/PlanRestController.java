package com.micro.plandetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.plandetails.model.PlanDTO;
import com.micro.plandetails.service.IPlanService;

import io.swagger.annotations.ApiOperation;

@RestController
public class PlanRestController {
	@Autowired
	IPlanService service;

	@ApiOperation("Browse all plans")
	@GetMapping("/browsePlans")
	public List<PlanDTO> getPlans() {
		return service.getAllPlans();
	}

	@ApiOperation(value = "Get Plan Id")
	@GetMapping("/{planId}")
	public PlanDTO getSpecificPlan(@PathVariable String planId) {
		return service.getSpecificPlan(planId);
	}
}