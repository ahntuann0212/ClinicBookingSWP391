package com.example.be.controller;

import com.example.be.dto.PriceRequest;
import com.example.be.payload.DataResponse;
import com.example.be.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/price")
public class PriceController {
	
	@Autowired
	PriceService priceService;
	
	@RequestMapping(value= "{id_clinic}",method = RequestMethod.POST, produces = "application/json")
	public DataResponse createToken (@PathVariable("id_clinic") String id_clinic, @RequestBody List<PriceRequest> priceRequests ){
		return priceService.addPricesClinic(id_clinic, priceRequests);
	}
	
}
