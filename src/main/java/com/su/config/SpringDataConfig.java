/**
 * 
 */
package com.su.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@EnableJpaRepositories("com.su.repositories")
public class SpringDataConfig {

}