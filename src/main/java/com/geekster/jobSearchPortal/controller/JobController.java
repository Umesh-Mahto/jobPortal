package com.geekster.jobSearchPortal.controller;

import com.geekster.jobSearchPortal.model.EnumDepartment;
import com.geekster.jobSearchPortal.model.JobModel;
import com.geekster.jobSearchPortal.services.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("/addJob")
    public String postJob(@Valid @RequestBody ArrayList<JobModel> list) {
        return jobService.postJob(list);
    }

    @GetMapping("/getJob")

    public Iterable<JobModel> getAllJobList() {
        return jobService.getAllJobList();
    }

    @GetMapping("/{id}")
    public Optional<JobModel> getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }
// @PutMapping("/updateJob")
//    public void updateJob(@RequestBody JobModel jobList){
//     jobService.updateJob(jobList);
// }

    @PutMapping("update/{id}/{job}")
    public void updateJobDetail(@PathVariable Integer id, @PathVariable EnumDepartment job) {
        jobService.updateDetails(id, job);
    }
    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id){
        jobService.deleteJobId(id);
    }
}
