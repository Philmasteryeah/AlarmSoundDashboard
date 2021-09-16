package org.philmaster.alarmsounddashboard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableJpaRepositories
//@EnableWebMvc
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.cors();
		http.csrf();

//		security.cors()
//				.disable();
//		security.csrf()
//				.disable()
//				.authorizeRequests()
//				.anyRequest()
//				.authenticated()
//				.and()
//				.formLogin()
//				.disable(); // <-- this w^ill disable the login route

	}
//
////	// TODO
////	@Bean
////	public UserDetailsService userDetailsService() {
////
////		UserDetails user = User.withUsername("user")
////				.password(passwordEncoder().encode("userpwd"))
////				.roles("USER")
////				.build();
////
////		UserDetails admin = User.withUsername("sa")
////				.password(passwordEncoder().encode("1"))
////				.roles("ADMIN")
////				.build();
////
////		return new MapReactiveUserDetailsService(user, admin);
////	}
//
//	@Bean
//	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//		return http.authorizeExchange()
//				.anyExchange()
//				.permitAll()
//				.and()
//				.build();
//
//		// .pathMatchers(HttpMethod.GET, "/webjars/**").permitAll()
//
////		return http.authorizeExchange()
////				.pathMatchers("/")
////				.hasAuthority("ROLE_ADMIN")
////				.anyExchange()
////				.authenticated()
////				.and()
////				.httpBasic()
////				.and()
////				.build();
////		return http
////				// Demonstrate that method security works
////				// Best practice to use both for defense in depth
////				.authorizeExchange()
////				.anyExchange()
////				.permitAll()
////				.and()
////				.httpBasic()
////				.and()
////				.build();
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}

}
