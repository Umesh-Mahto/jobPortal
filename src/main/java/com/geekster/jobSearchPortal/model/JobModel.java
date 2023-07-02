package com.geekster.jobSearchPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class JobModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;
    private String companyEmail;

    private String companyName;
    private String employerName;

    @Enumerated(EnumType.STRING)
    private EnumDepartment JobType;

    private LocalDate appliedDate;
}
