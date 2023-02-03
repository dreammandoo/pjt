package com.ssafy.fit.util;

import java.util.Scanner;

public class SsafitUtil {
	private static Scanner sc = new Scanner(System.in);

	// 1이나 0을 받았을 때 어떤 화면을 출력해줘야 될지 모름 그거 구분해주는 cnt
	private static int cnt = 0;
	private static int vidNum = 0;

	private SsafitUtil() {
	}

	// 다음에 입력해야 되는게 리뷰 내요이나 그런거 일경우
	public static String input(String msg) {
		return null;
	}

	// 다음에 선택해야되는게 메뉴 선택/번호 선택일 경우
	public static int inputInt(String msg) {
		int identifier = Integer.parseInt(msg);
		if(cnt == 3) {
			vidNum = identifier;
			identifier = 1;
		}
		if (identifier == 0 || identifier == 1) {
			if (Integer.parseInt(msg) == 0)
				cnt--;
			else
				cnt++;

			if (cnt < 0) {
				SsafitUtil.screenClear();
				System.out.println("프로그램을 종료합니다.");
				return 0;
			} else {
				if (cnt == 0) {
					SsafitUtil.screenClear();
					SsafitUtil.printLine();
					System.out.println("자바로 구현하는 SSAFIT");
					SsafitUtil.printLine();
					SsafitUtil.printLine();
					System.out.println("1. 영상정보");
					System.out.println("0. 종료");

				} else if (cnt == 1) {
					SsafitUtil.screenClear();
					SsafitUtil.printLine();
					System.out.println("1. 영상목록");
					System.out.println("0. 이전으로");
				} else if (cnt == 2) {
					SsafitUtil.screenClear();
					SsafitUtil.printLine();
					System.out.println("전체" + "list.size()" + "개");
					SsafitUtil.printLine();
//					for(int i = 0; i<list.size(); i+++) {
//						System.out.println(i+1 + "  " + "제목(getTitle?)");
//					}
					System.out.println(8 + "제목(getTitle?)");
					SsafitUtil.printLine();
					System.out.println("1. 영상상세");
					System.out.println("0. 이전으로");
				} else if (cnt == 3) {
					System.out.println("영상번호를 입력하세요");
					System.out.println("돌아가려면 0번을 입력하세요");
					SsafitUtil.inputInt(sc.next());
				} else if (cnt == 4) {
					SsafitUtil.screenClear();
					SsafitUtil.printLine();
					System.out.println("영상 상세");
					SsafitUtil.printLine();
					SsafitUtil.printLine();
					System.out.println("영상리뷰 : " + "리뷰개수" + "개");
					SsafitUtil.printLine();
					System.out.println("리뷰 리스트 넣어야 됨");
					SsafitUtil.printLine();
					System.out.println("1. 리뷰등록");
					System.out.println("0. 이전으로");
				}
			}
		} else if (cnt == 3) {
			SsafitUtil.input(sc.next());
		} else {
			System.out.println("제대로 된 값을 입력하시오: ");
		}

		if (cnt < 3) {
			SsafitUtil.printLine();
			System.out.println("메뉴를 선택하세요: ");
			return SsafitUtil.inputInt(sc.next());
		} else if (cnt > 3 && cnt <= 4) {
			SsafitUtil.printLine();
			System.out.println("메뉴를 선택하세요: ");
			return SsafitUtil.inputInt(sc.next());
		} else if (cnt == 5) {
			System.out.println("닉네임을 입력하세요: ");
			SsafitUtil.input(sc.next());
		}
		return cnt;
	}

	public static void printLine() {
		for (int i = 0; i < 25; i++) {
			System.out.print("--");
		}
		System.out.println();
	}

	public static void screenClear() {
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}
}
