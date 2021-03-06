package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysParameterId generated by hbm2java
 */
public class TsysParameterId implements java.io.Serializable {

	private String paramCode;
	private String relOrg;

	public TsysParameterId() {
	}

	public TsysParameterId(String paramCode, String relOrg) {
		this.paramCode = paramCode;
		this.relOrg = relOrg;
	}

	public String getParamCode() {
		return this.paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	public String getRelOrg() {
		return this.relOrg;
	}

	public void setRelOrg(String relOrg) {
		this.relOrg = relOrg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TsysParameterId))
			return false;
		TsysParameterId castOther = (TsysParameterId) other;

		return ((this.getParamCode() == castOther.getParamCode()) || (this
				.getParamCode() != null && castOther.getParamCode() != null && this
				.getParamCode().equals(castOther.getParamCode())))
				&& ((this.getRelOrg() == castOther.getRelOrg()) || (this
						.getRelOrg() != null && castOther.getRelOrg() != null && this
						.getRelOrg().equals(castOther.getRelOrg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getParamCode() == null ? 0 : this.getParamCode().hashCode());
		result = 37 * result
				+ (getRelOrg() == null ? 0 : this.getRelOrg().hashCode());
		return result;
	}

}
