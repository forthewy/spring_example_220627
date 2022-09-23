package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selectReviewById(int id);
	
//	@Param은 하나의 Map을 만들어준다. 여러 개의 값을 받아와야할때 사용
// @Param은 repository DAO에서 사용.
	
	public int insertReview(Review review); // review 객체의 내용을 row(record)로 추가
	
	public int insertReviewAsField(
			@Param("storeId") int storeId,
			@Param("menu") String menu, 
			@Param("userName") String userName, 
			@Param("point") Double point, 
			@Param("review") String review);
	
	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review);
}
