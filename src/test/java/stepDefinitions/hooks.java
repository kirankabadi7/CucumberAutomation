package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("Setting up Netbanking");
		System.out.println("*********************");
	}

	@Before("@Mortgage")
	public void MortGageSetup() {
		System.out.println("Setting up Mortgage");
		System.out.println("*********************");
	}

	@After("@NetBanking")
	public void netBankingTearDown() {
		System.out.println("Tearing Down Netbanking");
		System.out.println("*********************");
	}

	@After("@Mortgage")
	public void MortGageTearDown() {
		System.out.println("Tearing Down Mortgage");
		System.out.println("*********************");
	}
}
