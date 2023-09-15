package br.jus.tjes.interceptor.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.jus.tjes.interceptor.interceptor.Interceptor;

@Component
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {

    private Interceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }

    public InterceptorConfiguration(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

}