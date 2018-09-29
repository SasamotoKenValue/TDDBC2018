package tddbc.tddbc;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {
/*
 * お題1
	@Test
	public void ボタンを押すとコーラが出る() {
		String result = new VendingMachine().pushButton();
		assertThat(result,is("コーラ"));
	}
*/
	@Test
	public void _100円コインを投入するとボタンが有効になる() {
		boolean result = new VendingMachine().insertCoin(100);
		assertThat(result,is(true));
	}
	@Test
	public void _10円コインを投入してもボタンが有効にならない() {
		boolean result = new VendingMachine().insertCoin(10);
		assertThat(result,is(false));
	}
	@Test
	public void ボタンが有効時にボタン押すとコーラが出る() {
		VendingMachine vendingMachine = new VendingMachine();

		vendingMachine.insertCoin(100);

		String result = vendingMachine.pushButton();

		assertThat(result,is("コーラ"));
	}
	@Test
	public void ボタンが無効時にボタンを押すと何も出ない() {
		VendingMachine vendingMachine = new VendingMachine();

		vendingMachine.insertCoin(10);

		String result = vendingMachine.pushButton();

		assertThat(result,is(""));
	}

}
