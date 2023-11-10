package com.example.be.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.example.be.dto.BookingResponse;
import com.example.be.dto.CommentResponse;
import com.example.be.dto.RateResponse;
import com.example.be.dto.UserResponceClinic;
import com.example.be.entities.Attachment;
import com.example.be.entities.Booking;
import com.example.be.entities.Comment;
import com.example.be.entities.Rate;
import com.example.be.entities.User;

public class UserResponceClinicFunction {

	public static UserResponceClinic setUserResponceClinic(User user,String clinicId,List<Comment> commentExperts, List<Booking> bookingExperts, List<Booking> bookingDates,Set<Rate> rateExperts ,Attachment attachmentp) {
		UserResponceClinic userClinic = new UserResponceClinic();

		userClinic.setId(user.getId()); userClinic.setCreateAt(user.getCreateAt());
		userClinic.setUpdateAt(user.getUpdateAt()); userClinic.setCreatedBy(user.getCreatedBy());
		userClinic.setUpdatedBy(user.getUpdatedBy()); userClinic.setDeletedBy(user.getDeletedBy());
		userClinic.setUsername(user.getUsername()); userClinic.setFullName(user.getFullName());
		userClinic.setBirthday(user.getBirthday()); userClinic.setGender(user.getGender());
		userClinic.setAge(user.getAge()); userClinic.setBadPoint(user.getBadPoint());
		userClinic.setEmail(user.getEmail()); userClinic.setAddress(user.getAddress());
		userClinic.setMobile(user.getMobile()); userClinic.setAbout(user.getAbout());
		userClinic.setFacebook(user.getFacebook()); userClinic.setCode(user.getCode());
		userClinic.setFaculties(user.getFaculties()); userClinic.setDegrees(user.getDegrees());

		List<RateResponse> rateResponses = RateFunction.getRateResponses(rateExperts);
		userClinic.setRateResponses(rateResponses);

		List<String> dateBookingDoctors = DateBookingsFunction.getListDateStringBookings(bookingDates);
		userClinic.setDateBookingDoctors(dateBookingDoctors);

		List<CommentResponse> commentResponsList = new ArrayList<CommentResponse>();
		List<CommentResponse> commentResponses = CommentFunction.getCommentDoctor(commentExperts);
		for (int i = commentResponses.size()-1; i >=0 ; i--) {
			commentResponsList.add(commentResponses.get(i));
		}
		userClinic.setCommentExperts(commentResponsList);

		List<BookingResponse> bookingResponses = BookingFunction.getBookingDoctor(bookingExperts);
		userClinic.setBookingExperts(bookingResponses);

		Double countRate = RateFunction.getRateDoctor(rateExperts);
		userClinic.setCountRate(countRate);

		userClinic.setAttachmentPerson(attachmentp);
		return userClinic;
	}
}
