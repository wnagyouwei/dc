package com.sedin.dc.common;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dzy.support.platform.common.util.ConfigCenter;

@Component
public class AfterInitRunner implements CommandLineRunner{

	@Autowired  
    private ConfigResouce configResouce;   
	
	
	@Override
	public void run(String... args) throws Exception {
		
		for (Map<String, String> config : configResouce.getMapping()) {
			
			ConfigCenter.addResourceConfig(config.get("class"), config.get("resource"));
		}
	}
}
