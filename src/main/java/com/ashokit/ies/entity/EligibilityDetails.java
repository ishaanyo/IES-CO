package com.ashokit.ies.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ED_ELIGIBILITY_DETAILS")
@Data
public class EligibilityDetails {
	
	@Id
	@Column(name="ed_trace_id")
	private Integer edTraceId;
	@Column(name="benefit_amt")
	private Double benefitAmt;
	@Column(name="case_num")
	private Integer caseNum;
	@Column(name="create_dt")
	private Date createDate;
	@Column(name="denial_reason")
	private String denialReason;
	@Column(name="plan_end_dt")
	private String planEndDate;
	@Column(name="plan_name")
	private String planName;
	@Column(name="plan_start_dt")
	private String planStartDate;
	@Column(name="plan_status")
	private String planStatus;
	@Column(name="update_dt")
	private Date updateDate;
}
