package com.rest_crud_api.task_manager.security;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){


        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}susan123")
                .roles("EMPLOYEE")
                .build();

        UserDetails alex = User.builder()
                .username("alex")
                .password("{noop}alex123")
                .roles("MANAGER")
                .build();

        UserDetails john = User.builder()
                .username("john")
                .password("{noop}john123")
                .roles("MANAGER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(susan,alex,john);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(configurer -> configurer.requestMatchers(HttpMethod.GET,"/api/tasks").hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.GET,"/api/tasks/**").hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.POST,"/api/tasks").hasRole("MANAGER")
                .requestMatchers(HttpMethod.PUT,"/api/tasks").hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE,"/api/tasks/**").hasRole("ADMIN"));

        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());
        return http.build();
    }
}
