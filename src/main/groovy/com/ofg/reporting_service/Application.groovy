package com.ofg.reporting_service
import com.ofg.config.BasicProfiles
import com.ofg.infrastructure.environment.EnvironmentSetupVerifier
import com.ofg.infrastructure.metrics.config.EnableMetrics
import groovy.transform.TypeChecked
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.EnableAspectJAutoProxy

@TypeChecked
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableCaching
@EnableMetrics
class Application {
    static void main(String[] args) {
        def app = new SpringApplication(Application)
        app.addListeners(new EnvironmentSetupVerifier(BasicProfiles.all()))
        app.run(args)
    }
}
