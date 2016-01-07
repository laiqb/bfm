package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Tbtenderinfo generated by hbm2java
 */
public class Tbtenderinfo implements java.io.Serializable {

	private String tenderInfoId;
	private BigDecimal transDate;
	private String tenderInfoNo;
	private String businClass;
	private String interCode;
	private String stockCode;
	private String stockName;
	private String stockType;
	private String termUnit;
	private BigDecimal existLimit;
	private String bidType;
	private BigDecimal issueAmount;
	private String custNo;
	private BigDecimal publishPrice;
	private BigDecimal profit;
	private BigDecimal basicAmount;
	private BigDecimal feeRate;
	private BigDecimal gkIndex;
	private BigDecimal gkBeginDate;
	private BigDecimal gkEndDate;
	private BigDecimal bidBeginDate;
	private BigDecimal bidBeginTime;
	private BigDecimal bidEndDate;
	private BigDecimal bidEndTime;
	private String togetherPay;
	private String bank;
	private String interestBank;
	private String account;
	private String interestAccount;
	private String accountname;
	private String interestAccountname;
	private String bankNo;
	private String interestBankNo;
	private BigDecimal settleSpeed;
	private String tenderInfoType;
	private BigDecimal beginCalDate;
	private BigDecimal endDate;
	private BigDecimal payDate;
	private String firstSettleType;
	private String secondSettleType;
	private String surtender;
	private String bidContinue;
	private BigDecimal marketDate;

	public Tbtenderinfo() {
	}

	public Tbtenderinfo(String tenderInfoId, BigDecimal transDate,
			String tenderInfoNo, String businClass, String interCode,
			String stockCode, String stockName, String stockType,
			String termUnit, BigDecimal existLimit, String bidType,
			BigDecimal issueAmount, String custNo, BigDecimal publishPrice,
			BigDecimal profit, BigDecimal basicAmount, BigDecimal feeRate,
			BigDecimal gkIndex, BigDecimal gkBeginDate, BigDecimal gkEndDate,
			BigDecimal bidBeginDate, BigDecimal bidBeginTime,
			BigDecimal bidEndDate, BigDecimal bidEndTime, String togetherPay,
			String bank, String interestBank, String account,
			String interestAccount, String accountname,
			String interestAccountname, String bankNo, String interestBankNo,
			BigDecimal settleSpeed, String tenderInfoType,
			BigDecimal beginCalDate, BigDecimal endDate, BigDecimal payDate,
			String firstSettleType, String secondSettleType, String surtender,
			String bidContinue, BigDecimal marketDate) {
		this.tenderInfoId = tenderInfoId;
		this.transDate = transDate;
		this.tenderInfoNo = tenderInfoNo;
		this.businClass = businClass;
		this.interCode = interCode;
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockType = stockType;
		this.termUnit = termUnit;
		this.existLimit = existLimit;
		this.bidType = bidType;
		this.issueAmount = issueAmount;
		this.custNo = custNo;
		this.publishPrice = publishPrice;
		this.profit = profit;
		this.basicAmount = basicAmount;
		this.feeRate = feeRate;
		this.gkIndex = gkIndex;
		this.gkBeginDate = gkBeginDate;
		this.gkEndDate = gkEndDate;
		this.bidBeginDate = bidBeginDate;
		this.bidBeginTime = bidBeginTime;
		this.bidEndDate = bidEndDate;
		this.bidEndTime = bidEndTime;
		this.togetherPay = togetherPay;
		this.bank = bank;
		this.interestBank = interestBank;
		this.account = account;
		this.interestAccount = interestAccount;
		this.accountname = accountname;
		this.interestAccountname = interestAccountname;
		this.bankNo = bankNo;
		this.interestBankNo = interestBankNo;
		this.settleSpeed = settleSpeed;
		this.tenderInfoType = tenderInfoType;
		this.beginCalDate = beginCalDate;
		this.endDate = endDate;
		this.payDate = payDate;
		this.firstSettleType = firstSettleType;
		this.secondSettleType = secondSettleType;
		this.surtender = surtender;
		this.bidContinue = bidContinue;
		this.marketDate = marketDate;
	}

	public String getTenderInfoId() {
		return this.tenderInfoId;
	}

	public void setTenderInfoId(String tenderInfoId) {
		this.tenderInfoId = tenderInfoId;
	}

	public BigDecimal getTransDate() {
		return this.transDate;
	}

	public void setTransDate(BigDecimal transDate) {
		this.transDate = transDate;
	}

	public String getTenderInfoNo() {
		return this.tenderInfoNo;
	}

	public void setTenderInfoNo(String tenderInfoNo) {
		this.tenderInfoNo = tenderInfoNo;
	}

	public String getBusinClass() {
		return this.businClass;
	}

	public void setBusinClass(String businClass) {
		this.businClass = businClass;
	}

	public String getInterCode() {
		return this.interCode;
	}

