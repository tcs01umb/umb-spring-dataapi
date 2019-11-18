package com.umb.spring.dataapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umb.spring.dataapi.dao.DriverRepository;
import com.umb.spring.dataapi.entities.Driver;
import com.umb.spring.dataapi.models.DriverRO;

@Service
public class DriverService {

	@Autowired
	private DriverRepository driverRepo;
//	private List<DriverRO> driverListRO = new ArrayList<DriverRO>(Arrays.asList(new DriverRO("1","dharma","d"),
//	new DriverRO("2","raj","r"),new DriverRO("3","sandeep","k")));
	
	public List<DriverRO> getAllDrivers() {
//		return driverListRO;
		List<DriverRO> driverListRO = new ArrayList<DriverRO>();
		List<Driver> driverList = new ArrayList<Driver>();
		driverRepo.findAll().forEach(driverList::add);
		if(driverList != null)
		{
			for(Integer i=0;i<driverList.size();i++)
			{
				driverListRO.add(new DriverRO(driverList.get(i)));
			}
		}
		return driverListRO;
		
	}
	public DriverRO getDriver(Integer id) {
//		return driverListRO.stream().filter(d -> d.getId().equals(id)).findFirst().get();
		DriverRO dr = new DriverRO(driverRepo.findById(id).get());
		if (dr != null)
		{
			return dr;
		}
		return new DriverRO();
	}
	public Integer addDriver(DriverRO driver) {
		driverRepo.save(new Driver(driver));
		return driver.getId();
	}
	public String updateDriver(DriverRO driver, Integer id) {
		driverRepo.save(new Driver(driver));
//		for(Integer i=0;i<driverListRO.size();i++)
//		{
//			DriverRO dr = driverListRO.get(i);
//			if(dr.getId().equals(id))
//			{
//				driverListRO.set(i, driver);
				return "updated";
//			}
//		}
//		return "Unable to update id doesn't match driver";
	}
	public String removeDriver(Integer id) {
		driverRepo.deleteById(id);;
//		for(Integer i=0;i<driverListRO.size();i++)
//		{
//			DriverRO dr = driverListRO.get(i);
//			if(dr.getId().equals(id))
//			{
//				driverListRO.remove(i);
				return "deleted";
//			}
//		}
//		return "Unable to delete id doesn't match driver";
	}
}
