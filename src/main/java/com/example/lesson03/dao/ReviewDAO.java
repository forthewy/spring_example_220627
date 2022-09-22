package com.example.lesson03.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selectReviewById(int id);
	
//	@Param은 하나의 Map을 만들어준다. 여러 개의 값을 받아와야할때 사용
// @Param은 repository DAO에서 사용.
	
}
