package com.example.kotlin2.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class TemplateModel(
    @Id
    @GeneratedValue
    val id: Int,
    val templateName: String,
    val content: String
)