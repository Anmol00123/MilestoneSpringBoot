package com.anmol.Milestone.SpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Train_Details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrainDetails {
    @Id
    private int tnumber;
    private String tname;

    private String tsource;
    private String tdestination;
}