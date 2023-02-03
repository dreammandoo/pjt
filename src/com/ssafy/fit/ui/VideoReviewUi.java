package com.ssafy.fit.ui;

import com.ssafy.fit.model.dao.VideoReviewDao;

public class VideoReviewUi {
	private VideoReviewDao videoReview;
	private static VideoReviewUi instance=new VideoReviewUi();
	private int videoNo;
	
	private VideoReviewUi() {};
	
	public static VideoReviewUi getinsatance(int videoNo) {
		return instance;
	}
	
	public void service() {}
	
	private void listReview() {}
	
	private void registReview() {}
}
