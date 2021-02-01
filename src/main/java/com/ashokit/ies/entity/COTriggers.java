package com.ashokit.ies.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CO_TRIGGERS")
@Data
public class COTriggers {
	
	@Id
	@Column(name="trg_id")
	private Integer triggerId;
	@Column(name="case_num")
	private Integer caseNum;
	@Column(name="create_dt")
	private Date createDate;
	@Column(name="trg_status")
	private String triggerStatus;
	@Column(name="update_dt")
	private Date updateDate;
}
