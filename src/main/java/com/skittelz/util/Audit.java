package com.skittelz.util;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Audit {

	@Column(name = "CREATEDBY")
	Long createdBy;

	//@DateTimeFormat(pattern="MM/dd/yyyy")
    //@NotNull @Past   
	@Column(name = "CREATEDON")
	@Temporal(TemporalType.TIMESTAMP)
	Date createdOn;

	@Column(name = "LASTUPDATEDBY")
	Long lastUpdatedBy;

	@Column(name = "LASTUPDATEDON")
	@Temporal(TemporalType.TIMESTAMP)
	Date lastUpdatedOn;
	
	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

}
