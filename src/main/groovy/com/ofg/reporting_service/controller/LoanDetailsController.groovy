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
@Api(value = 'sendApplicationDetailsAndDecision', description = 'Send the loan application details and decision to the Reporting')
class LoanDetailsController {
    @RequestMapping(value = '/details', method = RequestMethod.POST, headers = 'content-type:application/json')
    @ResponseBody
    HttpStatus onDetailsReceived() {
        return HttpStatus.OK;
    }
}
