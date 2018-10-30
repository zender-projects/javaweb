package com.zd.learn.springboot;

import com.zd.learn.springboot.config.ApplicationConfig;
import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Import({ApplicationConfig.class})
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	/**
	 * Server容器代码配置.
	 * */
	//@Component
		/*
	public static class CustomizeContainer implements EmbeddedServletContainerCustomizer {
		@Override
		public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
			configurableEmbeddedServletContainer.setPort(9090);
			configurableEmbeddedServletContainer.setSessionTimeout(10, TimeUnit.SECONDS);
			configurableEmbeddedServletContainer.setContextPath("/");
		}
	}
	*/
		/*
	    @Bean
		public EmbeddedServletContainerFactory servletContainer() {
			TomcatEmbeddedServletContainerFactory tomcatFactory = new TomcatEmbeddedServletContainerFactory(){
				@Override
				protected void postProcessContext(Context context) {
					SecurityConstraint securityConstraint = new SecurityConstraint();
					securityConstraint.setUserConstraint("CONFIDENTIAL");
					SecurityCollection collection = new SecurityCollection();
					collection.addPattern("/*");
					securityConstraint.addCollection(collection);
					context.addConstraint(securityConstraint);
				}
			};

			tomcatFactory.addAdditionalTomcatConnectors(httpConnector());
			return tomcatFactory;
		}

		@Bean
		public Connector httpConnector() {
			Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
			connector.setScheme("http");
			connector.setPort(8080);
			connector.setSecure(false);
			connector.setRedirectPort(8443);
			return connector;
		}
		*/

}
