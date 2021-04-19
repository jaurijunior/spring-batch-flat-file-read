package com.example.springbatch.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springbatch.model.Cliente;


@Configuration
public class FileFlatStepConfig {
	
	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	public Step readFileStep(ItemReader<Cliente> itemReader, ItemWriter<Cliente> itemWriter) {
		return stepBuilderFactory
				.get("readFileStep")
				.<Cliente, Cliente>chunk(1)
				.reader(itemReader)
				.writer(itemWriter)
				.build();
	}
}
