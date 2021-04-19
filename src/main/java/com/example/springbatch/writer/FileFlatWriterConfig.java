package com.example.springbatch.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springbatch.model.Cliente;



@Configuration
public class FileFlatWriterConfig {
	@Bean
	public ItemWriter<Cliente> clientWriter() {
		return items -> items.forEach(System.out::println);
	}
}
