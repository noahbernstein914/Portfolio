
//https://www.sudokuslam.com/hints.html methods used
//https://www.brainbashers.com/sudokuhelp.asp
package link.bin;

import org.apache.commons.io.file.Counters.Counter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class sudokuV2 {
	static ArrayList<block> blocks = new ArrayList<block>();// list of each block with its information

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		puller();

	}

	public static void puller() throws InterruptedException, IOException, AWTException {
		// initializing ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\noahb\\OneDrive\\Desktop\\Java\\chromeD\\chromedriver.exe");// getting chromedriver

		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, 300);

		driver.get(
				"https://www.nytimes.com/puzzles/sudoku/hard");// getting link

		w.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"pz-game-root\"]/div[2]/div/div[1]/div/div/div/div[35]")));// wating
		jse.executeScript("window.scrollBy(0,450)");

		boolean starter = true;
		for (int i = 1; i < 81 && starter; i++) {
			String starterFinder = driver
					.findElement(By.xpath("//*[@id=\"pz-game-root\"]/div[2]/div/div[1]/div/div/div/div[" + i + "]"))
					.getAttribute("aria-label");
			if (!starterFinder.equals("empty")) {
				driver.findElement(By.xpath("//*[@id=\"pz-game-root\"]/div[2]/div/div[1]/div/div/div/div[" + i + "]"))
						.click();
				starter = false;
			}
		}

		sudokuV2 sud = new sudokuV2();
		for (int i = 1; i < 82; i++) {
			blocks.add(sud.new block(i));
			String addingNum = driver
					.findElement(By.xpath("//*[@id=\"pz-game-root\"]/div[2]/div/div[1]/div/div/div/div[" + i + "]"))
					.getAttribute("aria-label");
			if (addingNum.equals("empty")) {
				addingNum = "0";
			}
			blocks.get(i - 1).setNum(Integer.parseInt(addingNum));
		}

		// horizontal checker

		for (int i = 1; i < 10; i++) {
			if (blocks.get(i).num == 0) {

			}
		}

	}

	public Boolean boardChecker(int pos, int num) {
		// region
		ArrayList<Integer> a1 = new ArrayList<Integer>();//
		a1.add(0);
		a1.add(1);
		a1.add(2);
		a1.add(9);
		a1.add(10);
		a1.add(11);
		a1.add(18);
		a1.add(19);
		a1.add(20);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a2.add(12);
		a2.add(13);
		a2.add(14);
		a2.add(21);
		a2.add(22);
		a2.add(23);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(6);
		a3.add(7);
		a3.add(8);
		a3.add(15);
		a3.add(16);
		a3.add(17);
		a3.add(24);
		a3.add(25);
		a3.add(26);
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(27);
		a4.add(28);
		a4.add(29);
		a4.add(36);
		a4.add(37);
		a4.add(38);
		a4.add(45);
		a4.add(46);
		a4.add(47);
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		a5.add(30);
		a5.add(31);
		a5.add(32);
		a5.add(39);
		a5.add(40);
		a5.add(41);
		a5.add(48);
		a5.add(49);
		a5.add(50);
		ArrayList<Integer> a6 = new ArrayList<Integer>();
		a6.add(33);
		a6.add(34);
		a6.add(35);
		a6.add(42);
		a6.add(43);
		a6.add(44);
		a6.add(51);
		a6.add(52);
		a6.add(53);
		ArrayList<Integer> a7 = new ArrayList<Integer>();
		a7.add(54);
		a7.add(55);
		a7.add(56);
		a7.add(63);
		a7.add(64);
		a7.add(65);
		a7.add(72);
		a7.add(73);
		a7.add(74);
		ArrayList<Integer> a8 = new ArrayList<Integer>();
		a8.add(57);
		a8.add(58);
		a8.add(59);
		a8.add(66);
		a8.add(67);
		a8.add(68);
		a8.add(75);
		a8.add(76);
		a8.add(77);
		ArrayList<Integer> a9 = new ArrayList<Integer>();
		a9.add(60);
		a9.add(61);
		a9.add(62);
		a9.add(69);
		a9.add(70);
		a9.add(71);
		a9.add(78);
		a9.add(79);
		a9.add(80);
		ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
		aList.add(a1);
		aList.add(a2);
		aList.add(a3);
		aList.add(a4);
		aList.add(a5);
		aList.add(a6);
		aList.add(a7);
		aList.add(a8);
		aList.add(a9);
		// #endregion
		int row = (pos / 9);
		int a;
		boolean aRunner = true;
		for (int g = 0; g < 9 && aRunner; g++) {//finding 
			if (aList.get(g).indexOf(pos) > 0) {
				a = g;
				aRunner = false;
			}
		}
		for (int i = 0; i < 9; i++) {//horizontal
			if (blocks.get((row * 9) + i).num == num && ((row * 9) + i) != pos) {
				return false;
			}
		}
		int rem = ((pos) % 9);//vertical
		for (int h = 0; h < 9; h++) {
			if (blocks.get((h * 9) + rem).num == num && ((h * 9) + rem) != pos) {
				return false;
			}
		}

		// if()
	}

	public class block {

		ArrayList<Integer> blockPossibles = new ArrayList<Integer>();
		int num;
		int loc;
		Boolean set = false;

		public block(int l) {
			for (int i = 1; i < 10; i++) {
				blockPossibles.add(i);
			}

			loc = l;
		}

		public void setBool() {
			set = true;
		}

		public boolean getBool() {
			return set;
		}

		public void setNum(int n) throws AWTException {
			num = n;
			if (n != 0) {
				int keyEventMaker = 0;
				switch (n) {
					case 1:
						keyEventMaker = KeyEvent.VK_1;
						break;
					case 2:
						keyEventMaker = KeyEvent.VK_2;
						break;
					case 3:
						keyEventMaker = KeyEvent.VK_3;
						break;
					case 4:
						keyEventMaker = KeyEvent.VK_4;
						break;
					case 5:
						keyEventMaker = KeyEvent.VK_5;
						break;
					case 6:
						keyEventMaker = KeyEvent.VK_6;
						break;
					case 7:
						keyEventMaker = KeyEvent.VK_7;
						break;
					case 8:
						keyEventMaker = KeyEvent.VK_8;
						break;
					case 9:
						keyEventMaker = KeyEvent.VK_9;
						break;
				}
				Robot bot = new Robot();
				bot.keyPress(keyEventMaker);
				bot.keyRelease(keyEventMaker);
			}
			clear();
		}

		public void clear() {
			if (num != 0) {
				blockPossibles.clear();
				blockPossibles.add(num);
			}
		}
	}

}
