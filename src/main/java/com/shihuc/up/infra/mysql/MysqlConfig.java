package com.shihuc.up.infra.mysql;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource(locations = {"classpath:config/spring-dao.xml"})
public class MysqlConfig {
}