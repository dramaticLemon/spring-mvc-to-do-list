package com.join.tab.config.db;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("DEV")
public class JpaDevConfig extends BaseJpaConfig{
	
}

