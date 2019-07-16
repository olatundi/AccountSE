package repository;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import domain.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class AccountMapRepository implements AccountRepository{
	Map<Long, Account> accountMap = new HashMap<Long, Account>();
	private long count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountMapRepository amr = new AccountMapRepository();
		amr.createAccount("Pierre", "Jesus", 23);
		System.out.println(amr.accountMap);
//		amr.getAllAccounts();
		ObjectMapper mapper = new ObjectMapper();
		try {
			// Java objects to JSON string - compact-print
            String jsonString = mapper.writeValueAsString(amr.accountMap);

            System.out.println(jsonString);
            
         // Java objects to JSON string - pretty-print
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(amr.accountMap);

//            System.out.println(jsonInString2);
            }
		catch(IOException e) {
			e.printStackTrace();
		}
//		amr.updateAccount(1L,"Pierre", "Bond", 41);
//		amr.getAllAccounts();
//		amr.deleteAccount(1L);
//		amr.getAllAccounts();
		
		
		
	}

	//You must provide concrete implementation for each of these methods
	//do not change the method signature

	public String getAllAccounts() {
		
		System.out.println("All accounts details:");
		for(Entry<Long, Account> entry: accountMap.entrySet()) {
		        System.out.println("Account firstname : "+entry.getValue().getFirstName());
		        System.out.println("Account lastname : "+entry.getValue().getLastName());
		        System.out.println("Account number : "+entry.getValue().getAccountNumber());
		}
//		System.out.println("The accounts:");
// 
//		System.out.println(this.accountMap.values());
		return null;
	}

	public String createAccount( String firstName, String lastName,  int accountNumber) {
		Account account = new Account();
		account.setFirstName(firstName); 
		account.setLastName(lastName);
		account.setAccountNumber(accountNumber);
		this.accountMap.put(count, account);
		return null;
	}

	public String deleteAccount(Long id) {
		// TODO Auto-generated method stub
		this.accountMap.remove(id);
		return null;
	}

	public String updateAccount(Long id,String firstName, String lastName,  int accountNumber ) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setFirstName(firstName); 
		account.setLastName(lastName);
		account.setAccountNumber(accountNumber);
		this.accountMap.replace(id, account);
		return null;
	}

}
