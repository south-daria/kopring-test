package com.kopring.kopring.controller

import com.kopring.kopring.entity.TestEntity
import com.kopring.kopring.service.TestService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/api/v1/test"], produces = ["application/json"])
class TestController(
        private val testService: TestService
) {
    @GetMapping
    fun get(): List<TestEntity> {
        return testService.getTestList()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): TestEntity {
        return testService.getTest(id)
    }

    @PostMapping
    fun create(@RequestBody testEntity: TestEntity): TestEntity{
        return testService.save(testEntity)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long){
        testService.delete(id)
    }
}