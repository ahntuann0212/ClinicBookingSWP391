package com.example.be.controller;

import com.example.be.dto.ClinicsRequest;
import com.example.be.dto.CommentRequest;
import com.example.be.payload.DataResponse;
import com.example.be.security.CurrentUser;
import com.example.be.security.UserPrincipal;
import com.example.be.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public DataResponse CommentToDoctor(@CurrentUser UserPrincipal currentUser, @Valid @RequestBody CommentRequest commentRequest){
		return commentService.addComment(currentUser,commentRequest);
	}
	
	@RequestMapping(value= "doctor/{id_doctor}/{id_clinic}",method = RequestMethod.GET, produces = "application/json")
	public DataResponse getCommentDoctor(@CurrentUser UserPrincipal currentUser, @PathVariable("id_doctor") String id_doctor,@PathVariable("id_clinic") String id_clinic){
		  ClinicsRequest clinicsRequest = new ClinicsRequest(id_clinic, id_doctor);
		  return commentService.getListCommentDoctor(clinicsRequest);
	}
	
}