	public void setInterCode(String interCode) {
		this.interCode = interCode;
	}

	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockType() {
		return this.stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	public String getTermUnit() {
		return this.termUnit;
	}

	public void setTermUnit(String termUnit) {
		this.termUnit = termUnit;
	}

	public BigDecimal getExistLimit() {
		return this.existLimit;
	}

	public void setExistLimit(BigDecimal existLimit) {
		this.existLimit = existLimit;
	}

	public String getBidType() {
		return this.bidType;
	}

	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public BigDecimal getIssueAmount() {
		return this.issueAmount;
	}

	public void setIssueAmount(BigDecimal issueAmount) {
		this.issueAmount = issueAmount;
	}

	public String getCustNo() {
		return this.custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public BigDecimal getPublishPrice() {
		return this.publishPrice;
	}

	public void setPublishPrice(BigDecimal publishPrice) {
		this.publishPrice = publishPrice;
	}

	public BigDecimal getProfit() {
		return this.profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public BigDecimal getBasicAmount() {
		return this.basicAmount;
	}

	public void setBasicAmount(BigDecimal basicAmount) {
		this.basicAmount = basicAmount;
	}

	public BigDecimal getFeeRate() {
		return this.feeRate;
	}

	public void setFeeRate(BigDecimal feeRate) {
		this.feeRate = feeRate;
	}

	public BigDecimal getGkIndex() {
		return this.gkIndex;
	}

	public void setGkIndex(BigDecimal gkIndex) {
		this.gkIndex = gkIndex;
	}

	public BigDecimal getGkBeginDate() {
		return this.gkBeginDate;
	}

	public void setGkBeginDate(BigDecimal gkBeginDate) {
		this.gkBeginDate = gkBeginDate;
	}

	public BigDecimal getGkEndDate() {
		return this.gkEndDate;
	}

	public void setGkEndDate(BigDecimal gkEndDate) {
		this.gkEndDate = gkEndDate;
	}

	public BigDecimal getBidBeginDate() {
		return this.bidBeginDate;
	}

	public void setBidBeginDate(BigDecimal bidBeginDate) {
		this.bidBeginDate = bidBeginDate;
	}

	public BigDecimal getBidBeginTime() {
		return this.bidBeginTime;
	}

	public void setBidBeginTime(BigDecimal bidBeginTime) {
		this.bidBeginTime = bidBeginTime;
	}

	public BigDecimal getBidEndDate() {
		return this.bidEndDate;
	}

	public void setBidEndDate(BigDecimal bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	public BigDecimal getBidEndTime() {
		return this.bidEndTime;
	}

	public void setBidEndTime(BigDecimal bidEndTime) {
		this.bidEndTime = bidEndTime;
	}

	public String getTogetherPay() {
		return this.togetherPay;
	}

	public void setTogetherPay(String togetherPay) {
		this.togetherPay = togetherPay;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getInterestBank() {
		return this.interestBank;
	}

	public void setInterestBank(String interestBank) {
		this.interestBank = interestBank;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getInterestAccount() {
		return this.interestAccount;
	}

	public void setInterestAccount(String interestAccount) {
		this.interestAccount = interestAccount;
	}

	public String getAccountname() {
		return this.accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getInterestAccountname() {
		return this.interestAccountname;
	}

	public void setInterestAccountname(String interestAccountname) {
		this.interestAccountname = interestAccountname;
	}

	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getInterestBankNo() {
		return this.interestBankNo;
	}

	public void setInterestBankNo(String interestBankNo) {
		this.interestBankNo = interestBankNo;
	}

	public BigDecimal getSettleSpeed() {
		return this.settleSpeed;
	}

	public void setSettleSpeed(BigDecimal settleSpeed) {
		this.settleSpeed = settleSpeed;
	}

	public String getTenderInfoType() {
		return this.tenderInfoType;
	}

	public void setTenderInfoType(String tenderInfoType) {
		this.tenderInfoType = tenderInfoType;
	}

	public BigDecimal getBeginCalDate() {
		return this.beginCalDate;
	}

	public void setBeginCalDate(BigDecimal beginCalDate) {
		this.beginCalDate = beginCalDate;
	}

	public BigDecimal getEndDate() {
		return this.endDate;
	}

	public void setEndDate(BigDecimal endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getPayDate() {
		return this.payDate;
	}

	public void setPayDate(BigDecimal payDate) {
		this.payDate = payDate;
	}

	public String getFirstSettleType() {
		return this.firstSettleType;
	}

	public void setFirstSettleType(String firstSettleType) {
		this.firstSettleType = firstSettleType;
	}

	public String getSecondSettleType() {
		return this.secondSettleType;
	}

	public void setSecondSettleType(String secondSettleType) {
		this.secondSettleType = secondSettleType;
	}

	public String getSurtender() {
		return this.surtender;
	}

	public void setSurtender(String surtender) {
		this.surtender = surtender;
	}

	public String getBidContinue() {
		return this.bidContinue;
	}

	public void setBidContinue(String bidContinue) {
		this.bidContinue = bidContinue;
	}

	public BigDecimal getMarketDate() {
		return this.marketDate;
	}

	public void setMarketDate(BigDecimal marketDate) {
		this.marketDate = marketDate;
	}

}