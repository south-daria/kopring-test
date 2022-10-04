package com.kopring.kopring.repository

import com.kopring.kopring.entity.TestEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestRepository : JpaRepository<TestEntity, Long> {
}