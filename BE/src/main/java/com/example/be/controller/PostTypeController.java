package com.example.be.controller;

import com.example.be.payload.DataResponse;
import com.example.be.services.PostTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/post-types")
public class PostTypeController {
	
	@Autowired
	PostTypeService postTypeService;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public DataResponse getAllPostType(){
		return postTypeService.getAllPostType();
	}
}
