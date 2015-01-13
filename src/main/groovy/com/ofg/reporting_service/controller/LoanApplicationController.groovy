package com.ofg.reporting_service.controller

import com.wordnik.swagger.annotations.Api
import groovy.util.logging.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequestMapping('/api')
@Api(value = 'notifyAboutNewApplication', description = 'Notify the Reporting Service about a new loan application')
class LoanApplicationController {
    @RequestMapping(value = '/application', method = RequestMethod.POST)
    @ResponseBody
    HttpStatus onNewApplication(@RequestParam String loanId, @RequestParam Long clientId) {
        return HttpStatus.OK;
    }
}
