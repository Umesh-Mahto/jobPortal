package com.geekster.jobSearchPortal.repository;

import com.geekster.jobSearchPortal.model.EnumDepartment;
import com.geekster.jobSearchPortal.model.JobModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.time.LocalDate;

@Repository
public interface JobRepo extends CrudRepository<JobModel,Long> {
    @Modifying
    @Query(value = "update JOB_MODEL set ID = :id,JOB_TYPE=:stringJob where ID=:id",nativeQuery = true)
    void updateDetails(Integer id, String stringJob);





// @Modifying
// @Query(value = "update JOB_MODEL set ID = :id ,TITLE = :title,DESCRIPTION = : description,LOCATION = :location, SALARY = :salary,COMPANY_EMAIL = : companyEmail,EMPLOYER_NAME = : employerName,JOB_TYPE = : jobType,APPLIED_DATE = : appliedDate where ID=:id",nativeQuery = true)
//
//    void updateJobDetails(Long id, String title, String description, String location, Double salary, String companyEmail, String companyName, String employerName, EnumDepartment jobType, LocalDate appliedDate);


}
