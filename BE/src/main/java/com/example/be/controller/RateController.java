package com.example.be.controller;

import com.example.be.dto.ClinicsRequest;
import com.example.be.dto.RateRequest;
import com.example.be.payload.DataResponse;
import com.example.be.security.CurrentUser;
import com.example.be.security.UserPrincipal;
import com.example.be.services.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/rates")
public class RateController {
	
	@Autowired
	RateService rateService;
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public DataResponse RateToDoctor(@CurrentUser UserPrincipal currentUser, @Valid @RequestBody RateRequest rateRequest){
		return rateService.addRate(currentUser, rateRequest);
	}
	
	@RequestMapping(value= "doctor/{id_doctor}/{id_clinic}",method = RequestMethod.GET, produces = "application/json")
	public DataResponse getCommentDoctor(@CurrentUser UserPrincipal currentUser, @PathVariable("id_doctor") String id_doctor,@PathVariable("id_clinic") String id_clinic){
		  ClinicsRequest clinicsRequest = new ClinicsRequest(id_clinic, id_doctor);
		  return rateService.getRatetDoctor(clinicsRequest);
	}
}
