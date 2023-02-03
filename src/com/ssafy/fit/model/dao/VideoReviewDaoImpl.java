package com.ssafy.fit.model.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.ssafy.fit.model.VideoReview;


public class VideoReviewDaoImpl implements VideoReviewDao {
	
	private static int reviewNo;
	private List<VideoReview> list = new ArrayList<>();
	private Map<Integer,List<VideoReview>> videoReviewDb;
	
	private static VideoReviewDaoImpl instance = new VideoReviewDaoImpl();
	
	public static VideoReview[] arr;
	public static int a = 0;
	
	private VideoReviewDaoImpl() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("data/review.json")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 한줄씩 읽어오기
		String str = null;
		StringBuilder sb = new StringBuilder(); // 한 줄씩 읽어온 것들 이어붙이기
		try {
			while((str=br.readLine())!=null) {
				sb.append(str).append("\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Gson gson = new Gson();
		VideoReview[] arr = gson.fromJson(sb.toString(),VideoReview[].class);
		list = Arrays.asList(arr);
		System.out.println(list);
	};
	
	
	
	
	
	public static VideoReviewDaoImpl getInstance() {
		return instance;
		}
	
	
	
	
	public int insertReview(VideoReview videoReview) {
		return 0;
		}
	
	
	
	
	public List<VideoReview> selectReview(int videoNo){
		return null;
		}
	
	
}
