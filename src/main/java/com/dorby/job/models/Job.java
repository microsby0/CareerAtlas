package com.dorby.job.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Job {

    @JsonProperty
    private String name;
    @JsonProperty
    private String id;

    private String password;

    public Job(String name, String id, String password)
    {
        this.name = name;
        this.id = id;
        this.password = password;
    }
}
