package com.bytesvc.provider.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

/**
 * ע�⣺<br />
 * ֧��springcloud��0.4.0�汾Ŀǰ���ڿ���֮��, ��springcloud��صĹ��ܿ��ܻ���ںܶ�����, �����ʹ��.
 */
@ImportResource({ "classpath:bytetcc-supports-springcloud.xml" })
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.bytesvc.provider")
public class SampleProviderMain {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SampleProviderMain.class).web(true).run(args);
	}

}
