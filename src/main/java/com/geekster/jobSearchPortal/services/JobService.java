package com.geekster.jobSearchPortal.services;

import com.geekster.jobSearchPortal.model.EnumDepartment;
import com.geekster.jobSearchPortal.model.JobModel;
import com.geekster.jobSearchPortal.repository.JobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public String postJob(ArrayList<JobModel> list) {
       Iterable<JobModel>status= jobRepo.saveAll(list);
        if(status!=null){
            return "job posted";
        }
        else{
            return "job not posted";
        }
    }

    public Iterable<JobModel> getAllJobList() {
        return jobRepo.findAll();
    }

    public Optional<JobModel> getJobById(Long id) {
      return  jobRepo.findById(id);
    }

    @Transactional
    public void updateDetails(Integer id, EnumDepartment job) {
    String  stringJob=job.name();
        jobRepo.updateDetails(id,stringJob);
    }

    public void deleteJobId(Long id) {

        jobRepo.deleteById(id);
    }

//    @Transactional
//    public void updateJob(JobModel jobList) {
//        jobRepo.updateJobDetails(jobList.getId(),jobList.getTitle(),jobList.getDescription(),jobList.getLocation(),jobList.getSalary(),jobList.getCompanyEmail(),jobList.getCompanyName(),jobList.getEmployerName(),jobList.getJobType(),jobList.getAppliedDate());
//    }
}
