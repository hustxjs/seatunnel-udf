package com.dscomm;


import com.alibaba.druid.pool.DruidDataSource;
import com.dscomm.entity.Receiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.concurrent.CountDownLatch;


@SpringBootApplication
public class SpringbootJdbcApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringbootJdbcApplication.class);

//	@Bean
//	MessageListenerAdapter listenerAdapter(Receiver receiver) {
//		return new MessageListenerAdapter(receiver, "receiveMessage");
//	}

	@Bean
	Receiver receiver(CountDownLatch latch) {
		return new Receiver(latch);
	}

	@Bean
	CountDownLatch latch() {
		return new CountDownLatch(1);
	}

	/*@Bean
	StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
		return new StringRedisTemplate(connectionFactory);
	}*/
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootJdbcApplication.class, args);
		
	}
	
	@Autowired
	private Environment environment;
	
	@Bean(destroyMethod="close")
	public DataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(environment.getProperty("spring.datasource.hzk.driver-class-name"));
		dataSource.setUrl(environment.getProperty("spring.datasource.hzk.url"));
		dataSource.setUsername(environment.getProperty("spring.datasource.hzk.username"));
		dataSource.setPassword(environment.getProperty("spring.datasource.hzk.password"));
		
		/*dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUsername("ds_zygl");
		dataSource.setPassword("ds_zygl");
		dataSource.setUrl("jdbc:oracle:thin:@10.166.113.116:7110:dsdb");*/
		dataSource.setInitialSize(2);
		dataSource.setMaxActive(20);
		dataSource.setMinIdle(0);
		dataSource.setMaxWait(60000);
		//dataSource.setValidationQuery("SELECT * from account");
		//dataSource.setTestWhileIdle(true);
		dataSource.setTestWhileIdle(true);
		dataSource.setTestOnBorrow(false);
		dataSource.setPoolPreparedStatements(false);
		
		return dataSource;
	}
}