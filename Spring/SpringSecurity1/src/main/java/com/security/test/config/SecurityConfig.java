package com.security.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.server.session.InMemoryWebSessionStore;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails normaluser=User.withUsername("kolhe").password(passwordEncoder().encode("kolhe")).roles("NORMAL").build();
		
		UserDetails adminuser = User.withUsername("kolhe1").password(passwordEncoder().encode("kolhe123")).roles("ADMIN").build();
		

		InMemoryUserDetailsManager inMemoryUserDetailsManager =new InMemoryUserDetailsManager(normaluser,adminuser);
		
		return inMemoryUserDetailsManager; 
	}

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
            .authorizeHttpRequests()
            .requestMatchers("/home/admin")
            .hasRole("ADMIN")
            .requestMatchers("/home/normal")
            .hasRole("NORMAL")
                .requestMatchers("/home/public").permitAll() // Correct usage of permitAll
                .anyRequest().authenticated() // Ensure all other requests require authentication
            .and()
            .formLogin(); // Correct placement of formLogin
        return httpSecurity.build(); // Return the SecurityFilterChain
    }
}
