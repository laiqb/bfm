package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TmpAthedgeamorzsumId generated by hbm2java
 */
public class TmpAthedgeamorzsumId implements java.io.Serializable {

	private String hsdate;
	private String transId;
	private String bookcode;
	private String assetId;
	private String assetPort;
	private String costsCenter;
	private String assetType;
	private String amorBdate;
	private String amorEdate;
	private String amorDate;
	private char amorType;
	private String curCode;
	private String bookBranch;
	private Character amorFlag;
	private BigDecimal rate;
	private BigDecimal amt;
	private BigDecimal assetAmor;
	private BigDecimal assetAlamor;
	private BigDecimal assetBlamor;
	private BigDecimal amorDays;

	public TmpAthedgeamorzsumId() {
	}

	public TmpAthedgeamorzsumId(String hsdate, String transId, String bookcode,
			String assetId, String assetPort, String costsCenter,
			String assetType, String amorBdate, String amorEdate,
			String amorDate, char amorType, String curCode) {
		this.hsdate = hsdate;
		this.transId = transId;
		this.bookcode = bookcode;
		this.assetId = assetId;
		this.assetPort = assetPort;
		this.costsCenter = costsCenter;
		this.assetType = assetType;
		this.amorBdate = amorBdate;
		this.amorEdate = amorEdate;
		this.amorDate = amorDate;
		this.amorType = amorType;
		this.curCode = curCode;
	}

	public TmpAthedgeamorzsumId(String hsdate, String transId, String bookcode,
			String assetId, String assetPort, String costsCenter,
			String assetType, String amorBdate, String amorEdate,
			String amorDate, char amorType, String curCode, String bookBranch,
			Character amorFlag, BigDecimal rate, BigDecimal amt,
			BigDecimal assetAmor, BigDecimal assetAlamor,
			BigDecimal assetBlamor, BigDecimal amorDays) {
		this.hsdate = hsdate;
		this.transId = transId;
		this.bookcode = bookcode;
		this.assetId = assetId;
		this.assetPort = assetPort;
		this.costsCenter = costsCenter;
		this.assetType = assetType;
		this.amorBdate = amorBdate;
		this.amorEdate = amorEdate;
		this.amorDate = amorDate;
		this.amorType = amorType;
		this.curCode = curCode;
		this.bookBranch = bookBranch;
		this.amorFlag = amorFlag;
		this.rate = rate;
		this.amt = amt;
		this.assetAmor = assetAmor;
		this.assetAlamor = assetAlamor;
		this.assetBlamor = assetBlamor;
		this.amorDays = amorDays;
	}

	public String getHsdate() {
		return this.hsdate;
	}

	public void setHsdate(String hsdate) {
		this.hsdate = hsdate;
	}

	public String getTransId() {
		return this.transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getBookcode() {
		return this.bookcode;
	}

	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}

