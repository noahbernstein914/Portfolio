




//bug in squares idk run it write answers and check hint for missing details
 
//https://www.sudokuslam.com/hints.html
 
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
import java.util.ArrayList;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
 
public class soduku {
    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        puller();
    }
 
    public static void puller() throws InterruptedException, IOException, AWTException {
        // initializing ChromeDriver
        Robot robot = new Robot();
 
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\noahb\\OneDrive\\Desktop\\Java\\chromeD\\chromedriver.exe");// getting chromedriver
 
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebDriverWait w = new WebDriverWait(driver, 300);
        driver.get(
                "https://www.nytimes.com/puzzles/sudoku/easy");// getting link
 
        w.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id=\"pz-game-root\"]/div[2]/div/div[1]/div/div/div/div[35]")));// wating
                                                                                                                        // for
                                                                                                                        // information
                                                                                                                        // to
                                                                                                                        // load
        ArrayList<block> blocks = new ArrayList<block>();// list of each block with its information
 
        for (int i = 1; i < 82; i++) {
            blocks.add(new block());
            String addingNum = driver
                    .findElement(By.xpath("//*[@id=\"pz-game-root\"]/div[2]/div/div[1]/div/div/div/div[" + i + "]"))
                    .getAttribute("aria-label");
            if (addingNum.equals("empty")) {
                addingNum = "0";
            }
            blocks.get(i - 1).setNum(Integer.parseInt(addingNum));
        }
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
        // horizontal checker
        for (int u = 0; u < 4; u++) {
            for (int i = 1; i < 82; i++) {// iterating through each block
                int xRow = ((i - 1) / 9);
                if (blocks.get(i - 1).num == 0) {// if block isn't already assigned a number
 
                    for (int j = 1; j < 10; j++) {// removing horizontals from possible list of each block
                        if (blocks.get(i - 1).blockPossibles.contains(blocks.get((xRow * 9) - 1 + j).num)) {
                            blocks.get(i - 1).blockPossibles
                                    .remove(Integer.valueOf(blocks.get((xRow * 9) - 1 + j).num));
                        }
                    }
                    int rem = ((i - 1) % 9);
                    for (int j = 0; j < 9; j++) {// removing verticals from possible list of each block
                        if (blocks.get(i - 1).blockPossibles.contains(Integer.valueOf(blocks.get((j * 9) + rem).num))) {
                            blocks.get(i - 1).blockPossibles.remove(Integer.valueOf(blocks.get((j * 9) + rem).num));
                        }
                    }
                    boolean runner = true;
                    for (int j = 0; j < 9 && runner; j++) {// removing squares
 
                        if (aList.get(j).contains(i - 1)) {
                            for (int q = 0; q < 9; q++) {
                                if (blocks.get(i - 1).blockPossibles
                                        .contains(Integer.valueOf(blocks.get(aList.get(j).get(q)).num))) {
                                    blocks.get(i - 1).blockPossibles
                                            .remove(Integer.valueOf(blocks.get(aList.get(j).get(q)).num));
                                }
                            }
                            runner = false;
                        }
 
                    }
                   
 
                }
 
            }
            for (int i = 0; i < 81; i++) {
                if (blocks.get(i).blockPossibles.size() == 1&&!blocks.get(i).set) {
                    System.out.println("Singular setting {" + blocks.get(i).blockPossibles.get(0) + "} at : " + i
                            + " List = " + blocks.get(i).blockPossibles);
                    blocks.get(i).setNum(blocks.get(i).blockPossibles.get(0));
                    blocks.get(i).setBool();
                }
                System.out.println("num: " + (i) + "" + blocks.get(i).blockPossibles);
            }
            // checking for singles in blockPossibles horizontal
            for (int i = 0; i < 9; i++) {// each row
                for (int h = 1; h < 10; h++) {// each number possible
                    ArrayList<Integer> counterList = new ArrayList<Integer>();
                    for (int z = 0; z < 9; z++) {// each num in row
 
                        if (blocks.get((9 * i) + z).blockPossibles.contains(h)) {
                            counterList.add(z);
                        }
 
                    }
                    if (counterList.size() == 1) {
                        if (blocks.get((9 * i) + counterList.get(0)).num == 0) {
                            System.out.println("Horizontal setting: " + h + " at: "+((9 * i) + counterList.get(0))+" in: "+blocks.get((9 * i) + counterList.get(0)).blockPossibles);
                            blocks.get((i * 9) + counterList.get(0)).setNum(h);
                            blocks.get((i * 9) + counterList.get(0)).setBool();
 
                        }
                    }
                }
 
            }
 
            // checking for singles in blockPossibles vertical
            for (int i = 0; i < 9; i++) {// each column
                for (int h = 1; h < 10; h++) {// each number possible
                    ArrayList<Integer> counterList = new ArrayList<Integer>();
                    for (int z = 0; z < 9; z++) {// each num in columns
                        if (blocks.get(i + (9 * z)).blockPossibles.contains(h)) {
                            counterList.add(z);
                        }
 
                    }
                    if (counterList.size() == 1) {
                        if (blocks.get(i + (9 * counterList.get(0))).num == 0) {
                            System.out.println("Vertical setting: " + h + " at: "+((counterList.get(0) * 9) + i)+" in: "+blocks.get((counterList.get(0) * 9) + i).blockPossibles);
 
                            blocks.get((counterList.get(0) * 9) + i).setNum(h);
                            blocks.get((counterList.get(0) * 9) + i).setBool();;
 
                        }
                    }
                }
 
            }
            // checking boxes
            for (int i = 0; i < 9; i++) {// each column
                for (int h = 1; h < 10; h++) {// each number possible
                    ArrayList<Integer> counterList = new ArrayList<Integer>();
                    for (int z = 0; z < 9; z++) {// each num in column
 
                        if (blocks.get(aList.get(i).get(z)).blockPossibles.contains(h)) {
                            counterList.add(z);
                        }
 
                    }
                    if (counterList.size() == 1) {
                        if (blocks.get(aList.get(i).get(counterList.get(0))).num == 0) {
                            System.out.println("Square setting: " + h + " at: "+(aList.get(i).get(counterList.get(0)))+" in: "+blocks.get(aList.get(i).get(counterList.get(0))).blockPossibles);
 
                            blocks.get(aList.get(i).get(counterList.get(0))).setNum(h);
                            blocks.get(aList.get(i).get(counterList.get(0))).setBool();
 
                        }
                    }
                }
 
            }
 
            for (int i = 0; i < 81; i++) {
                System.out.println("num: " + (i) + "" + blocks.get(i).blockPossibles);
            }
        }
 
    }
 
    static class block {
        ArrayList<Integer> blockPossibles = new ArrayList<Integer>();
        int num;
        Boolean set = false;
 
        public block() {
            // for (int i = 1; i < 10; i++) {
            // blockPossibles.add(i);
            // }
            blockPossibles.add(1);
            blockPossibles.add(2);
            blockPossibles.add(3);
            blockPossibles.add(4);
            blockPossibles.add(5);
            blockPossibles.add(6);
            blockPossibles.add(7);
            blockPossibles.add(8);
            blockPossibles.add(9);
        }
        public void setBool( ) {
            set = true;
        }public boolean getBool() {
             return set;
        }
        public void setNum(int n) {
            num = n;
           
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
 
 
