package com.ofg.reporting_service.domain.loan

import com.ofg.reporting_service.domain.client.Client

import javax.persistence.*

@Entity
@Table(name = 'LOAN_APPLICATION')
class LoanApplication {
    @Id
    @Column(name = 'ID')
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    
    @ManyToOne
    @JoinColumn(name = 'CLIENT_ID')
    Client client
    
    @Column(name = 'AMOUNT')
    BigDecimal amount
    
    @OneToOne
    @JoinColumn(name = 'DECISION')
    LoanDecision decision;
}
