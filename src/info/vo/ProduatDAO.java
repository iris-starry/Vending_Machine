package info.vo;

import java.util.ArrayList;

public class ProduatDAO {
	ArrayList<ProduatVo> proList = new ArrayList<ProduatVo>();
	
	public void insert(ProduatVo pvo) {
		proList.add(pvo);
	}
	
	public ArrayList<ProduatVo> select(){
		return proList;
	}
	
}
