package tddbc.tddbc;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
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
	VendingMachine vendingMachine;

	@Before
	public void setUp() {
		vendingMachine = new VendingMachine();
	}

	@Test
	public void _100円コインを投入するとボタンが有効になる() {
		boolean result = vendingMachine.insertCoin(100);
		assertThat(result,is(true));
	}
	@Test
	public void _10円コインを投入してもボタンが有効にならない() {
		boolean result = vendingMachine.insertCoin(10);
		assertThat(result,is(false));
	}
	@Test
	public void ボタンが有効時にボタン押すとコーラが出る() {
		vendingMachine.insertCoin(100);

		String result = vendingMachine.pushButton(1);

		assertThat(result,is("コーラ"));
	}
	@Test
	public void ボタンが無効時にボタンを押すと何も出ない() {
		vendingMachine.insertCoin(10);

		String result = vendingMachine.pushButton(1);

		assertThat(result,is(""));
	}
	@Test
	public void コインを投入していない状態でボタンを押すと何も出ない() {

		String result = vendingMachine.pushButton(1);;

		assertThat(result,is(""));
	}
	@Test
	public void IDが1の商品はコーラである() {
		String result = vendingMachine.getProductName(1);
		assertThat(result,is("コーラ"));
	}
	@Test
	public void IDが2の商品は烏龍茶である() {
		String result = vendingMachine.getProductName(2);
		assertThat(result,is("烏龍茶"));
	}
	@Test
	public void IDが1のボタンを押すとコーラが出る() {
		vendingMachine.insertCoin(100);
		String result = vendingMachine.pushButton(1);
		assertThat(result,is("コーラ"));
	}
	@Test
	public void IDが2のボタンを押すと烏龍茶が出る() {
		vendingMachine.insertCoin(100);
		String result = vendingMachine.pushButton(2);
		assertThat(result,is("烏龍茶"));
	}

}
