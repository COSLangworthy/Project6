package com.careersforyou.jobservice.domain;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface JobRepository extends CrudRepository <Job, Long> {

    //Iterable<Job> findAll();
    Optional<Job> findByJobid(int jobid);
    boolean existsByJobid(int jobid);
    //Job save(Job job);
    @Modifying
    @Query("delete from Job where jobid = jobid")
    void deleteByJobid(int jobid);

}
