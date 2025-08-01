package com.vasyerp.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasyerp.transaction.model.IngestionJob;

import java.util.UUID;

public interface IngestionJobRepository extends JpaRepository<IngestionJob, UUID> {}
