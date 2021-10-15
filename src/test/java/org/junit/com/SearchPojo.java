package org.junit.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends LibGlobal{
	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotl;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement rnum;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement cdate;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement odate;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBys({@FindBy(id="location"),@FindBy(xpath="//input[@value='Search']")})
	private WebElement sbtn;
	
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotl() {
		return hotl;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getRnum() {
		return rnum;
	}
	public WebElement getCdate() {
		return cdate;
	}
	public WebElement getOdate() {
		return odate;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSbtn() {
		return sbtn;
	}
	
	
	

}
