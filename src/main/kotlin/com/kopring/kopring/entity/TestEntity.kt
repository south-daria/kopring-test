package com.kopring.kopring.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "test")
data class TestEntity(
        @Id @GeneratedValue
        @Column(name = "test_id", updatable = false, insertable = false)
        var id: Long? = null,
        var title: String,
        var content: String
) : BaseEntity()
