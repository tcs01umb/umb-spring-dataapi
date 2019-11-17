package com.umb.spring.dataapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.umb.spring.dataapi.models.DriverRO;
import com.umb.spring.dataapi.service.DriverService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

@RestController
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@GetMapping("/drivers/{id}")
	public ResponseEntity<DriverRO> getDriver(@PathVariable("id") String id)
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.ok().headers(responseHeaders).body(driverService.getDriver(id));
	}
	@GetMapping("/drivers")
	public ResponseEntity<List<DriverRO>> getAllDrivers()
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.ok().headers(responseHeaders).body(driverService.getAllDrivers());
	}
	@PostMapping("/drivers")
	public ResponseEntity<String> addDriver(@RequestBody DriverRO driver)
	{		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.status(201).headers(responseHeaders).body(driverService.addDriver(driver));
	}
	@PutMapping("/drivers/{id}")
	public ResponseEntity<String> updateDriver(@RequestBody DriverRO driver,@PathVariable("id") String id)
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.status(204).headers(responseHeaders).body(driverService.updateDriver(driver,id));
	}
	@DeleteMapping("/drivers/{id}")
	public ResponseEntity<String> removeDriver(@PathVariable("id") String id)
	{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Access-Control-Allow-Origin", "*");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
		responseHeaders.set("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return ResponseEntity.status(204).headers(responseHeaders).body(driverService.removeDriver(id));
	}
	@GetMapping("/drivers/hi")
	public String removeDriver()
	{
		return "Hi";
	}
}
