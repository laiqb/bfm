package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TbvirtualcombirelationId generated by hbm2java
 */
public class TbvirtualcombirelationId implements java.io.Serializable {

	private String virtualCombiNo;
	private String childCombiNo;

	public TbvirtualcombirelationId() {
	}

	public TbvirtualcombirelationId(String virtualCombiNo, String childCombiNo) {
		this.virtualCombiNo = virtualCombiNo;
		this.childCombiNo = childCombiNo;
	}

	public String getVirtualCombiNo() {
		return this.virtualCombiNo;
	}

	public void setVirtualCombiNo(String virtualCombiNo) {
		this.virtualCombiNo = virtualCombiNo;
	}

	public String getChildCombiNo() {
		return this.childCombiNo;
	}

	public void setChildCombiNo(String childCombiNo) {
		this.childCombiNo = childCombiNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbvirtualcombirelationId))
			return false;
		TbvirtualcombirelationId castOther = (TbvirtualcombirelationId) other;

		return ((this.getVirtualCombiNo() == castOther.getVirtualCombiNo()) || (this
				.getVirtualCombiNo() != null
				&& castOther.getVirtualCombiNo() != null && this
				.getVirtualCombiNo().equals(castOther.getVirtualCombiNo())))
				&& ((this.getChildCombiNo() == castOther.getChildCombiNo()) || (this
						.getChildCombiNo() != null
						&& castOther.getChildCombiNo() != null && this
						.getChildCombiNo().equals(castOther.getChildCombiNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getVirtualCombiNo() == null ? 0 : this.getVirtualCombiNo()
						.hashCode());
		result = 37
				* result
				+ (getChildCombiNo() == null ? 0 : this.getChildCombiNo()
						.hashCode());
		return result;
	}

}
