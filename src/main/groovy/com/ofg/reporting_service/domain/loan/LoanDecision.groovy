package com.ofg.reporting_service.domain.loan

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

class LoanDecision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    
    @OneToOne
    @JoinColumn(name = 'LOAN_APPLICATION_ID')
    LoanApplication loanApplication
}
