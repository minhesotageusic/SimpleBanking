package Main;

import java.util.ArrayList;

public class Bank {

	private static Bank bankInstance;

	/**
	 * Default rate for saving account
	 */
	public final float DEFAULT_INTEREST = 0.0001f;
	public final int DEFAULT_ACCOUNT_LENGTH = 10;

	private static ArrayList<Client> clients;

	public static Bank instanceOf() {
		if (bankInstance == null) {
			bankInstance = new Bank();
			clients = new ArrayList<Client>();
		}
		return bankInstance;
	}

	public boolean AddClient(String name, float startingBalance) throws NullPointerException {
		if (clients == null)
			throw new NullPointerException("Missing clients list");
		if (startingBalance < 0)
			return false;
		if (ContainClient(name))
			return false;
		Client newClient = new Client(name);
		clients.add(newClient);
		return true;
	}
	
	public boolean AddPrivateAccountToClient() {
		return false;
		
	}
	
	private boolean ContainClient(String name) {
		for (Client c : clients) {
			if (c == null)
				continue;
			if (c.getClientName().equals(name))
				return true;
		}
		return false;
	}

	private String generateAccountNumber() {
		String s = "";
		boolean found;
		while (true) {
			s = generateAccountNumberHelper();
			found = true;
			for (Client c : clients) {
				if (c == null)
					continue;
				if (c.getAccount(s) != null) {
					found = false;
					break;
				}
			}
			if(found) {
				break;
			}
		}
		return s;
	}

	private String generateAccountNumberHelper() {
		String s = "";
		for (int i = 0; i < DEFAULT_ACCOUNT_LENGTH; i++) {
			s += (int) (Math.random() * 9);
		}
		return s;
	}

}
