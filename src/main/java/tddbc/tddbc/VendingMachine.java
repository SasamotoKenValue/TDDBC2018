package tddbc.tddbc;

public class VendingMachine {
	private boolean purchaseOn;

	public boolean insertCoin(int money) {

		if(money == 100) {
			this.purchaseOn = true;
			return true;
		}
		this.purchaseOn = false;

		return false;
	}

	public String getProductName(int id) {
		if(id == 1) {
			return "コーラ";
		}
		if(id == 2) {
			return "烏龍茶";
		}
		return "";
	}

	public String pushButton(int id) {
		if(this.purchaseOn) {
			return "コーラ";

		}
		return "";
	}

}
