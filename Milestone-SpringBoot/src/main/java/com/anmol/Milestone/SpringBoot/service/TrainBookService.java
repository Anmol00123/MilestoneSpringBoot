package com.anmol.Milestone.SpringBoot.service;

import com.anmol.Milestone.SpringBoot.model.TrainBook;

import java.util.List;

public interface TrainBookService {

    String bookticket(TrainBook book);

    List<TrainBook> showMyticket();

    String cancelTicket(Integer id);

}
