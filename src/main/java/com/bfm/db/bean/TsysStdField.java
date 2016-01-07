package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysStdField generated by hbm2java
 */
public class TsysStdField implements java.io.Serializable {

	private TsysStdFieldId id;
	private String bizTypeCode;
	private String defValueCode;
	private String fieldName;
	private String dispCtrl;
	private String ctrlAttr;
	private String ctrlEvent;
	private String nullFlag;
	private String dispFlag;
	private String readFlag;
	private String remark;

	public TsysStdField() {
	}

	public TsysStdField(TsysStdFieldId id, String fieldName, String dispCtrl) {
		this.id = id;
		this.fieldName = fieldName;
		this.dispCtrl = dispCtrl;
	}

	public TsysStdField(TsysStdFieldId id, String bizTypeCode,
			String defValueCode, String fieldName, String dispCtrl,
			String ctrlAttr, String ctrlEvent, String nullFlag,
			String dispFlag, String readFlag, String remark) {
		this.id = id;
		this.bizTypeCode = bizTypeCode;
		this.defValueCode = defValueCode;
		this.fieldName = fieldName;
		this.dispCtrl = dispCtrl;
		this.ctrlAttr = ctrlAttr;
		this.ctrlEvent = ctrlEvent;
		this.nullFlag = nullFlag;
		this.dispFlag = dispFlag;
		this.readFlag = readFlag;
		this.remark = remark;
	}

	public TsysStdFieldId getId() {
		return this.id;
	}

	public void setId(TsysStdFieldId id) {
		this.id = id;
	}

	public String getBizTypeCode() {
		return this.bizTypeCode;
	}

	public void setBizTypeCode(String bizTypeCode) {
		this.bizTypeCode = bizTypeCode;
	}

	public String getDefValueCode() {
		return this.defValueCode;
	}

	public void setDefValueCode(String defValueCode) {
		this.defValueCode = defValueCode;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDispCtrl() {
		return this.dispCtrl;
	}

	public void setDispCtrl(String dispCtrl) {
		this.dispCtrl = dispCtrl;
	}

	public String getCtrlAttr() {
		return this.ctrlAttr;
	}

	public void setCtrlAttr(String ctrlAttr) {
		this.ctrlAttr = ctrlAttr;
	}

	public String getCtrlEvent() {
		return this.ctrlEvent;
	}

	public void setCtrlEvent(String ctrlEvent) {
		this.ctrlEvent = ctrlEvent;
	}

	public String getNullFlag() {
		return this.nullFlag;
	}

	public void setNullFlag(String nullFlag) {
		this.nullFlag = nullFlag;
	}

	public String getDispFlag() {
		return this.dispFlag;
	}

	public void setDispFlag(String dispFlag) {
		this.dispFlag = dispFlag;
	}

	public String getReadFlag() {
		return this.readFlag;
	}

	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}