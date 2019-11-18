package com.umb.spring.dataapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.umb.spring.dataapi.models.MyAccountRO;
import com.umb.spring.dataapi.service.MyAccountService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;

@RestController
public class MyAccountController {

	@Autowired
	private MyAccountService myAccountService;
	
	@GetMapping("/myaccounts/{id}")
	public ResponseEntity<MyAccountRO> getMyAccount(@PathVariable("id") Integer id)
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,DELETE,LINK,PATCH,COPY,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.ok().headers(responseHeaders).body(myAccountService.getMyAccount(id));
	}
	@GetMapping("/myaccounts")
	public ResponseEntity<List<MyAccountRO>> getAllMyAccounts()
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,DELETE,LINK,PATCH,COPY,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Authorization,Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.ok().headers(responseHeaders).body(myAccountService.getAllMyAccounts());
	}
	@PostMapping("/myaccounts")
	public ResponseEntity<Integer> addMyAccount(@RequestBody MyAccountRO myAccount)
	{		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,DELETE,LINK,PATCH,COPY,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Authorization,Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		
		return ResponseEntity.status(201).headers(responseHeaders).body(myAccountService.addMyAccount(myAccount));
	}
	@PutMapping("/myaccounts/{id}")
	public ResponseEntity<String> updateMyAccount(@RequestBody MyAccountRO myAccount,@PathVariable("id") Integer id)
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,DELETE,LINK,PATCH,COPY,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Authorization,Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.status(204).headers(responseHeaders).body(myAccountService.updateMyAccount(myAccount,id));
	}
	@DeleteMapping("/myaccounts/{id}")
	public ResponseEntity<String> removeMyAccount(@PathVariable("id") Integer id)
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,DELETE,LINK,PATCH,COPY,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Authorization,Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.status(204).headers(responseHeaders).body(myAccountService.removeMyAccount(id));
	}
	@GetMapping("/myaccounts/hi")
	public ResponseEntity<String> hiMyAccount()
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,DELETE,LINK,PATCH,COPY,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Authorization,Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.status(200).headers(responseHeaders).body("Hi there");
	}
	@RequestMapping(method=RequestMethod.OPTIONS,value="/myaccounts")
	public ResponseEntity<String> optionsMyAccount()
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,DELETE,LINK,PATCH,COPY,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Authorization,Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.status(200).headers(responseHeaders).body("Hi there");
	}
}