	public String getAssetId() {
		return this.assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetPort() {
		return this.assetPort;
	}

	public void setAssetPort(String assetPort) {
		this.assetPort = assetPort;
	}

	public String getCostsCenter() {
		return this.costsCenter;
	}

	public void setCostsCenter(String costsCenter) {
		this.costsCenter = costsCenter;
	}

	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAmorBdate() {
		return this.amorBdate;
	}

	public void setAmorBdate(String amorBdate) {
		this.amorBdate = amorBdate;
	}

	public String getAmorEdate() {
		return this.amorEdate;
	}

	public void setAmorEdate(String amorEdate) {
		this.amorEdate = amorEdate;
	}

	public String getAmorDate() {
		return this.amorDate;
	}

	public void setAmorDate(String amorDate) {
		this.amorDate = amorDate;
	}

	public char getAmorType() {
		return this.amorType;
	}

	public void setAmorType(char amorType) {
		this.amorType = amorType;
	}

	public String getCurCode() {
		return this.curCode;
	}

	public void setCurCode(String curCode) {
		this.curCode = curCode;
	}

	public String getBookBranch() {
		return this.bookBranch;
	}

	public void setBookBranch(String bookBranch) {
		this.bookBranch = bookBranch;
	}

	public Character getAmorFlag() {
		return this.amorFlag;
	}

	public void setAmorFlag(Character amorFlag) {
		this.amorFlag = amorFlag;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getAssetAmor() {
		return this.assetAmor;
	}

	public void setAssetAmor(BigDecimal assetAmor) {
		this.assetAmor = assetAmor;
	}

	public BigDecimal getAssetAlamor() {
		return this.assetAlamor;
	}

	public void setAssetAlamor(BigDecimal assetAlamor) {
		this.assetAlamor = assetAlamor;
	}

	public BigDecimal getAssetBlamor() {
		return this.assetBlamor;
	}

	public void setAssetBlamor(BigDecimal assetBlamor) {
		this.assetBlamor = assetBlamor;
	}

	public BigDecimal getAmorDays() {
		return this.amorDays;
	}

	public void setAmorDays(BigDecimal amorDays) {
		this.amorDays = amorDays;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmpAthedgeamorzsumId))
			return false;
		TmpAthedgeamorzsumId castOther = (TmpAthedgeamorzsumId) other;

		return ((this.getHsdate() == castOther.getHsdate()) || (this
				.getHsdate() != null && castOther.getHsdate() != null && this
				.getHsdate().equals(castOther.getHsdate())))
				&& ((this.getTransId() == castOther.getTransId()) || (this
						.getTransId() != null && castOther.getTransId() != null && this
						.getTransId().equals(castOther.getTransId())))
				&& ((this.getBookcode() == castOther.getBookcode()) || (this
						.getBookcode() != null
						&& castOther.getBookcode() != null && this
						.getBookcode().equals(castOther.getBookcode())))
				&& ((this.getAssetId() == castOther.getAssetId()) || (this
						.getAssetId() != null && castOther.getAssetId() != null && this
						.getAssetId().equals(castOther.getAssetId())))
				&& ((this.getAssetPort() == castOther.getAssetPort()) || (this
						.getAssetPort() != null
						&& castOther.getAssetPort() != null && this
						.getAssetPort().equals(castOther.getAssetPort())))
				&& ((this.getCostsCenter() == castOther.getCostsCenter()) || (this
						.getCostsCenter() != null
						&& castOther.getCostsCenter() != null && this
						.getCostsCenter().equals(castOther.getCostsCenter())))
				&& ((this.getAssetType() == castOther.getAssetType()) || (this
						.getAssetType() != null
						&& castOther.getAssetType() != null && this
						.getAssetType().equals(castOther.getAssetType())))
				&& ((this.getAmorBdate() == castOther.getAmorBdate()) || (this
						.getAmorBdate() != null
						&& castOther.getAmorBdate() != null && this
						.getAmorBdate().equals(castOther.getAmorBdate())))
				&& ((this.getAmorEdate() == castOther.getAmorEdate()) || (this
						.getAmorEdate() != null
						&& castOther.getAmorEdate() != null && this
						.getAmorEdate().equals(castOther.getAmorEdate())))
				&& ((this.getAmorDate() == castOther.getAmorDate()) || (this
						.getAmorDate() != null
						&& castOther.getAmorDate() != null && this
						.getAmorDate().equals(castOther.getAmorDate())))
				&& (this.getAmorType() == castOther.getAmorType())
				&& ((this.getCurCode() == castOther.getCurCode()) || (this
						.getCurCode() != null && castOther.getCurCode() != null && this
						.getCurCode().equals(castOther.getCurCode())))
				&& ((this.getBookBranch() == castOther.getBookBranch()) || (this
						.getBookBranch() != null
						&& castOther.getBookBranch() != null && this
						.getBookBranch().equals(castOther.getBookBranch())))
				&& ((this.getAmorFlag() == castOther.getAmorFlag()) || (this
						.getAmorFlag() != null
						&& castOther.getAmorFlag() != null && this
						.getAmorFlag().equals(castOther.getAmorFlag())))
				&& ((this.getRate() == castOther.getRate()) || (this.getRate() != null
						&& castOther.getRate() != null && this.getRate()
						.equals(castOther.getRate())))
				&& ((this.getAmt() == castOther.getAmt()) || (this.getAmt() != null
						&& castOther.getAmt() != null && this.getAmt().equals(
						castOther.getAmt())))
				&& ((this.getAssetAmor() == castOther.getAssetAmor()) || (this
						.getAssetAmor() != null
						&& castOther.getAssetAmor() != null && this
						.getAssetAmor().equals(castOther.getAssetAmor())))
				&& ((this.getAssetAlamor() == castOther.getAssetAlamor()) || (this
						.getAssetAlamor() != null
						&& castOther.getAssetAlamor() != null && this
						.getAssetAlamor().equals(castOther.getAssetAlamor())))
				&& ((this.getAssetBlamor() == castOther.getAssetBlamor()) || (this
						.getAssetBlamor() != null
						&& castOther.getAssetBlamor() != null && this
						.getAssetBlamor().equals(castOther.getAssetBlamor())))
				&& ((this.getAmorDays() == castOther.getAmorDays()) || (this
						.getAmorDays() != null
						&& castOther.getAmorDays() != null && this
						.getAmorDays().equals(castOther.getAmorDays())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getHsdate() == null ? 0 : this.getHsdate().hashCode());
		result = 37 * result
				+ (getTransId() == null ? 0 : this.getTransId().hashCode());
		result = 37 * result
				+ (getBookcode() == null ? 0 : this.getBookcode().hashCode());
		result = 37 * result
				+ (getAssetId() == null ? 0 : this.getAssetId().hashCode());
		result = 37 * result
				+ (getAssetPort() == null ? 0 : this.getAssetPort().hashCode());
		result = 37
				* result
				+ (getCostsCenter() == null ? 0 : this.getCostsCenter()
						.hashCode());
		result = 37 * result
				+ (getAssetType() == null ? 0 : this.getAssetType().hashCode());
		result = 37 * result
				+ (getAmorBdate() == null ? 0 : this.getAmorBdate().hashCode());
		result = 37 * result
				+ (getAmorEdate() == null ? 0 : this.getAmorEdate().hashCode());
		result = 37 * result
				+ (getAmorDate() == null ? 0 : this.getAmorDate().hashCode());
		result = 37 * result + this.getAmorType();
		result = 37 * result
				+ (getCurCode() == null ? 0 : this.getCurCode().hashCode());
		result = 37
				* result
				+ (getBookBranch() == null ? 0 : this.getBookBranch()
						.hashCode());
		result = 37 * result
				+ (getAmorFlag() == null ? 0 : this.getAmorFlag().hashCode());
		result = 37 * result
				+ (getRate() == null ? 0 : this.getRate().hashCode());
		result = 37 * result
				+ (getAmt() == null ? 0 : this.getAmt().hashCode());
		result = 37 * result
				+ (getAssetAmor() == null ? 0 : this.getAssetAmor().hashCode());
		result = 37
				* result
				+ (getAssetAlamor() == null ? 0 : this.getAssetAlamor()
						.hashCode());
		result = 37
				* result
				+ (getAssetBlamor() == null ? 0 : this.getAssetBlamor()
						.hashCode());
		result = 37 * result
				+ (getAmorDays() == null ? 0 : this.getAmorDays().hashCode());
		return result;
	}

}
