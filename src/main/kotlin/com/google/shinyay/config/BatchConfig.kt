package com.google.shinyay.config

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.core.step.tasklet.TaskletStep
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableBatchProcessing
class BatchConfig(val stepBuilderFactory: StepBuilderFactory, val jobBuilderFactory: JobBuilderFactory) {

    @Bean
    fun helloTasklet(): HelloTasklet {
        return HelloTasklet()
    }

    @Bean
    fun helloStep(): TaskletStep {
        return stepBuilderFactory.get("HelloStep")
            .tasklet(helloTasklet())
            .build()
    }
}