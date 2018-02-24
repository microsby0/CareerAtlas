package com.dorby.job.controllers;

import com.dorby.job.models.Job;
import com.dorby.job.models.JobSource;
import com.dorby.user.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("job")
public class JobController {


    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Set<User> index(){
        Set<Job> jobs = new HashSet<>(2);
        jobs.add(new Job("23", JobSource.INDEED, "ATT", "SDET", ZonedDateTime.now(), ZonedDateTime.now()));
        User user = new User("Robby", "rdore", 23, jobs);
        return Collections.singleton(user);
    }


    

}
