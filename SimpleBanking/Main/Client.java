package Main;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private List<AccountNode> accounts;

	public Client(String name) {
		this.name = name;
		accounts = new ArrayList<AccountNode>();
	}
	
	public Client(String name, Account account, AccountType accountType) {
		this.name = name;
		accounts = new ArrayList<AccountNode>();
		accounts.add(new AccountNode(account, accountType));
	}

	public String getClientName() {
		return name;
	}

	public Account getAccount(String accountNumber) {
		if(accounts == null) return null;
		for(AccountNode acctNode : accounts) {
			if(acctNode == null) continue;
			if(acctNode.account == null) continue;
			if(acctNode.account.accountNumber.equals(accountNumber)) return acctNode.account;
		}
		return null;
	}
	
	public AccountType getAccountType(String accountNumber) {
		if(accounts == null) return null;
		for(AccountNode acctNode : accounts) {
			if(acctNode == null) continue;
			if(acctNode.account == null) continue;
			if(acctNode.account.accountNumber.equals(accountNumber)) return acctNode.accountType;
		}
		return null;
	}
	
	public AccountType getAccountType(Account account) {
		if(accounts == null) return null;
		for(AccountNode acctNode : accounts) {
			if(acctNode == null) continue;
			if(acctNode.account == null) continue;
			if(acctNode.account == account) return acctNode.accountType;
		}
		return null;
	}
	
	public boolean addAccount(Account account, AccountType acctType) {
		if(accounts)
	}
}
