package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TbunitcflId generated by hbm2java
 */
public class TbunitcflId implements java.io.Serializable {

	private BigDecimal cflNo;
	private String combiNo;
	private String investType;
	private String interCode;

	public TbunitcflId() {
	}

	public TbunitcflId(BigDecimal cflNo, String combiNo, String investType,
			String interCode) {
		this.cflNo = cflNo;
		this.combiNo = combiNo;
		this.investType = investType;
		this.interCode = interCode;
	}

	public BigDecimal getCflNo() {
		return this.cflNo;
	}

	public void setCflNo(BigDecimal cflNo) {
		this.cflNo = cflNo;
	}

	public String getCombiNo() {
		return this.combiNo;
	}

	public void setCombiNo(String combiNo) {
		this.combiNo = combiNo;
	}

	public String getInvestType() {
		return this.investType;
	}

	public void setInvestType(String investType) {
		this.investType = investType;
	}

	public String getInterCode() {
		return this.interCode;
	}

	public void setInterCode(String interCode) {
		this.interCode = interCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbunitcflId))
			return false;
		TbunitcflId castOther = (TbunitcflId) other;

		return ((this.getCflNo() == castOther.getCflNo()) || (this.getCflNo() != null
				&& castOther.getCflNo() != null && this.getCflNo().equals(
				castOther.getCflNo())))
				&& ((this.getCombiNo() == castOther.getCombiNo()) || (this
						.getCombiNo() != null && castOther.getCombiNo() != null && this
						.getCombiNo().equals(castOther.getCombiNo())))
				&& ((this.getInvestType() == castOther.getInvestType()) || (this
						.getInvestType() != null
						&& castOther.getInvestType() != null && this
						.getInvestType().equals(castOther.getInvestType())))
				&& ((this.getInterCode() == castOther.getInterCode()) || (this
						.getInterCode() != null
						&& castOther.getInterCode() != null && this
						.getInterCode().equals(castOther.getInterCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCflNo() == null ? 0 : this.getCflNo().hashCode());
		result = 37 * result
				+ (getCombiNo() == null ? 0 : this.getCombiNo().hashCode());
		result = 37
				* result
				+ (getInvestType() == null ? 0 : this.getInvestType()
						.hashCode());
		result = 37 * result
				+ (getInterCode() == null ? 0 : this.getInterCode().hashCode());
		return result;
	}

}