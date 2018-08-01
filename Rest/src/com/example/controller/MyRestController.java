package com.example.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.RetailStoreDao;
import com.example.model.RetailStore;

@RestController
@RequestMapping("/rest")
public class MyRestController {

	
	
	
	// retailStorelist
	   @GetMapping(path = "/get/retailStores", produces = MediaType.APPLICATION_JSON_VALUE)
	   public ResponseEntity<List<RetailStore>> getAllRetailStores() {
		  Map<Integer,RetailStore> retailStoreMap = RetailStoreDao.getRetailStores(); 
		  Collection<RetailStore> collection = retailStoreMap.values();
		  List<RetailStore> retailStoreList = new ArrayList<>();
		  retailStoreList.addAll(collection);
	      return ResponseEntity
	            .ok()
	            .body(retailStoreList);
	   }
	
	   
	   
	 //get a retailStore  
	 //http://localhost:8085/Rest/rest/get/1
	//Handler method to produce text response
	   @GetMapping(path = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	   public ResponseEntity<RetailStore> getAllRetailStore(@PathVariable("id") int id) {
		  RetailStore retailStore = RetailStoreDao.getRetailStore(id); 		  
	      return ResponseEntity
	            .ok()
	            .body(retailStore);
	   }
	
	
	//insert
	   //http://localhost:8085/Rest/rest/post/createRetailStore
	   @PostMapping(path = "/post/createRetailStore", consumes = MediaType.APPLICATION_JSON_VALUE, 
	         produces = MediaType.APPLICATION_JSON_VALUE)
	   public ResponseEntity<RetailStore> insertRetailStore(@RequestBody RetailStore retailStore) {
	      RetailStore savedRetailStore = RetailStoreDao.updateRetailStore(retailStore);
	      return ResponseEntity
	            .ok()
	            .body(savedRetailStore);
	   }
	
	
	 //update
	   @PostMapping(path = "/post/updateRetailStore", consumes = MediaType.APPLICATION_JSON_VALUE, 
	         produces = MediaType.APPLICATION_JSON_VALUE)
	   public ResponseEntity<RetailStore> updateRetailStore(@RequestBody RetailStore retailStore) {
	      RetailStore updateRetailStore = RetailStoreDao.updateRetailStore(retailStore);
	      return ResponseEntity
	            .ok()
	            .body(updateRetailStore);
	   }
	
	   
	   
	   
	   //delete
	   @GetMapping(path = "/get/deleteRetailStore/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	   public ResponseEntity<RetailStore> deleteRetailStore(@PathVariable("id") int id) {
	      RetailStore deletedRetailStore = RetailStoreDao.deleteRetailStore(id);
	      return ResponseEntity
	            .ok()
	            .body(deletedRetailStore);
	   }
	
	
	/********************************************************************************/
	
	
/*   // Handler method to produce text response
   @GetMapping(path = "/get/text", produces = MediaType.TEXT_PLAIN_VALUE)
   public ResponseEntity<String> getText() {
      return ResponseEntity
            .ok()
            .body("Spring MVC - REST Controller Hello World example.");
   }

   // Handler method to produce JSON response
   @GetMapping(path = "/get/json", produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<List<String>> getJSON() {
      List<String> list = new ArrayList<>();
      list.add("One");
      list.add("Two");
      list.add("Three");
      return ResponseEntity
            .ok()
            .cacheControl(CacheControl.noCache())
            .body(list);
   }

   // Handler method to produce XML response
   @GetMapping(path = "/get/xml", produces = MediaType.APPLICATION_XML_VALUE)
   public ResponseEntity<String> getXML() {
      String xml = "<user><id>12</id><name>John</name></user>";
      return ResponseEntity
            .ok()
            .header("myheader", "myvalue") // add custom headers
            .body(xml);
   }

   // Handler method to consume JSON request and produce text response
   @PostMapping(path = "/post/json", consumes = MediaType.APPLICATION_JSON_VALUE, 
         produces = MediaType.TEXT_PLAIN_VALUE)
   public ResponseEntity<String> postJSON(@RequestBody List<String> body) {
      System.out.println(body);
      // Process request
      //....
      return ResponseEntity
            .ok()
            .body("Done");
   }

   // Handler method to consume XML request and produce text response
   @PostMapping(path = "/post/xml", consumes = MediaType.APPLICATION_XML_VALUE, 
         produces = MediaType.TEXT_PLAIN_VALUE)
   public ResponseEntity<String> postJSON(@RequestBody String body) {
      System.out.println(body);
      // Process request
      //....
      return ResponseEntity
            .ok()
            .body("Done");
   }*/

}
