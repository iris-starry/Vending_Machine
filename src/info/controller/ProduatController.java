package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.vo.ProduatVo;


public class ProduatController {
	public static final int CONTINUE = 1;
	public static final int EXIT = 0;
	
	ArrayList<ProduatVo> proList;
	
	int money=0;
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in); //String
		Scanner s2 = new Scanner(System.in); //int
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> price = new ArrayList<Integer>();
		ArrayList<Integer> stock = new ArrayList<Integer>();
		
		int flag = CONTINUE;
		System.out.println("===== 자판기 =====");
		while(true) {
			System.out.println("0. 종료 1. 제품관리 2. 자판기사용");
			flag = s2.nextInt();
			System.out.println("---------------------------------------");
			if(flag==1) {
				System.out.print("제품명 : ");
				name.add(s1.next());
				
				System.out.print("가격 : ");
				price.add(s2.nextInt());
				
				System.out.print("재고 : ");
				stock.add(s2.nextInt());
			}else if(flag==2) {
				
			}
		}
	}
}
