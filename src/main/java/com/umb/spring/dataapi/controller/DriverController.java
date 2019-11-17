package com.umb.spring.dataapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.umb.spring.dataapi.models.DriverRO;
import com.umb.spring.dataapi.service.DriverService;
import org.springframework.http.ResponseEntity;

@RestController
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@GetMapping("/drivers/{id}")
	public ResponseEntity<DriverRO> getDriver(@PathVariable("id") String id)
	{
		return ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(driverService.getDriver(id));
	}
	@GetMapping("/drivers")
	public ResponseEntity<List<DriverRO>> getAllDrivers()
	{
		return ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(driverService.getAllDrivers());
	}
	@PostMapping("/drivers")
	public ResponseEntity<String> addDriver(@RequestBody DriverRO driver)
	{		
		return ResponseEntity.status(201).header("Access-Control-Allow-Origin", "*").body(driverService.addDriver(driver));
	}
	@PutMapping("/drivers/{id}")
	public ResponseEntity<String> updateDriver(@RequestBody DriverRO driver,@PathVariable("id") String id)
	{
		return ResponseEntity.status(204).header("Access-Control-Allow-Origin", "*").body(driverService.updateDriver(driver,id));
	}
	@DeleteMapping("/drivers/{id}")
	public ResponseEntity<String> removeDriver(@PathVariable("id") String id)
	{
		return ResponseEntity.status(204).header("Access-Control-Allow-Origin", "*").body(driverService.removeDriver(id));
	}
	@GetMapping("/drivers/hi")
	public String removeDriver()
	{
		return "Hi";
	}
}
