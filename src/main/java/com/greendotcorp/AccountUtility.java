package com.greendotcorp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.greendotcorp.soap.Account;

@Component
public class AccountUtility {
	private Map<Integer,Account> accountMap = new HashMap<Integer,Account>();
	public AccountUtility(){
		Account s1 = new Account();
		s1.setAccountId(1);
		s1.setName("Vivian Wu");
		s1.setAge(23);
		s1.setTitle("PE");
		accountMap.put(1, s1);
		Account s2 = new Account();
		s2.setAccountId(2);
		s2.setName("Alice Yin");
		s2.setAge(22);
		s2.setTitle("SE");
		accountMap.put(2, s2);
		Account s3 = new Account();
		s3.setAccountId(3);
		s3.setName("Dana Chen");
		s3.setAge(20);
		s3.setTitle("SE");
		accountMap.put(3, s3);
	}
	public Account getAccount(int accountId){
		return accountMap.get(accountId);
	}
}
