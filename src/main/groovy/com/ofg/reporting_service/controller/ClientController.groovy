package com.ofg.reporting_service.controller

import com.wordnik.swagger.annotations.Api
import groovy.util.logging.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequestMapping('/api')
@Api(value = 'notifyAboutNewClient', description = 'Notify the Reporting Service about a new client')
class ClientController {
    @RequestMapping(value = '/client', method = RequestMethod.POST)
    @ResponseBody
    HttpStatus onNewClient() {
        return HttpStatus.OK;
    }
}
