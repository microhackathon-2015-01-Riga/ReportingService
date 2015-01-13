package com.ofg.reporting_service.domain.client

import javax.persistence.*

@Entity
@Table(name = "CLIENT")
class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id

    @Column(name = "FIRST_NAME")
    String firstName

    @Column(name = "LAST_NAME")
    String lastName

    @Column(name = "AGE")
    Integer age
}
