package com.kotlin.grpc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class GrpcServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(GrpcServerApplication::class.java, *args)
}
