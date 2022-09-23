package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RequestMapping("/lesson03/ex02")
@RestController
public class Lesson03Ex02RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// 요청url: http://localhost/lesson03/ex02/1
	@RequestMapping("/1")
	public String ex02_1() {
		Review review = new Review(); // java bean
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("김인간");
		review.setPoint(4.5);
		review.setReview("혼자먹기 딱 적당하네요");
		
		// insert
		int row = reviewBO.addReview(review); // insert 된 row 수를 리턴 받는다.
		
		// return string
		return "success row count :" + row;
	}
	
	@RequestMapping("/2")
	public String ex02_2() {
		int row = reviewBO.addReviewAsField(4, "콤비네이션R", "김휴먼", 5.0, "역시 맛있다!!!");
		return "success row count:" + row;
	}
}
