package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseCls{
	 public Pojo() {
		PageFactory.initElements(pro, this);
	}
	@FindBy(xpath="//div[@id='accountsLinks']") private WebElement lb;
	@FindBy(id="EmailAddress") private WebElement em;
	@FindBy(id="Password") private WebElement ps;
	@FindBy(xpath="(//button[@onclick='cookieconsent();'])[2]") private WebElement cok;
	@FindBy(xpath="//button[text()='Login']") private WebElement lg;
	@FindBy(xpath="//I[@class='glyphicon glyphicon-home']") private WebElement hom;
	@FindAll({
		@FindBy(xpath="//button[@title='Close']"), 
		@FindBy(xpath="//button[text()='No thanks']") 
	}) private WebElement popUp;
	@FindBy(xpath="//input[@id='searchText']") private WebElement sebo;
	@FindBy(xpath="//button[@id='searchButton']") private WebElement seBu;
	@FindBy(xpath="(//div[@class='text-center name'])[4]") private WebElement wall;
	@FindAll({
		@FindBy(xpath="//div[@class='product-wishlist']"),
		@FindBy(xpath="(//div[@class='product-wishlist pull-right'])[3]")
	}) private WebElement wish;
	@FindBy(xpath="//a[@id='headerLink-md-6']") private WebElement k;
	@FindBy(xpath="//a[text()='Sweets & Chocolate']") private WebElement sc;
	@FindBy(xpath="//a[text()='Cards']") private WebElement car;
	@FindBy(xpath="//a[text()='Birthday Cards']") private WebElement moCa;
	@FindBy(xpath="//b[text()='personalised gift']") private WebElement perGif;
	@FindBy(xpath="(//img[@data-slimmage='true'])[18]") private WebElement bab;
	@FindBy(xpath="//b[text()='On Your First Birthday Card']") private WebElement ooY;
	@FindBy(xpath="//h1[contains(text(),'Personalised Birthday ')]") private WebElement tp;
	@FindBy(xpath="(//div[@class='text-center name'])[19]") private WebElement toy;
	@FindBy(xpath="//div[contains(text(),'Cuddle up with this soft ')]") private WebElement ty;
	@FindBy(xpath="(//div[@class='col-sm-5ths col-md-5ths col-lg-5ths'])[6]") private WebElement ac;
	@FindBy(xpath="//input[@placeholder='Jessica']") private WebElement wie;
	@FindBy(xpath="//input[@placeholder='Loads of love']") private WebElement wie1;
	@FindBy(xpath="//input[@placeholder='Mike X']") private WebElement wie2;
	@FindBy(xpath="//button[@data-aid='previewYourGift']") private WebElement wie3;
	@FindBy(xpath="//span[@class='productBtn']") private WebElement wie4;
	@FindBy(xpath="//a[@id='headerLink-md-0']") private WebElement perG;
	@FindBy(xpath="//a[@data-aid='Photo Mugs']") private WebElement phMu;
	
	public static WebDriver getPro() {
		return pro;
	}
	public WebElement getLb() {
		return lb;
	}
	public WebElement getEm() {
		return em;
	}
	public WebElement getPs() {
		return ps;
	}
	public WebElement getCok() {
		return cok;
	}
	public WebElement getLg() {
		return lg;
	}
	public WebElement getHom() {
		return hom;
	}
	public WebElement getPopUp() {
		return popUp;
	}
	public WebElement getSebo() {
		return sebo;
	}
	public WebElement getSeBu() {
		return seBu;
	}
	public WebElement getWall() {
		return wall;
	}
	public WebElement getWish() {
		return wish;
	}
	public WebElement getK() {
		return k;
	}
	public WebElement getSc() {
		return sc;
	}
	public WebElement getCar() {
		return car;
	}
	public WebElement getMoCa() {
		return moCa;
	}
	public WebElement getPerGif() {
		return perGif;
	}
	public WebElement getBab() {
		return bab;
	}
	public WebElement getToy() {
		return toy;
	}
	public WebElement getTy() {
		return ty;
	}
	public WebElement getOoY() {
		return ooY;
	}
	public WebElement getTp() {
		return tp;
	}
	public WebElement getAc() {
		return ac;
	}
	public WebElement getWie() {
		return wie;
	}
	public WebElement getWie1() {
		return wie1;
	}
	public WebElement getWie2() {
		return wie2;
	}
	public WebElement getWie3() {
		return wie3;
	}
	public WebElement getWie4() {
		return wie4;
	}
	public WebElement getPerG() {
		return perG;
	}
	public WebElement getPhMu() {
		return phMu;
	}
	
	
}
