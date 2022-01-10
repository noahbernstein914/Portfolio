package link.bin;

import java.util.Scanner;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.awt.AWTException;
import org.openqa.selenium.chrome.ChromeOptions;

public class crossword {

    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        ArrayList<Character> abc = new ArrayList<Character>();
        int[] limitList = { 1, 27, 703, 18279 };

        abc.add('a');
        abc.add('b');
        abc.add('c');
        abc.add('d');
        abc.add('e');
        abc.add('f');
        abc.add('g');
        abc.add('h');
        abc.add('i');
        abc.add('j');
        abc.add('k');
        abc.add('l');
        abc.add('m');
        abc.add('n');
        abc.add('o');
        abc.add('p');
        abc.add('q');
        abc.add('r');
        abc.add('s');
        abc.add('t');
        abc.add('u');
        abc.add('v');
        abc.add('w');
        abc.add('x');
        abc.add('y');
        abc.add('z');
        Scanner sc = new Scanner(System.in);
        while (true) {
            ArrayList<String> totalList = new ArrayList<String>();
            ArrayList<Integer> charIndex = new ArrayList<Integer>();

            String input = sc.nextLine();
            totalList.add(input);
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '_') {
                    charIndex.add(i);
                }
            }

            // 1 27 703
            // double limit = (Math.pow(26, charIndex.size() - 1))+

            for (int j = 0; j < limitList[charIndex.size() - 1]; j++) {

                totalList.addAll(letterAdd(totalList.get(j), abc));

            }
            System.out.println(wordChecker(totalList));
            ;
        }

    }

    public static ArrayList<String> letterAdd(String word, ArrayList<Character> abc) {
        int index = 0;
        ArrayList<String> returnList = new ArrayList<String>();
        boolean runner = true;
        for (int i = 0; runner; i++) {

            if (word.charAt(i) == '_') {
                index = i;
                runner = false;
            }

        }
        for (int i = 0; i < 26; i++) {
            returnList.add(word.substring(0, index) + abc.get(i) + word.substring(index + 1));
        }
        return returnList;

    }

    public static String wordChecker(ArrayList<String> checkList)
            throws InterruptedException, IOException, AWTException {
        // initializing ChromeDriver

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\noahb\\OneDrive\\Desktop\\Java\\chromeD\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);   
        WebDriverWait w = new WebDriverWait(driver, 60);

        String returnString = "";
        for (int i = 0; i < checkList.size(); i++) {
//bk
//bp
//bw
//bx
//bz
//cj
//cd
//cm
//cp
//cv
//cw
//cx
//cz
//dq
//dx
//dz
//fb
//fc
//fd
//fg
//fh
//fj
//fk
//fp
//fq
//fv
//fw
//fx
//fz
//gc
//gd
//gj
//gk
//gp
//gq


            if(checkList.get(i).indexOf("_")<0){
            System.out.println("Searching "+checkList.get(i)+"...");
           driver.get(
                   "https://api.dictionaryapi.dev/api/v2/entries/en/" + checkList.get(i));
            String text = driver.findElement(By.xpath("/html/body/pre")).getText();
            if (!text.substring(10, 17).equals("No Defi")) {
                returnString += "\n\nWord: " + text.substring(10, 10 + checkList.get(i).length()) + "\n";
                while (text.indexOf("\"partOfSpeech\":") > 0) {
                    String posBuilder = "";
                    String defBuilder = "";
                    text = text.substring(text.indexOf("partOfSpeech\":\"") + 15);
                    posBuilder = text.substring(0, text.indexOf("\","));
                    text = text.substring(text.indexOf("\"definition\":\"") + 14);
                    defBuilder = text.substring(0, text.indexOf("\""));
                    returnString += "\n\n"+posBuilder + ": " + defBuilder+"\n";

                }
                returnString
                += "\n\n_____________________________________________";

            }
        }

        }
        driver.close();
        return returnString;

        // signing in

    }

}
