package com.careersforyou.jobservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.Instant;

public record Job(

        //Check if JobID is null
        //@NotBlank(message = "Job ID cannot be empty")
        //Check if JodID format is correct
        @Id
        @Pattern(regexp = "\\d{10}", message = "The Job ID format must be valid.")
        int jobid,
        String title,
        String description,
        String companyname,
        String skill1,
        String skill2,
        @CreatedDate
        Instant createdDate,
        @LastModifiedDate
        Instant lastModifiedDate,
        @Version
        int version


){
        public static Job of(String title, String description, String companyname, String skill1, String skill2) {
                return new Job (0, title, description, companyname, skill1, skill2, null, null, 0);
        }


}
