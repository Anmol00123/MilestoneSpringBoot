package com.anmol.Milestone.SpringBoot.dao;

import com.anmol.Milestone.SpringBoot.model.TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<TrainDetails,Integer> {
}