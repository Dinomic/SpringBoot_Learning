//package Dinomic.SpringBootLearning.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.User.UserBuilder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        UserBuilder users = User.withDefaultPasswordEncoder();
//
//        auth.inMemoryAuthentication()
//                .withUser(users.username("admin").password("admin").roles("ADMIN"))
//                .withUser(users.username("user").password("user").roles("USER"));
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
////                .antMatchers("/", "/home").permitAll() // (3)
//                .anyRequest().authenticated() // (4)
//                .and()
//                .formLogin() // (5)
//                .loginPage("/signIn") // (5)
//                .permitAll()
//                .and()
//                .logout() // (6)
//                .permitAll()
//                .and()
//                .httpBasic(); // (7)
//    }
//
//}
