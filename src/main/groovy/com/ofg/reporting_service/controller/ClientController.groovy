package com.ofg.reporting_service.controller

import com.wordnik.swagger.annotations.Api
import groovy.util.logging.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@Slf4j
@RestController
@RequestMapping('/api')
@Api(value = 'notifyAboutNewClient', description = 'Notify the Reporting Service about a new client')
class ClientController {
    @RequestMapping(value = '/client', method = RequestMethod.POST, headers = 'content-type:application/json')
    @ResponseBody
    HttpStatus onNewClient(@RequestParam(required = true) String firstName,
                           @RequestParam(required = true) String lastName,
                           @RequestParam(required = true) Integer age,
                           @RequestParam(required = true) String loanId) {
        return HttpStatus.OK;
    }
}
