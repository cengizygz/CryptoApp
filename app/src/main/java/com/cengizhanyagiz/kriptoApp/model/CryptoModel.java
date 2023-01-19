package com.cengizhanyagiz.kriptoApp.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("pair")
    public String currency;
    @SerializedName("last")
    public String price;

 //   @SerializedName("currency")
 //   public String currency;
 //   @SerializedName("price")
 //   public String price;

}
