package java.com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.com.qa.persistence.domain.*;

public class AccountMapRepository implements AccountRepository{
	
	Map<Long, Account> accountMap = new HashMap<Long, Account>();

	//You must provide concrete implementation for each of these methods
	//do not change the method signature

	public String getAllAccounts() {
		 for(Entry<Long, java.com.qa.persistence.domain.Account> entry: accountMap.entrySet()) {
		        System.out.println(entry.getKey());
		        System.out.println(entry.getValue());
		    }
		 return null;
	}

	public String createAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateAccount(Long id, String account) {
		// TODO Auto-generated method stub
		return null;
	}

}
