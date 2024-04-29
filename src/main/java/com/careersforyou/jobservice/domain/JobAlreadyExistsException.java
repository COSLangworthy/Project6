package com.careersforyou.jobservice.domain;

public class JobAlreadyExistsException extends RuntimeException {

    public JobAlreadyExistsException(int jobid) {

        super("A job with Jobid " + jobid + " already exists.");
    }
}
