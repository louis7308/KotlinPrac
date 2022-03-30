package com.example.kotlin2.service

import com.example.kotlin2.model.TemplateModel
import org.springframework.stereotype.Service

@Service
interface TemplateService {

    fun getAllTemplates(): Iterable<TemplateModel>

    fun getTemplate(id: Int): TemplateModel?

    fun saveTemplate(templateModel: TemplateModel): TemplateModel

    fun getTemplateByName(name: String): TemplateModel?
}