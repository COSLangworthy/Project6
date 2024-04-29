package com.careersforyou.jobservice.demo;

import com.careersforyou.jobservice.domain.Job;
import com.careersforyou.jobservice.domain.JobRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Profile("testdata")
public class JobDataLoader {
    private final JobRepository jobRepository;
    public JobDataLoader (JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @EventListener (ApplicationReadyEvent.class)
    public void loadJobTestData(){
        jobRepository.deleteAll();
        var job1 = Job.of("title1", "description1", "companyname1", "skill1", "skill2");
        var job2 = Job.of("title2", "description2", "companyname2", "skill3", "skill4");
        jobRepository.saveAll(List.of(job1, job2));
    }
}
