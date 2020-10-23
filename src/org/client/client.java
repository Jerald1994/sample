package org.client;

import org.company.Company;

public class client extends Company {
public void clientName() {
	System.out.println(" my client name is paques");
}
public static void main(String[] args) {
	client b = new client();
	b.clientName();
	b.companyName();
}
}
