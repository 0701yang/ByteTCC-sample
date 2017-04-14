package com.bytesvc.consumer.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.client.RestTemplate;

/**
 * ע�⣺<br />
 * ֧��springcloud��0.4.0�汾Ŀǰ���ڿ���֮��, ��springcloud��صĹ��ܿ��ܻ���ںܶ�����, �����ʹ��.
 */
@ImportResource({ "classpath:bytetcc-supports-springcloud.xml" })
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients("com.bytesvc.feign")
@SpringBootApplication(scanBasePackages = "com.bytesvc.consumer")
public class SampleConsumerMain {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(SampleConsumerMain.class).web(true).run(args);
	}

}
