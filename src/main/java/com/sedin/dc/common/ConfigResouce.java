package com.sedin.dc.common;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** * 将配置文件中配置的每一个属性的值，映射到这个组件中 * 
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定； *      
 * prefix = "config-resouces"：配置文件中哪个下面的所有属性进行一一映射 * * 
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能； 
 * * */


@Component
@ConfigurationProperties(prefix = "config-resouces")
public class ConfigResouce {
	
	List<Map<String,String>> mapping;

	public List<Map<String, String>> getMapping() {
		return mapping;
	}

	public void setMapping(List<Map<String, String>> mapping) {
		this.mapping = mapping;
	}
}
