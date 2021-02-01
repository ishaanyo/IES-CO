package com.ashokit.ies.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.entity.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Serializable>{

}
