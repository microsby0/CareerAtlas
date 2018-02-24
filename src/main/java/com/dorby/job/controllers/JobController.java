package com.dorby.job.controllers;

import com.dorby.job.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@RestController
@RequestMapping("job")
public class JobController {


    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Set<Job> index(){
        return Collections.singleton();
    }


    

}
