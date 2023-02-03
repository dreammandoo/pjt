package com.ssafy.fit.test;

import java.util.Scanner;

import com.ssafy.fit.model.dao.VideoDao;
import com.ssafy.fit.model.dao.VideoDaoImpl;
import com.ssafy.fit.model.dao.*;

public class SsafitApplication {

	public static void main(String[] args) {
		VideoDao vdi =  VideoDaoImpl.getInstance();
		Scanner sc = new Scanner(System.in);
		
		
		
		sc.close();
		VideoDaoImpl.getInstance();
		VideoReviewDaoImpl.getInstance();
		
	}


}
