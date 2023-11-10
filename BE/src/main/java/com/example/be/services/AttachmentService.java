package com.example.be.services;

import com.example.be.entities.Attachment;
import com.example.be.security.UserPrincipal;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
	
	Attachment storeFile(UserPrincipal currentUser, MultipartFile file,String attachmentType);
	
	Attachment getFile(String fileId);
}
