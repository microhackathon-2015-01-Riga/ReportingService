package com.ofg.reporting_service.domain.loan

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class LoanDecision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = 'ID')
    Long id
    
    @Column(name = 'STATUS')
    String status
    
    @Column(name = 'DESCRIPTION')
    String description
}
