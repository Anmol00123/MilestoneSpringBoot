package com.anmol.Milestone.SpringBoot.controller;

import com.anmol.Milestone.SpringBoot.model.TrainDetails;
import com.anmol.Milestone.SpringBoot.service.TrainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/auth")
public class AdminController {

    @Autowired
    private TrainServiceImpl trainService;

    @PostMapping("/trains")
    public String saveTrain(@RequestBody() List<TrainDetails> details){
        return trainService.saveTrains(details);
    }

    @GetMapping("/trains")
    public List<TrainDetails> getTrains(){
        return trainService.getTrains();
    }

    @GetMapping("/train")
    public Optional<TrainDetails> getTrain(@RequestParam("trainId") Integer trainId){
        return trainService.getTrain(trainId);
    }

    @PutMapping("/trains")
    public String updateTrain(@RequestBody TrainDetails details){
        return trainService.updateTrain(details);
    }

    @DeleteMapping("/trains")
    public String deleteTrain(@RequestParam("id")Integer id){
        return trainService.deleteTrain(id);
    }
}
