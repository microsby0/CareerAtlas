package com.dorby.job.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

@JsonAutoDetect
public class Job {

    @JsonProperty
    private String id;
    @JsonProperty
    private JobSource source;
    @JsonProperty
    private String company;
    @JsonProperty
    private String positionTitle;
    @JsonProperty
    private ZonedDateTime createdAt;
    @JsonProperty
    private ZonedDateTime updateAt;

    public Job(String id,
               JobSource source,
               String company,
               String positionTitle,
               ZonedDateTime createdAt,
               ZonedDateTime updateAt)
    {
        this.id = id;
        this.source = source;
        this.company = company;
        this.positionTitle = positionTitle;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }
}
