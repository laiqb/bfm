package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TsysRoleRight generated by hbm2java
 */
public class TsysRoleRight implements java.io.Serializable {

	private TsysRoleRightId id;
	private String createBy;
	private BigDecimal createDate;

	public TsysRoleRight() {
	}

	public TsysRoleRight(TsysRoleRightId id) {
		this.id = id;
	}

	public TsysRoleRight(TsysRoleRightId id, String createBy,
			BigDecimal createDate) {
		this.id = id;
		this.createBy = createBy;
		this.createDate = createDate;
	}

	public TsysRoleRightId getId() {
		return this.id;
	}

	public void setId(TsysRoleRightId id) {
		this.id = id;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public BigDecimal getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(BigDecimal createDate) {
		this.createDate = createDate;
	}

}
