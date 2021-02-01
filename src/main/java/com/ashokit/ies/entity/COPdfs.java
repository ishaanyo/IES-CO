package com.ashokit.ies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CO_PDFS")
public class COPdfs {
	@Id
	@Column(name="CO_PDF_ID")
	private Integer coPdfId;
	@Column(name="PLAN_STATUS")
	private String planStatus;
	@Column(name="CASE_NUMBER")
	private Integer caseNumber;
	@Column(name="PDF_DOCUMENT")
	private Byte[] pdfDocument;
	@Column(name="PLAN_NAME")
	private String planName;
}
