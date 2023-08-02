package com.dscomm.web;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class DataSourceConfig {

	/*================================================ hzk ================================================*/
	@Value("${spring.datasource.hzk.driver-class-name}")
	private String driverClass;

	@Value("${spring.datasource.hzk.url}")
	private String jdbcUrl;

	@Value("${spring.datasource.hzk.username}")
	private String user;

	@Value("${spring.datasource.hzk.password}")
	private String password;

	@Bean(name = "sqlserverDS")
	@Qualifier("sqlserverDS")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.hzk")
	public ComboPooledDataSource oracleDataSource()
			throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		dataSource.setInitialPoolSize(1);
		dataSource.setMinPoolSize(1);
		dataSource.setMaxPoolSize(1500);
		dataSource.setMaxIdleTime(60);
		dataSource.setCheckoutTimeout(30000);
		dataSource.setBreakAfterAcquireFailure(false);
		dataSource.setIdleConnectionTestPeriod(300);
		// 设置数据库连接失败的重练数为1000,重连间隔为5分钟
		dataSource.setAcquireRetryAttempts(1000);
		dataSource.setAcquireRetryDelay(1000 * 60 * 5);
		return dataSource;
	}

	@Bean("sqlserverTemplate")
	public JdbcTemplate oracleJdbcTemplate(
			@Qualifier("sqlserverDS") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}





	/*================================================ T ================================================*/

//	@Value("${spring.datasource.t.driver-class-name}")
//	private String driverClass2;
//
//	@Value("${spring.datasource.t.url}")
//	private String jdbcUrl2;
//
//	@Value("${spring.datasource.t.username}")
//	private String user2;
//
//	@Value("${spring.datasource.t.password}")
//	private String password2;
//
//	@Bean(name = "sqlserverDS2")
//	@Qualifier("sqlserverDS2")
//	@ConfigurationProperties(prefix = "spring.datasource.t")
//	public ComboPooledDataSource oracleDataSource2()
//			throws PropertyVetoException {
//		ComboPooledDataSource dataSource = new ComboPooledDataSource();
//		dataSource.setDriverClass(driverClass2);
//		dataSource.setJdbcUrl(jdbcUrl2);
//		dataSource.setUser(user2);
//		dataSource.setPassword(password2);
//		dataSource.setInitialPoolSize(1);
//		dataSource.setMinPoolSize(1);
//		dataSource.setMaxPoolSize(1500);
//		dataSource.setMaxIdleTime(60);
//		dataSource.setCheckoutTimeout(30000);
//		dataSource.setBreakAfterAcquireFailure(false);
//		dataSource.setIdleConnectionTestPeriod(300);
//		// 设置数据库连接失败的重练数为1000,重连间隔为5分钟
//		dataSource.setAcquireRetryAttempts(1000);
//		dataSource.setAcquireRetryDelay(1000 * 60 * 5);
//		return dataSource;
//	}
//
//	@Bean("sqlserverTemplate2")
//	public JdbcTemplate oracleJdbcTemplate2(
//			@Qualifier("sqlserverDS2") DataSource dataSource) {
//		return new JdbcTemplate(dataSource);
//	}
//
//







}
