package com.anmol.Milestone.SpringBoot.dao;

import com.anmol.Milestone.SpringBoot.model.TrainBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<TrainBook,Integer> {
}