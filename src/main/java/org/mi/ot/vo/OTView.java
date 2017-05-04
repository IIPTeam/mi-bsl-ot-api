package org.mi.ot.vo;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OTView {
	private String staffID;

	// EHR is the mandatory unique attribute for our staff, hence turn off the
	// update feature
	private String EHR;

	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	@NotNull
	private Date startTime;
	
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	@NotNull
	private Date endTime;
	
	@NotNull
	@Length(min = 1, max = 200)
	private String reason;

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getEHR() {
		return EHR;
	}

	public void setEHR(String eHR) {
		EHR = eHR;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
