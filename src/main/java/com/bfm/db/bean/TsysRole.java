package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysRole generated by hbm2java
 */
public class TsysRole implements java.io.Serializable {

	private String roleCode;
	private String roleName;
	private String creator;
	private String remark;

	public TsysRole() {
	}

	public TsysRole(String roleCode) {
		this.roleCode = roleCode;
	}

	public TsysRole(String roleCode, String roleName, String creator,
			String remark) {
		this.roleCode = roleCode;
		this.roleName = roleName;
		this.creator = creator;
		this.remark = remark;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
