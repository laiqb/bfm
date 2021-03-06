package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Tbunitstock generated by hbm2java
 */
public class Tbunitstock implements java.io.Serializable {

	private TbunitstockId id;
	private BigDecimal transDate;
	private String fundNo;
	private String assetNo;
	private String marketNo;
	private BigDecimal beginAmount;
	private BigDecimal currentAmount;
	private BigDecimal currentRepoAmount;
	private BigDecimal currentReporevAmount;
	private BigDecimal currentLoanrevAmount;
	private BigDecimal currentLoanAmount;
	private BigDecimal frozenAmount;
	private BigDecimal unfrozenAmount;
	private BigDecimal mortrevFrozenAmount;
	private BigDecimal mortFrozenAmount;
	private BigDecimal forceFrozenAmount;
	private BigDecimal sysFrozenAmount;
	private BigDecimal buyAmount;
	private BigDecimal saleAmount;
	private BigDecimal preBuyAmount;
	private BigDecimal preSaleAmount;
	private BigDecimal tempFrozenAmount;
	private BigDecimal tempFrozenAmount2;
	private BigDecimal tempUnfrozenAmount;
	private BigDecimal t1TempFrozenAmount;
	private BigDecimal t1FrozenAmount;
	private BigDecimal buyBalance;
	private BigDecimal saleBalance;
	private BigDecimal buyFee;
	private BigDecimal saleFee;
	private BigDecimal buyUnsettleAmount;
	private BigDecimal saleUnsettleAmount;
	private BigDecimal buyUnsettleBalance;
	private BigDecimal saleUnsettleBalance;
	private BigDecimal buyUnsettleAmount2;
	private BigDecimal saleUnsettleAmount2;
	private BigDecimal untransferedInvest;
	private BigDecimal fairvalueChange;
	private BigDecimal interestInvest;
	private BigDecimal accumulateProfit;
	private BigDecimal turnInvest;
	private BigDecimal turnInterestInvest;
	private BigDecimal turnProfit;
	private String seatNo;
	private String stockholderId;
	private String positionFlag;
	private BigDecimal todayProfit;
	private BigDecimal currentCost;
	private BigDecimal preImpawnAmount;
	private BigDecimal impawnAmount;
	private BigDecimal preReturnAmount;
	private BigDecimal returnAmount;
	private BigDecimal currentImpawnAmount;

	public Tbunitstock() {
	}

