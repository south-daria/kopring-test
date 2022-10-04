package com.kopring.kopring.service

import com.kopring.kopring.entity.TestEntity
import com.kopring.kopring.repository.TestRepository
import org.springframework.stereotype.Service

@Service
class TestService (
        private val testRepository: TestRepository
        ) {
    fun getTestList() : MutableList<TestEntity> {
        return testRepository.findAll()
    }

    fun getTest(id : Long) : TestEntity {
        return testRepository.findById(id).orElseGet(null)
    }

    fun save(testEntity : TestEntity) : TestEntity {
        return testRepository.save(testEntity)
    }

    fun delete(id : Long) {
        val testEntity = getTest(id)
        testRepository.delete(testEntity)
    }
}