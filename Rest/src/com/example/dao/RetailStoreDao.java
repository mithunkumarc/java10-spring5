package com.example.dao;
import com.example.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetailStoreDao {
	private static HashMap<Integer, RetailStore> retailStoresMap = new HashMap<>();
	
	static {
		RetailStore rs1 = new RetailStore(1,"BigBazar","JayaNagar");
		RetailStore rs2 = new RetailStore(2,"BangaloreCentral","Shivajinagar");
		RetailStore rs3 = new RetailStore(3,"MegaMart","FrazerTown");
		retailStoresMap.put(rs1.getId(), rs1);
		retailStoresMap.put(rs2.getId(), rs2);
		retailStoresMap.put(rs3.getId(), rs3);		
	}
	
	
	public static Map<Integer,RetailStore> getRetailStores(){
		return retailStoresMap;
	}
	
	
	//get a retailStore 
	public static RetailStore getRetailStore(int id) {		
		return retailStoresMap.get(id); 
	}
	
	//update 
	public static RetailStore updateRetailStore(RetailStore retailStore) {
		return retailStoresMap.put(retailStore.getId(), retailStore);
	}
	
	//delete
	public static RetailStore deleteRetailStore(int id) {
		return retailStoresMap.remove(id);
	}
	
	
	
	
	
}
