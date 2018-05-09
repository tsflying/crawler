package com.mff.weibo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrawlerApplication {
	private static Logger logger = Logger.getLogger(CrawlerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CrawlerApplication.class, args);
		logger.info("=============>crawler web started!!!");
	}
}
