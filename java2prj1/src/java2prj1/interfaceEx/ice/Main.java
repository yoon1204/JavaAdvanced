package java2prj1.interfaceEx.ice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Icecream형을 담을 수 있는 ArrayList를 준비한다
		ArrayList<Icecream> list = new ArrayList<Icecream>();
		
		// Icecream을 상속받았으므로 각 각의 아이스크림 클래스를 담을 수 있다
		list.add(new B("슈퍼콘"));
		list.add(new B("캔디바"));
		list.add(new B("따옴바"));
		list.add(new L("수박바"));
		list.add(new L("스크류바"));
		list.add(new L("돼지바"));
		list.add(new N("바닐라아몬드"));
		list.add(new N("초콜릿아몬드"));
		list.add(new N("녹차초콜릿"));
		
		// 아이스크림 회사별로 ArrayList 준비하기
		ArrayList<Binggrae> 빙그레 = new ArrayList<Binggrae>();
		ArrayList<Lotte> 롯데 = new ArrayList<Lotte>();
		ArrayList<Natuur> 나뚜루 = new ArrayList<Natuur>();
		
		// 아이스크림 종류별로 목록을 구성한다.
		for(Icecream icecream : list) {
			if(icecream instanceof Binggrae) {
				빙그레.add((Binggrae) icecream);
			} else if (icecream instanceof Lotte) {
				롯데.add((Lotte) icecream);
			} else if (icecream instanceof Natuur) {
				나뚜루.add((Natuur) icecream);
			}
		}
		
		System.out.println("--빙그레 아이스크림--");
		System.out.println(빙그레);
		
		System.out.println("--롯데 아이스크림--");
		System.out.println(롯데);
		
		System.out.println("--나뚜루 아이스크림--");
		System.out.println(나뚜루);
		
		// 랜덤한 값 얻어오기
		int random = (int) (Math.random()*3);
		
		// 선택한 아이스크림 종류 출력하기
		String [] kinds = { "Binggrae", "Lotte", "Natuur"};
		String selectedKind = kinds[random];
		System.out.println("=====> 선택된 아이스크림 kind =====>" + selectedKind);
		
		
		// 선택된 아이스크림 브랜드 중에서 하나의 아이스크림 선택하기
		int randomRange = 0;
		int finalOne;
		Icecream finalIcecream = null;
		
		switch (selectedKind) {
		case "Binggrae":
			for(Binggrae icecream : 빙그레) {
				System.out.println(icecream);
			}
			randomRange = 빙그레.size();
			System.out.println("randomRange="+randomRange);
			finalOne = (int) (Math.random()*randomRange);
			finalIcecream = (Icecream) 빙그레.get(finalOne);
			
			System.out.println("====>최종선발 3초 후 공개");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(finalIcecream);
			break;
		case "Lotte":
			for(Lotte icecream : 롯데) {
				System.out.println(icecream);
			}
			randomRange = 롯데.size();
			System.out.println("randomRange="+randomRange);
			finalOne = (int) (Math.random()*randomRange);
			finalIcecream = (Icecream) 롯데.get(finalOne);
			
			System.out.println("====>최종선발 3초 후 공개");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(finalIcecream);
			break;
			
		case "Natuur":
			for (Natuur icecream : 나뚜루) {
				System.out.println(icecream);
			}
			randomRange = 나뚜루.size();
			System.out.println("randomRange="+randomRange);
			finalOne = (int) (Math.random()*randomRange);
			finalIcecream = (Icecream) 나뚜루.get(finalOne);
			
			System.out.println("====>최종선발 3초 후 공개");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(finalIcecream);
			break;
		}
		
	}
}
