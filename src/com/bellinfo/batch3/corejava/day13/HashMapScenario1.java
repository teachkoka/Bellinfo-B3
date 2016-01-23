package com.bellinfo.batch3.corejava.day13;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapScenario1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "Siva");
		hm.put(2, "Raghav");
		hm.put(3, "chaithanya");
		hm.put(3, "Gowri");
		hm.put(null, "Gowri");
		
		Set<Integer> set = hm.keySet();
		System.out.println("***Retriving HashMap using Set***");
		for(Integer i:set){
			System.out.println("Key "+ i + " value "+hm.get(i));
		}
		
		System.out.println("***Retriving HashMap using Entry***");
		for(Map.Entry<Integer, String> me:hm.entrySet()){
			System.out.println("Key "+me.getKey() + " value "+me.getValue() );
		}
		
		Collections.synchronizedMap(hm);
		
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();		
		
		//TODO Modification Update
		
		
		
		
	}

}

