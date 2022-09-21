package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewDAO;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO;
	
	// input : id
	// output: Review // where --> by 로 써주기 column명 적어주기
	// Integer 안올수도 있다. int는 반드시 온다.
	public Review getReviewById(int id) {
		return reviewDAO.selectReviewById(id);
	}
}