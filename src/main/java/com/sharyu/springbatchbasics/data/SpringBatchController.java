package com.sharyu.springbatchbasics.data;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBatchController {

	 @Autowired
	    JobLauncher jobLauncher;

	    @Autowired
	    Job job;

	    @RequestMapping("/jobLauncher")
	    public void handle() throws Exception{
	        jobLauncher.run(job, new JobParameters());
	        System.out.println("BATCH");
	    }
}
