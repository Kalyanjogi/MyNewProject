package com.abp.kalyan;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Hashmapretrive {
	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1, "kalyan");
		hm.put(2,"kalyan");
		hm.put(3, "kalyan");
		System.out.println(hm);
		/*TreeMap smap=new TreeMap<>(hm);
		System.out.println(smap);*/
		/*Hashtable<Integer, String>ht=new Hashtable<>();
		ht.put(1, "kalyan");
		ht.put(null, "jogi");
		System.out.println(ht.get(null));*/
	}

}