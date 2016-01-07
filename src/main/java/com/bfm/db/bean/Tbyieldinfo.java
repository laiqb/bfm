package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Tbyieldinfo generated by hbm2java
 */
public class Tbyieldinfo implements java.io.Serializable {

	private TbyieldinfoId id;
	private BigDecimal endDate;
	private String yieldName;
	private BigDecimal yield;
	private BigDecimal lastTime;

	public Tbyieldinfo() {
	}

	public Tbyieldinfo(TbyieldinfoId id, BigDecimal endDate, String yieldName,
			BigDecimal yield, BigDecimal lastTime) {
		this.id = id;
		this.endDate = endDate;
		this.yieldName = yieldName;
		this.yield = yield;
		this.lastTime = lastTime;
	}

	public TbyieldinfoId getId() {
		return this.id;
	}

	public void setId(TbyieldinfoId id) {
		this.id = id;
	}

	public BigDecimal getEndDate() {
		return this.endDate;
	}

	public void setEndDate(BigDecimal endDate) {
		this.endDate = endDate;
	}

	public String getYieldName() {
		return this.yieldName;
	}

	public void setYieldName(String yieldName) {
		this.yieldName = yieldName;
	}

	public BigDecimal getYield() {
		return this.yield;
	}

	public void setYield(BigDecimal yield) {
		this.yield = yield;
	}

	public BigDecimal getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(BigDecimal lastTime) {
		this.lastTime = lastTime;
	}

}