package com.ares.model;

import java.util.List;

import lombok.Data;

@Data
public class PriceModel {
	private String market;
	
	private String symbol;
	
	private double price;
	
	private List<PriceModel> nodes;
	
	private String sn;
	
	private Long systs=System.currentTimeMillis();
	
	private Long ts=System.currentTimeMillis();

	public PriceModel(String market, String symbol, double price,Long ts) {
		super();
		this.market = market;
		this.symbol = symbol;
		this.price = price;
		this.ts=ts;
	}
	
	public PriceModel(String symbol, double price) {
		super();
		this.symbol = symbol;
		this.price = price;
	}
	
	
	public PriceModel(String symbol, double price,String  sn) {
		super();
		this.symbol = symbol;
		this.price = price;
		this.sn = sn;
	}
	
	
	
	
	
	
}
