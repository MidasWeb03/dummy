package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
	public static void main(String args[]){
		int rowCnt=0;
		int id, score;
		try{
			rowCnt  = Integer.parseInt(args[0]);
			if(rowCnt>99999) throw new IllegalArgumentException("사원 번호는 99999보다 클 수 없습니다.");
		} catch (Exception e){
			e.printStackTrace();
			System.exit(0);
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<rowCnt; i++){
			do{
				id = (int)(Math.random()*100000);
			}while(map.containsKey(id));
			map.put(id, i);
			score = (int)(Math.random()*100);
			System.out.println("NT"+String.format("%05d", id)+" "+String.format("%02d",score));
		}
	}
}