package com.umb.spring.dataapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umb.spring.dataapi.dao.MyAccountRepository;
import com.umb.spring.dataapi.entities.MyAccount;
import com.umb.spring.dataapi.models.MyAccountRO;

@Service
public class MyAccountService {

	@Autowired
	private MyAccountRepository myAccountRepo;
//	private List<MyAccountRO> myAccountListRO = new ArrayList<MyAccountRO>(Arrays.asList(new MyAccountRO("1","dharma","d"),
//	new MyAccountRO("2","raj","r"),new MyAccountRO("3","sandeep","k")));
	
	public List<MyAccountRO> getAllMyAccounts() {
//		return myAccountListRO;
		List<MyAccountRO> myAccountListRO = new ArrayList<MyAccountRO>();
		List<MyAccount> myAccountList = new ArrayList<MyAccount>();
		myAccountRepo.findAll().forEach(myAccountList::add);
		if(myAccountList != null)
		{
			for(int i=0;i<myAccountList.size();i++)
			{
				myAccountListRO.add(new MyAccountRO(myAccountList.get(i)));
			}
		}
		return myAccountListRO;
		
	}
	public MyAccountRO getMyAccount(String id) {
//		return myAccountListRO.stream().filter(d -> d.getId().equals(id)).findFirst().get();
		MyAccountRO dr = new MyAccountRO(myAccountRepo.findById(id).get());
		if (dr != null)
		{
			return dr;
		}
		return new MyAccountRO();
	}
	public String addMyAccount(MyAccountRO myAccount) {
		myAccountRepo.save(new MyAccount(myAccount));
		return myAccount.getId();
	}
	public String updateMyAccount(MyAccountRO myAccount, String id) {
		myAccountRepo.save(new MyAccount(myAccount));
//		for(int i=0;i<myAccountListRO.size();i++)
//		{
//			MyAccountRO dr = myAccountListRO.get(i);
//			if(dr.getId().equals(id))
//			{
//				myAccountListRO.set(i, myAccount);
				return "updated";
//			}
//		}
//		return "Unable to update id doesn't match myAccount";
	}
	public String removeMyAccount(String id) {
		myAccountRepo.deleteById(id);
//		for(int i=0;i<myAccountListRO.size();i++)
//		{
//			MyAccountRO dr = myAccountListRO.get(i);
//			if(dr.getId().equals(id))
//			{
//				myAccountListRO.remove(i);
				return "deleted";
//			}
//		}
//		return "Unable to delete id doesn't match myAccount";
	}
}
