package com.sedin.dc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

import com.sedin.dc.common.BeforeInitRunner;

@SpringBootApplication
@EnableCaching
public class Application extends SpringBootServletInitializer{

    public static void main(String[] args) {
    	
    	SpringApplication app = new SpringApplication(Application.class);
    	
    	app.addInitializers(new BeforeInitRunner());
    	
    	app.run(args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        
    	return application.sources(Application.class);
    }
}