	public Tbunitstock(TbunitstockId id, BigDecimal transDate, String fundNo,
			String assetNo, String marketNo, BigDecimal beginAmount,
			BigDecimal currentAmount, BigDecimal currentRepoAmount,
			BigDecimal currentReporevAmount, BigDecimal currentLoanrevAmount,
			BigDecimal currentLoanAmount, BigDecimal frozenAmount,
			BigDecimal unfrozenAmount, BigDecimal mortrevFrozenAmount,
			BigDecimal mortFrozenAmount, BigDecimal forceFrozenAmount,
			BigDecimal sysFrozenAmount, BigDecimal buyAmount,
			BigDecimal saleAmount, BigDecimal preBuyAmount,
			BigDecimal preSaleAmount, BigDecimal tempFrozenAmount,
			BigDecimal tempFrozenAmount2, BigDecimal tempUnfrozenAmount,
			BigDecimal t1TempFrozenAmount, BigDecimal t1FrozenAmount,
			BigDecimal buyBalance, BigDecimal saleBalance, BigDecimal buyFee,
			BigDecimal saleFee, BigDecimal buyUnsettleAmount,
			BigDecimal saleUnsettleAmount, BigDecimal buyUnsettleBalance,
			BigDecimal saleUnsettleBalance, BigDecimal buyUnsettleAmount2,
			BigDecimal saleUnsettleAmount2, BigDecimal untransferedInvest,
			BigDecimal fairvalueChange, BigDecimal interestInvest,
			BigDecimal accumulateProfit, BigDecimal turnInvest,
			BigDecimal turnInterestInvest, BigDecimal turnProfit,
			String seatNo, String stockholderId, String positionFlag,
			BigDecimal todayProfit, BigDecimal currentCost,
			BigDecimal preImpawnAmount, BigDecimal impawnAmount,
			BigDecimal preReturnAmount, BigDecimal returnAmount,
			BigDecimal currentImpawnAmount) {
		this.id = id;
		this.transDate = transDate;
		this.fundNo = fundNo;
		this.assetNo = assetNo;
		this.marketNo = marketNo;
		this.beginAmount = beginAmount;
		this.currentAmount = currentAmount;
		this.currentRepoAmount = currentRepoAmount;
		this.currentReporevAmount = currentReporevAmount;
		this.currentLoanrevAmount = currentLoanrevAmount;
		this.currentLoanAmount = currentLoanAmount;
		this.frozenAmount = frozenAmount;
		this.unfrozenAmount = unfrozenAmount;
		this.mortrevFrozenAmount = mortrevFrozenAmount;
		this.mortFrozenAmount = mortFrozenAmount;
		this.forceFrozenAmount = forceFrozenAmount;
		this.sysFrozenAmount = sysFrozenAmount;
		this.buyAmount = buyAmount;
		this.saleAmount = saleAmount;
		this.preBuyAmount = preBuyAmount;
		this.preSaleAmount = preSaleAmount;
		this.tempFrozenAmount = tempFrozenAmount;
		this.tempFrozenAmount2 = tempFrozenAmount2;
		this.tempUnfrozenAmount = tempUnfrozenAmount;
		this.t1TempFrozenAmount = t1TempFrozenAmount;
		this.t1FrozenAmount = t1FrozenAmount;
		this.buyBalance = buyBalance;
		this.saleBalance = saleBalance;
		this.buyFee = buyFee;
		this.saleFee = saleFee;
		this.buyUnsettleAmount = buyUnsettleAmount;
		this.saleUnsettleAmount = saleUnsettleAmount;
		this.buyUnsettleBalance = buyUnsettleBalance;
		this.saleUnsettleBalance = saleUnsettleBalance;
		this.buyUnsettleAmount2 = buyUnsettleAmount2;
		this.saleUnsettleAmount2 = saleUnsettleAmount2;
		this.untransferedInvest = untransferedInvest;
		this.fairvalueChange = fairvalueChange;
		this.interestInvest = interestInvest;
		this.accumulateProfit = accumulateProfit;
		this.turnInvest = turnInvest;
		this.turnInterestInvest = turnInterestInvest;
		this.turnProfit = turnProfit;
		this.seatNo = seatNo;
		this.stockholderId = stockholderId;
		this.positionFlag = positionFlag;
		this.todayProfit = todayProfit;
		this.currentCost = currentCost;
		this.preImpawnAmount = preImpawnAmount;
		this.impawnAmount = impawnAmount;
		this.preReturnAmount = preReturnAmount;
		this.returnAmount = returnAmount;
		this.currentImpawnAmount = currentImpawnAmount;
	}

	public TbunitstockId getId() {
		return this.id;
	}

	public void setId(TbunitstockId id) {
		this.id = id;
	}

	public BigDecimal getTransDate() {
		return this.transDate;
	}

