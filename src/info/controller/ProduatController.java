package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.view.ProduatView;
import info.vo.ProduatDAO;
import info.vo.ProduatVo;


public class ProduatController {
	public static final int CONTINUE = 1;
	public static final int EXIT = 0;
	
	ArrayList<ProduatVo> proList;
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in); //String
		Scanner s2 = new Scanner(System.in); //int
		
		int num=0;
		int money=0;
		
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> price = new ArrayList<Integer>();
		ArrayList<Integer> stock = new ArrayList<Integer>();
		ProduatDAO pao = new ProduatDAO();
		int flag;
		System.out.println("===== 자판기 =====");
		while(true) {
			System.out.println("0. 종료 1. 제품관리 2. 자판기사용");
			flag = s2.nextInt();
			System.out.println("---------------------------------------");
			if(flag==1) {
				//제품입력
				System.out.print("제품명 : ");
				name.add(s1.next());
				
				System.out.print("가격 : ");
				price.add(s2.nextInt());
				
				System.out.print("재고 : ");
				stock.add(s2.nextInt());
				System.out.println("입력완료");
				System.out.println("");
				
			}else if(flag==2) {
				//자판기 제품 출력
				ProduatView pView = new ProduatView();
				pView.View(pao.select());
				
				System.out.print("몇번째 : ");
				num = s1.nextInt();
				System.out.printf("가격 : %d\n",price.get(num-1));
				System.out.print("금액을 투입해주십시오 : ");
				money = s1.nextInt();
				if(num>money) {
					System.out.println("금액이 부족합니다.");
				}else if(num==money) {
					System.out.println("구매감사합니다.");
				}else {
					System.out.println("거스름돈 : "+(money-price.get(num-1)));
					System.out.println("구매감사합니다.");
				}
				
			}else if(flag == EXIT) {
				break;
			}
			//추가
			for(int i=0; i< name.size(); i++) {
				ProduatVo pvo = new ProduatVo(name.get(i),  price.get(i), stock.get(i));
				pao.insert(pvo);
			}
			
		}
	}
}
