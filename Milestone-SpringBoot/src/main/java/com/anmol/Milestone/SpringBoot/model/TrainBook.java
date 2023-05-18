package com.anmol.Milestone.SpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking_Details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrainBook {
    @Id
    private int uid;
    private String usource;
    private String destination;
    private String uclass;
}