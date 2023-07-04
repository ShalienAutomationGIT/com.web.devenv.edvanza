package com.utils.edvanza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataReader {

	public ArrayList<Map<String, String>> mapread(String filepath) {
		HashMap<String, String> tempMap = new HashMap<String, String>();

		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String line = null;

			while ((line = br.readLine()) != null) {
				String str[] = line.split(",");
				tempMap = new HashMap<String, String>();
				for (int i = 0; i < str.length; i++) {
					String arr[] = str[i].split(":");
					tempMap.put(arr[0], arr[1]);
				}
				list.add(tempMap);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	
	
	
}
