package info.view;

import java.util.ArrayList;

import info.vo.ProduatVo;


public class ProduatView {
	public void View(ArrayList<ProduatVo> proList) {
		for(ProduatVo pvo : proList) {
			System.out.println("제품명: "+pvo.getName()+"\t");
			System.out.println("가격: "+pvo.getPrice()+"\t");
			System.out.println("재고: "+pvo.getStock()+"\t");
			
		}
	}
}
