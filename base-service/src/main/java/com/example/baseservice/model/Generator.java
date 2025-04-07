package com.example.baseservice.model;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Generator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:postgresql://localhost:5432/einstein_db",
                        "postgres", "password")
                .globalConfig(builder -> {
                    builder.author("Bowen")
                            .outputDir(System.getProperty("user.dir") + "/base-service/src/main/java/com/example/baseservice")
                            .commentDate("yyyy-MM-dd")
                            .disableOpenDir(); // Disable open directory after generation
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.baseservice") // Set parent package name
                            .entity("model.entity") // Entity package name
                            .mapper("mapper") // Mapper package name
                            .service("service") // Service package name
                            .serviceImpl("service.impl") // Service implementation package name
                            .pathInfo(Collections.singletonMap(OutputFile.xml,
                                    System.getProperty("user.dir") + "/base-service/src/main/resources/mapper")); // XML mapper output path
                })
                .strategyConfig(builder -> {
//                    builder.addInclude("table1", "table2") // Specify which tables to generate (replace with your actual table names)
                            // Comment out the line above and uncomment below to generate for all tables
                            builder// Generate all tables
                            .entityBuilder()
                            .enableLombok() // Enable Lombok
                            .enableTableFieldAnnotation() // Enable column annotation
                            .mapperBuilder()
                            .enableMapperAnnotation() // Enable @Mapper annotation
                            .serviceBuilder()
                            .formatServiceFileName("%sService") // Service interface naming
                            .formatServiceImplFileName("%sServiceImpl"); // Service implementation naming
                })
                .templateEngine(new FreemarkerTemplateEngine()) // Set template engine
                .execute();
    }
}
