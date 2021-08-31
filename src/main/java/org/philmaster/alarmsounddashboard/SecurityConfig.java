package org.philmaster.alarmsounddashboard;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories
//@EnableWebMvc
@Configuration
public class SecurityConfig {
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
