package com.umb.spring.dataapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.umb.spring.dataapi.models.DriverRO;
import com.umb.spring.dataapi.service.DriverService;

@RestController
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@GetMapping("/drivers/{id}")
	public DriverRO getDriver(@PathVariable("id") String id)
	{
		return driverService.getDriver(id);
	}
	@GetMapping("/drivers")
	public List<DriverRO> getAllDrivers()
	{
		return driverService.getAllDrivers();
	}
	@PostMapping("/drivers")
	public String addDriver(@RequestBody DriverRO driver)
	{
		return driverService.addDriver(driver);
	}
	@PutMapping("/drivers/{id}")
	public String updateDriver(@RequestBody DriverRO driver,@PathVariable("id") String id)
	{
		return driverService.updateDriver(driver,id);
	}
	@DeleteMapping("/drivers/{id}")
	public String removeDriver(@PathVariable("id") String id)
	{
		return driverService.removeDriver(id);
	}
}
