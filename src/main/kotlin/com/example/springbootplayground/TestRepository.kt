package com.example.springbootplayground

import org.springframework.data.repository.CrudRepository

interface TestRepository : CrudRepository<Test, Long>
