package com.mastercoding.marketapp;
//this class ct as a  model class for our recycler view
public class ItemModel {

    int itemImg;
    String itemTitle;
    String itemDescription;

    public ItemModel(int itemImg, String itemTitle, String itemDescription) {
        this.itemImg = itemImg;
        this.itemTitle = itemTitle;
        this.itemDescription = itemDescription;
    }

    public int getItemImg() {
        return itemImg;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
}
