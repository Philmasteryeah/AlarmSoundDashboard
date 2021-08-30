package org.philmaster.alarmsounddashboard;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AsdaConfig {

	private static final String INDEX_HTML_PATH = "classpath:/static/index.html";

//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//
//	}
//
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		// this will map uri to jsp view directly without a controller
//		registry.addViewController("/webjars/")
//				.setViewName("hello");
//	}
//
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/audio/**")
//				.addResourceLocations("/audio/", "classpath:/META-INF/resources/audio/")
//				.resourceChain(false);
//	}

	// https://github.com/spring-projects/spring-framework/issues/25410
//
//	@Bean
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
////		registry.addResourceHandler("/webjars/**")
////				.addResourceLocations("/webjars/", "classpath:/META-INF/resources/webjars/")
////				.resourceChain(false);
//
//		registry.addResourceHandler("/audio/**")
//				.addResourceLocations("/audio/", "classpath:/META-INF/resources/audio/")
//				.resourceChain(false);
//	}
//

//	/**
//	 * route / to index.html
//	 * 
//	 * @param indexHtml
//	 * @return
//	 */
//	@Bean
//	public RouterFunction<ServerResponse> indexRouter(@Value(INDEX_HTML_PATH) final Resource indexHtml) {
//		return RouterFunctions.route(GET("/"), request -> ok().contentType(MediaType.TEXT_HTML)
//				.bodyValue(indexHtml));
//
//	}

}
