package com.ofg.reporting_service.controller

import com.wordnik.swagger.annotations.Api
import groovy.util.logging.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@Slf4j
@RestController
@RequestMapping('/api')
@Api(value = 'sendApplicationDetailsAndDecision', description = 'Send the loan application details and decision to the Reporting')
class ReportingController {
    @RequestMapping(value = '/reporting', method = RequestMethod.POST)
    @ResponseBody
    HttpStatus onDetailsReceived(@RequestParam(required = true) String loanId,
                                 @RequestParam(required = true) String job,
                                 @RequestParam(required = true) BigDecimal amount,
                                 @RequestParam(required = true) String fraudStatus,
                                 @RequestParam(required = true) String decision) {
        return HttpStatus.OK;
    }
}
