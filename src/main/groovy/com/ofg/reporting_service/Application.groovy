package com.ofg.reporting_service

import com.ofg.config.BasicProfiles
import com.ofg.infrastructure.environment.EnvironmentSetupVerifier
import groovy.transform.TypeChecked
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.scheduling.annotation.EnableAsync

@TypeChecked
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableCaching
@EnableAsync
class Application {
    static void main(String[] args) {
        def app = new SpringApplication(Application)
        app.addListeners(new EnvironmentSetupVerifier(BasicProfiles.all()))
        app.run(args)
    }
}
