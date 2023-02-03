package com.ssafy.fit.model.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.ssafy.fit.model.Video;

public class VideoDaoImpl implements VideoDao {

	private List<Video> list = new ArrayList<>();
	
	private static VideoDaoImpl instance = new VideoDaoImpl();

	
	private VideoDaoImpl() {
		// 생성자 호출될때 데이터 파일이 불려와져야 할듯?
		// == instance 호출될때
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("data/video.json")));
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
		Video[] arr = gson.fromJson(sb.toString(),Video[].class);
		list = Arrays.asList(arr);
		System.out.println(list);
		
	}

	public static VideoDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<Video> selectVideo() {
		return list;
	}

	@Override
	public Video selectVideoByNo(int no) {
		Video selectedVideo = new Video();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				selectedVideo = list.get(i);
			}
		}
		return selectedVideo;
	}

}
