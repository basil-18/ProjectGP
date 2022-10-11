package com.project;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ProGp extends Pojo {
	
	@BeforeClass
	private void befCls() {
		chromeDriver();maxWindow();waits();
		lanuchUrl("https://www.gettingpersonal.co.uk/");
		Pojo b=new Pojo();
		WebElement cokie = b.getCok();btnClk(cokie);
	}
	@BeforeMethod
	private void befM() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test 
	private void ts() throws IOException {
		Pojo b=new Pojo();waits();
		WebElement lb  = b.getLb();btnClk(lb);
		WebElement email1  = b.getEm();textBox(email1, readExcel(0, 0));
		WebElement pas1 = b.getPs();textBox(pas1, readExcel(0, 1));
		WebElement log  = b.getLg();btnClk(log);
		WebElement hoBtn = b.getHom();btnClk(hoBtn);	

	}
	@Test
	public void ts1() throws InterruptedException  {
		waits();Pojo b=new Pojo();
		WebElement sear = b.getSebo();textBox(sear, "Wall Art");
		WebElement seaB = b.getSeBu();btnClk(seaB);
		WebElement wa  = b.getWall();btnClk(wa);
		WebElement wis = b.getWish();btnClk(wis);
		WebElement hoBtn = b.getHom();btnClk(hoBtn);
		Thread.sleep(2000);
//		WebElement se = b.getSebo();textBox(se, "toys");
//		WebElement seB = b.getSeBu();btnClk(seB);
//		WebElement to  = b.getToy();btnClk(to);
//		WebElement toy = b.getTy();
//		System.out.println(toy.getText());
		
	}@Test
	private void ts2() {
		Pojo b=new Pojo(); waits();
		WebElement hoBtn = b.getHom();btnClk(hoBtn);
		WebElement kids = b.getK();moveTo(kids);
		WebElement sweeCh = b.getSc();btnClk(sweeCh);
		JavascriptExecutor j=(JavascriptExecutor)pro;
		WebElement Card = b.getCar();moveTo(Card);
		WebElement moCar = b.getMoCa();btnClk(moCar);
		WebElement gi = b.getPerGif();
		j.executeScript("arguments[0].scrollIntoView(true)", gi);
		System.out.println(gi.getText());
		WebElement bab  = b.getBab();btnClk(bab);
		WebElement ooY = b.getOoY();
		j.executeScript("arguments[0].scrollIntoView(true)", ooY);
		System.out.println(ooY.getText());
		WebElement tp = b.getTp();
		j.executeScript("arguments[0].scrollIntoView(false)", tp);
		System.out.println(tp.getText());
		
	}@Test
	private void ts3() throws AWTException, IOException, InterruptedException {
		Pojo b=new ProGp();waits();
		WebElement hoBtn = b.getHom();btnClk(hoBtn);
		WebElement ac = b.getAc();btnClk(ac);
		
		WebElement wine = b.getWie();textBox(wine, "Eye Thousand");
		WebElement na = b.getWie1();textBox(na, "Juat 4 Wine");
		WebElement na1 = b.getWie2();textBox(na1, "Ntng Spcl");
		WebElement cl = b.getWie3();btnClk(cl);		
		WebElement cart = b.getWie4();btnClk(cart);
	}@Test
	private void ts4() throws IOException {
		Pojo b=new ProGp();waits();
		WebElement hoBtn = b.getHom();btnClk(hoBtn);
		WebElement perG  = b.getPerG();moveTo(perG);
		WebElement phMu  = b.getPhMu();btnClk(phMu);
		TakesScreenshot t=(TakesScreenshot)pro;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\lenovo\\eclipse-workspace\\ProjectGp\\ScreenShot\\img.png");
		FileUtils.copyFile(s, d);
		
		
	}@AfterMethod
	private void afeCls() {
		Date d=new Date();
		System.out.println(d);
	}
}
