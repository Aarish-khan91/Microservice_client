package com.nt.runner;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("jlRunner")
public class JobLaunchRunner implements CommandLineRunner {
	@Autowired
	private JobLauncher jobLaunchRunner;

	@Autowired
	private Job job;

	@Override
	public void run(String... args) throws Exception {
		// create the param
		JobParameters param = new JobParametersBuilder().addLong("sysdate", System.currentTimeMillis())
				.toJobParameters();

		// run the job
		JobExecution jobExecution = jobLaunchRunner.run(job, param);

	}

}
