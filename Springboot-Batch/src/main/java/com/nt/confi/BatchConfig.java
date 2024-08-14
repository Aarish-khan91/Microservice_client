package com.nt.confi;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.nt.listener.JobMonitoringListener;
import com.nt.processor.BookInfoItemProcessor;
import com.nt.reader.BookInfoReader;
import com.nt.writer.BookInfoItemWriter;

@Configuration
public class BatchConfig {

	@Autowired
	private BookInfoReader bookInfoReader;
	@Autowired
	private BookInfoItemWriter bookInfoItemWriter;
	@Autowired
	private BookInfoItemProcessor bookInfoItemProcessor;
	@Autowired
	private JobMonitoringListener jobMonitoringListener;

	@Bean("step1")
	public Step createStep1(JobRepository repository, PlatformTransactionManager platformTransactionManager) {
		System.out.println("BatchConfig.createStep1()");
		return new StepBuilder("step1", repository).<String, String>chunk(2, platformTransactionManager)
				.reader(bookInfoReader).processor(bookInfoItemProcessor).writer(bookInfoItemWriter).build();

	}

	@Bean("job1")
	public Job createJob1(JobRepository repository, Step step1) {
		System.out.println("BatchConfig.createStep1()");
		return new JobBuilder("job1", repository).listener(jobMonitoringListener).incrementer(new RunIdIncrementer())
				.start(step1).build();

	}

}
