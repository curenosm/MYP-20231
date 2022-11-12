package com.bettercodesaul.proyecto_2.configuracion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



/**
 * Clase 
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;

	/**
	 * Registramos un bean con nuestra implementacion de UserDetailsService
	 * 
	 * @return authProvider
	 */
    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

	/**
	 * Registramos un password encoder que no cifra nada por el momento
	 * 
	 * @return
	 */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }


	/**
	 * Metodo que se encarga de cofigurar la cadena de seguridad y la regitra
	 * como un bean en el contenedor de Spring
	 * 
	 * @return SecurityFilterChain
	 */
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((requests) -> requests
				.antMatchers("/registro", "/css/**").permitAll()
				// .antMatchers("/**").permitAll()
				.anyRequest().authenticated()
			)
			.authenticationProvider(authProvider())
			.formLogin((form) -> form
				.loginPage("/login")
				.defaultSuccessUrl("/", true)
				.permitAll()
			)
			.cors().disable()
			.csrf().disable()
			.logout((logout) -> logout.permitAll())
			.headers().frameOptions().disable();

		return http.build();
	}

}