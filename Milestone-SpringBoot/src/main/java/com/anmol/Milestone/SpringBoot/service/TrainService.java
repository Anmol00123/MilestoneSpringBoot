package com.anmol.Milestone.SpringBoot.service;

import com.anmol.Milestone.SpringBoot.model.TrainDetails;

import java.util.List;
import java.util.Optional;

public interface TrainService {

    String saveTrains(List<TrainDetails> details);

    List<TrainDetails> getTrains();

    Optional<TrainDetails> getTrain(Integer trainId);

    String updateTrain(TrainDetails detail);

    String deleteTrain(Integer id);


}
