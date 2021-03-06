package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysTrans generated by hbm2java
 */
public class TsysTrans implements java.io.Serializable {

	private String transCode;
	private String transName;
	private String kindCode;
	private String modelCode;
	private String remark;
	private String extField1;
	private String extField2;
	private String extField3;

	public TsysTrans() {
	}

	public TsysTrans(String transCode, String transName) {
		this.transCode = transCode;
		this.transName = transName;
	}

	public TsysTrans(String transCode, String transName, String kindCode,
			String modelCode, String remark, String extField1,
			String extField2, String extField3) {
		this.transCode = transCode;
		this.transName = transName;
		this.kindCode = kindCode;
		this.modelCode = modelCode;
		this.remark = remark;
		this.extField1 = extField1;
		this.extField2 = extField2;
		this.extField3 = extField3;
	}

	public String getTransCode() {
		return this.transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getTransName() {
		return this.transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getExtField1() {
		return this.extField1;
	}

	public void setExtField1(String extField1) {
		this.extField1 = extField1;
	}

	public String getExtField2() {
		return this.extField2;
	}

	public void setExtField2(String extField2) {
		this.extField2 = extField2;
	}

	public String getExtField3() {
		return this.extField3;
	}

	public void setExtField3(String extField3) {
		this.extField3 = extField3;
	}

}
