package com.workshop.Rda.controllers.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

//Annotation qui va dire que c'est un fichier sécyrité
@EnableWebSecurity
public class SecurityConfig {

    //Comme spring va chercher le bean spécifique il faut le recopier ici :
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
//        On peut supprimer les deux autres lignes
//        http.formLogin();
//        http.httpBasic();
        return http.build();
    }

}
