import java.io.Serializable;

public class Items implements Serializable{
	/**
	 * Author: Kelan McNally
	 */
	private int itemID = -1;
	private String itemName = "Empty";
	private String itemDesc = "This is an empty item class";
	private String itemEffect = "This is also an empty item class";
	private String itemLocation = "Yet another empty item class";
	
	public Items(int itemID, String itemName, String itemDesc, String itemEffect, String itemLocation) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemEffect = itemEffect;
		this.itemLocation = itemLocation;
	}
	
	public Items() {
		
	}
	
	public int getItemID() {
		return itemID;
	}
	
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getItemDesc() {
		return itemDesc;
	}
	
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public String getItemEffect() {
		return itemEffect;
	}
	
	public void setItemEffect(String itemEffect) {
		this.itemEffect = itemEffect;
	}
	
	public String getItemLocation() {
		return itemLocation;
	}
	
	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}
}