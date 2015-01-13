package com.ofg.reporting_service.controller

import com.codahale.metrics.Counter
import com.codahale.metrics.MetricRegistry
import com.wordnik.swagger.annotations.Api
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

import javax.annotation.PostConstruct

@Slf4j
@RestController
@RequestMapping('/api')
@Api(value = 'notifyAboutNewClient', description = 'Notify the Reporting Service about a new client')
class ClientController {
    @Autowired
    MetricRegistry metricRegistry;

    Counter notificationsReceived

    @PostConstruct
    void init() {
        notificationsReceived = metricRegistry.counter('notificationsReceived')
    }

    @RequestMapping(value = '/client', method = RequestMethod.POST)
    @ResponseBody
    HttpStatus onNewClient(@RequestParam(required = true) String firstName,
                           @RequestParam(required = true) String lastName,
                           @RequestParam(required = true) Integer age,
                           @RequestParam(required = true) String loanId) {

        notificationsReceived.inc()

        return HttpStatus.OK;
    }
}
