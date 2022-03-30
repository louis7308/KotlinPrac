package com.example.kotlin2.service

import com.example.kotlin2.model.TemplateModel
import com.example.kotlin2.repository.TemplateRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class TemplateServiceImpl constructor(@Autowired private val templateRepository: TemplateRepository) : TemplateService {

    override fun getAllTemplates(): List<TemplateModel> {
        return templateRepository.findAllBy()

    }

    override fun getTemplate(id: Int): TemplateModel? {
        return templateRepository.findById(id).orElse(null)
    }


    override fun getTemplateByName(name: String): TemplateModel? {
        return templateRepository.findByTemplateName(name)
    }


    @Transactional
    override fun saveTemplate(templateModel: TemplateModel): TemplateModel =
        templateRepository.save(templateModel)


}