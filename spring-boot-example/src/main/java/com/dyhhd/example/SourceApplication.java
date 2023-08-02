package com.dyhhd.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 源码
 *
 * @author nning_l@163.com
 * @since 2023-08-02
 */
@Slf4j
@SpringBootApplication
public class SourceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SourceApplication.class, args);
		log.debug("start success");
	}
}
