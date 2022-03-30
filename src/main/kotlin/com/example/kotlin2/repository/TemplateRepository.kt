package com.example.kotlin2.repository

import com.example.kotlin2.model.TemplateModel
import org.hibernate.sql.Select
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface TemplateRepository: CrudRepository<TemplateModel,Int>{

    fun findByTemplateName(templateName: String): TemplateModel?

    fun findAllBy() : List<TemplateModel>



}