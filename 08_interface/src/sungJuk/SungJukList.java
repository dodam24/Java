package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		
		for(SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO.getNo() + "\t"
							+ sungJukDTO.getName() + "\t"
							+ sungJukDTO.getKor() + "\t"
							+ sungJukDTO.getEng() + "\t"
							+ sungJukDTO.getMath() + "\t"
							+ sungJukDTO.getTot() + "\t"
							+ sungJukDTO.getAvg() + "\t");			
		}

	}

}
