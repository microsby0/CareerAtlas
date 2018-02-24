package com.dorby.user.models;

import com.dorby.job.models.Job;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class User {
    @JsonProperty
    private String name;
    @JsonProperty
    private String email;
    @JsonProperty
    private int id;
    @JsonProperty
    private Set<Job> jobs;

    public User(String name, String email, int id, Set<Job> jobs) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.jobs = jobs;
    }
}
