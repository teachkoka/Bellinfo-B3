package com.bellinfo.batch3.corejava.day12;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        System.out.println("**** Using For Loop *****");
        for(int i=0;i<=integerList.size()-1;i++){
        	System.out.print(integerList.get(i) + " ");
        }

        Iterator<Integer> ii = integerList.iterator();
        System.out.println("\n**** Using Iterator *****");
        while(ii.hasNext()){
        	System.out.print(ii.next() + " ");
        }
        
        System.out.println("\n****Using foreach *****");
        for(Integer i:integerList){
        	System.out.print(i + " ");
        }
        
        
	}

}
