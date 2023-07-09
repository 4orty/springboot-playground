package com.example.springbootplayground

// hibernate entity vs javax(jpa) entity
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Test(
    @Id
    val id: Long?,
    val name: String
) : Serializable
