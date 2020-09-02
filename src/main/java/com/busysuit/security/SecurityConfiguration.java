package com.busysuit.security;

	
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
	@Configuration
	//@EnableWebSecurity
	public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
		@Override
		   protected void configure(HttpSecurity httpSecurity) throws Exception {
			httpSecurity
			 .antMatcher("/**").authorizeRequests()
			 .antMatchers("/").permitAll()
	          .anyRequest().authenticated()
	          .and()
	         // .formLogin()
	          .oauth2Login()
	          .defaultSuccessUrl("/");
	        //  .defaultSuccessUrl("/loginSuccess");
	        //  .failureUrl("/loginFailure");
	
	}
	}
	
		//@Bean 
	//clientid:: 825168084236-03hi8erjfccj4cqc2kfq9khj0vgaqou9.apps.googleusercontent.com
		//public BCryptPasswordEncoder passwordEncoder() { 
	//client secreat: uhY8w8-zv7CRB7U67MPlSukU
			//return new BCryptPasswordEncoder();
		//}
	/*   @Override
	   protected void configure(HttpSecurity http) throws Exception {
	      http
	         .authorizeRequests()
	            .antMatchers("/", "/assets/**","/signup").permitAll()
	            .anyRequest().authenticated()
	            .and()
	         .formLogin()
	            .loginPage("/login")
	            .defaultSuccessUrl("/authenticated")
	            .permitAll()
	            .and()
	            .logout()
	            .permitAll();
	   }
	   @Autowired
	   public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	      auth
	         .inMemoryAuthentication()
	         .withUser("user").password("password").roles("USER");
	   }*/
		
	


