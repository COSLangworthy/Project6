package com.careersforyou.jobservice.domain;

public class JobNotFoundException extends RuntimeException {

    public JobNotFoundException(int jobid) {

        super("The job with Jobid " + jobid + " was not found.");
    }
}
