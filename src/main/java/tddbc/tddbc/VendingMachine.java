package tddbc.tddbc;

public class VendingMachine {
	private boolean purchaseOn;

	public String pushButton() {
		System.out.println(this.purchaseOn);
		if(this.purchaseOn) {
			return "コーラ";
		}
		return "";
	}

	public boolean insertCoin(int money) {

		if(money == 100) {
			this.purchaseOn = true;
			return true;
		}
		this.purchaseOn = false;
		System.out.println(this.purchaseOn);
		return false;
	}

}
