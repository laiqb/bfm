package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Tbtempinstrhgmortagage generated by hbm2java
 */
public class Tbtempinstrhgmortagage implements java.io.Serializable {

	private TbtempinstrhgmortagageId id;
	private String fundNo;
	private String assetNo;
	private BigDecimal mortagageRatio;
	private BigDecimal mortagageAmount;
	private BigDecimal mortagagedAmount;

	public Tbtempinstrhgmortagage() {
	}

	public Tbtempinstrhgmortagage(TbtempinstrhgmortagageId id, String fundNo,
			String assetNo, BigDecimal mortagageRatio,
			BigDecimal mortagageAmount, BigDecimal mortagagedAmount) {
		this.id = id;
		this.fundNo = fundNo;
		this.assetNo = assetNo;
		this.mortagageRatio = mortagageRatio;
		this.mortagageAmount = mortagageAmount;
		this.mortagagedAmount = mortagagedAmount;
	}

	public TbtempinstrhgmortagageId getId() {
		return this.id;
	}

	public void setId(TbtempinstrhgmortagageId id) {
		this.id = id;
	}

	public String getFundNo() {
		return this.fundNo;
	}

	public void setFundNo(String fundNo) {
		this.fundNo = fundNo;
	}

	public String getAssetNo() {
		return this.assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public BigDecimal getMortagageRatio() {
		return this.mortagageRatio;
	}

	public void setMortagageRatio(BigDecimal mortagageRatio) {
		this.mortagageRatio = mortagageRatio;
	}

	public BigDecimal getMortagageAmount() {
		return this.mortagageAmount;
	}

	public void setMortagageAmount(BigDecimal mortagageAmount) {
		this.mortagageAmount = mortagageAmount;
	}

	public BigDecimal getMortagagedAmount() {
		return this.mortagagedAmount;
	}

	public void setMortagagedAmount(BigDecimal mortagagedAmount) {
		this.mortagagedAmount = mortagagedAmount;
	}

}