	public void setTransDate(BigDecimal transDate) {
		this.transDate = transDate;
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

	public String getMarketNo() {
		return this.marketNo;
	}

	public void setMarketNo(String marketNo) {
		this.marketNo = marketNo;
	}

	public BigDecimal getBeginAmount() {
		return this.beginAmount;
	}

	public void setBeginAmount(BigDecimal beginAmount) {
		this.beginAmount = beginAmount;
	}

	public BigDecimal getCurrentAmount() {
		return this.currentAmount;
	}

	public void setCurrentAmount(BigDecimal currentAmount) {
		this.currentAmount = currentAmount;
	}

	public BigDecimal getCurrentRepoAmount() {
		return this.currentRepoAmount;
	}

	public void setCurrentRepoAmount(BigDecimal currentRepoAmount) {
		this.currentRepoAmount = currentRepoAmount;
	}

	public BigDecimal getCurrentReporevAmount() {
		return this.currentReporevAmount;
	}

	public void setCurrentReporevAmount(BigDecimal currentReporevAmount) {
		this.currentReporevAmount = currentReporevAmount;
	}

	public BigDecimal getCurrentLoanrevAmount() {
		return this.currentLoanrevAmount;
	}

	public void setCurrentLoanrevAmount(BigDecimal currentLoanrevAmount) {
		this.currentLoanrevAmount = currentLoanrevAmount;
	}

	public BigDecimal getCurrentLoanAmount() {
		return this.currentLoanAmount;
	}

	public void setCurrentLoanAmount(BigDecimal currentLoanAmount) {
		this.currentLoanAmount = currentLoanAmount;
	}

	public BigDecimal getFrozenAmount() {
		return this.frozenAmount;
	}

	public void setFrozenAmount(BigDecimal frozenAmount) {
		this.frozenAmount = frozenAmount;
	}

	public BigDecimal getUnfrozenAmount() {
		return this.unfrozenAmount;
	}

	public void setUnfrozenAmount(BigDecimal unfrozenAmount) {
		this.unfrozenAmount = unfrozenAmount;
	}

	public BigDecimal getMortrevFrozenAmount() {
		return this.mortrevFrozenAmount;
	}

	public void setMortrevFrozenAmount(BigDecimal mortrevFrozenAmount) {
		this.mortrevFrozenAmount = mortrevFrozenAmount;
	}

	public BigDecimal getMortFrozenAmount() {
		return this.mortFrozenAmount;
	}

	public void setMortFrozenAmount(BigDecimal mortFrozenAmount) {
		this.mortFrozenAmount = mortFrozenAmount;
	}

	public BigDecimal getForceFrozenAmount() {
		return this.forceFrozenAmount;
	}

	public void setForceFrozenAmount(BigDecimal forceFrozenAmount) {
		this.forceFrozenAmount = forceFrozenAmount;
	}

	public BigDecimal getSysFrozenAmount() {
		return this.sysFrozenAmount;
	}

	public void setSysFrozenAmount(BigDecimal sysFrozenAmount) {
		this.sysFrozenAmount = sysFrozenAmount;
	}

	public BigDecimal getBuyAmount() {
		return this.buyAmount;
	}

	public void setBuyAmount(BigDecimal buyAmount) {
		this.buyAmount = buyAmount;
	}

	public BigDecimal getSaleAmount() {
		return this.saleAmount;
	}

	public void setSaleAmount(BigDecimal saleAmount) {
		this.saleAmount = saleAmount;
	}

	public BigDecimal getPreBuyAmount() {
		return this.preBuyAmount;
	}

	public void setPreBuyAmount(BigDecimal preBuyAmount) {
		this.preBuyAmount = preBuyAmount;
	}

	public BigDecimal getPreSaleAmount() {
		return this.preSaleAmount;
	}

	public void setPreSaleAmount(BigDecimal preSaleAmount) {
		this.preSaleAmount = preSaleAmount;
	}

	public BigDecimal getTempFrozenAmount() {
		return this.tempFrozenAmount;
	}

	public void setTempFrozenAmount(BigDecimal tempFrozenAmount) {
		this.tempFrozenAmount = tempFrozenAmount;
	}

	public BigDecimal getTempFrozenAmount2() {
		return this.tempFrozenAmount2;
	}

	public void setTempFrozenAmount2(BigDecimal tempFrozenAmount2) {
		this.tempFrozenAmount2 = tempFrozenAmount2;
	}

	public BigDecimal getTempUnfrozenAmount() {
		return this.tempUnfrozenAmount;
	}

	public void setTempUnfrozenAmount(BigDecimal tempUnfrozenAmount) {
		this.tempUnfrozenAmount = tempUnfrozenAmount;
	}

	public BigDecimal getT1TempFrozenAmount() {
		return this.t1TempFrozenAmount;
	}

	public void setT1TempFrozenAmount(BigDecimal t1TempFrozenAmount) {
		this.t1TempFrozenAmount = t1TempFrozenAmount;
	}

	public BigDecimal getT1FrozenAmount() {
		return this.t1FrozenAmount;
	}

	public void setT1FrozenAmount(BigDecimal t1FrozenAmount) {
		this.t1FrozenAmount = t1FrozenAmount;
	}

	public BigDecimal getBuyBalance() {
		return this.buyBalance;
	}

	public void setBuyBalance(BigDecimal buyBalance) {
		this.buyBalance = buyBalance;
	}

	public BigDecimal getSaleBalance() {
		return this.saleBalance;
	}

	public void setSaleBalance(BigDecimal saleBalance) {
		this.saleBalance = saleBalance;
	}

	public BigDecimal getBuyFee() {
		return this.buyFee;
	}

	public void setBuyFee(BigDecimal buyFee) {
		this.buyFee = buyFee;
	}

	public BigDecimal getSaleFee() {
		return this.saleFee;
	}

	public void setSaleFee(BigDecimal saleFee) {
		this.saleFee = saleFee;
	}

	public BigDecimal getBuyUnsettleAmount() {
		return this.buyUnsettleAmount;
	}

	public void setBuyUnsettleAmount(BigDecimal buyUnsettleAmount) {
		this.buyUnsettleAmount = buyUnsettleAmount;
	}

	public BigDecimal getSaleUnsettleAmount() {
		return this.saleUnsettleAmount;
	}

	public void setSaleUnsettleAmount(BigDecimal saleUnsettleAmount) {
		this.saleUnsettleAmount = saleUnsettleAmount;
	}

	public BigDecimal getBuyUnsettleBalance() {
		return this.buyUnsettleBalance;
	}

	public void setBuyUnsettleBalance(BigDecimal buyUnsettleBalance) {
		this.buyUnsettleBalance = buyUnsettleBalance;
	}

	public BigDecimal getSaleUnsettleBalance() {
		return this.saleUnsettleBalance;
	}

	public void setSaleUnsettleBalance(BigDecimal saleUnsettleBalance) {
		this.saleUnsettleBalance = saleUnsettleBalance;
	}

	public BigDecimal getBuyUnsettleAmount2() {
		return this.buyUnsettleAmount2;
	}

	public void setBuyUnsettleAmount2(BigDecimal buyUnsettleAmount2) {
		this.buyUnsettleAmount2 = buyUnsettleAmount2;
	}

	public BigDecimal getSaleUnsettleAmount2() {
		return this.saleUnsettleAmount2;
	}

	public void setSaleUnsettleAmount2(BigDecimal saleUnsettleAmount2) {
		this.saleUnsettleAmount2 = saleUnsettleAmount2;
	}

	public BigDecimal getUntransferedInvest() {
		return this.untransferedInvest;
	}

	public void setUntransferedInvest(BigDecimal untransferedInvest) {
		this.untransferedInvest = untransferedInvest;
	}

	public BigDecimal getFairvalueChange() {
		return this.fairvalueChange;
	}

	public void setFairvalueChange(BigDecimal fairvalueChange) {
		this.fairvalueChange = fairvalueChange;
	}

	public BigDecimal getInterestInvest() {
		return this.interestInvest;
	}

	public void setInterestInvest(BigDecimal interestInvest) {
		this.interestInvest = interestInvest;
	}

	public BigDecimal getAccumulateProfit() {
		return this.accumulateProfit;
	}

	public void setAccumulateProfit(BigDecimal accumulateProfit) {
		this.accumulateProfit = accumulateProfit;
	}

	public BigDecimal getTurnInvest() {
		return this.turnInvest;
	}

	public void setTurnInvest(BigDecimal turnInvest) {
		this.turnInvest = turnInvest;
	}

	public BigDecimal getTurnInterestInvest() {
		return this.turnInterestInvest;
	}

	public void setTurnInterestInvest(BigDecimal turnInterestInvest) {
		this.turnInterestInvest = turnInterestInvest;
	}

	public BigDecimal getTurnProfit() {
		return this.turnProfit;
	}

	public void setTurnProfit(BigDecimal turnProfit) {
		this.turnProfit = turnProfit;
	}

	public String getSeatNo() {
		return this.seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getStockholderId() {
		return this.stockholderId;
	}

	public void setStockholderId(String stockholderId) {
		this.stockholderId = stockholderId;
	}

	public String getPositionFlag() {
		return this.positionFlag;
	}

	public void setPositionFlag(String positionFlag) {
		this.positionFlag = positionFlag;
	}

	public BigDecimal getTodayProfit() {
		return this.todayProfit;
	}

	public void setTodayProfit(BigDecimal todayProfit) {
		this.todayProfit = todayProfit;
	}

	public BigDecimal getCurrentCost() {
		return this.currentCost;
	}

	public void setCurrentCost(BigDecimal currentCost) {
		this.currentCost = currentCost;
	}

	public BigDecimal getPreImpawnAmount() {
		return this.preImpawnAmount;
	}

	public void setPreImpawnAmount(BigDecimal preImpawnAmount) {
		this.preImpawnAmount = preImpawnAmount;
	}

	public BigDecimal getImpawnAmount() {
		return this.impawnAmount;
	}

	public void setImpawnAmount(BigDecimal impawnAmount) {
		this.impawnAmount = impawnAmount;
	}

	public BigDecimal getPreReturnAmount() {
		return this.preReturnAmount;
	}

	public void setPreReturnAmount(BigDecimal preReturnAmount) {
		this.preReturnAmount = preReturnAmount;
	}

	public BigDecimal getReturnAmount() {
		return this.returnAmount;
	}

	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}

	public BigDecimal getCurrentImpawnAmount() {
		return this.currentImpawnAmount;
	}

	public void setCurrentImpawnAmount(BigDecimal currentImpawnAmount) {
		this.currentImpawnAmount = currentImpawnAmount;
	}

}
