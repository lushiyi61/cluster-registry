package com.kotgame.cluster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class ClusterApplication

fun main(args: Array<String>) {
	runApplication<ClusterApplication>(*args)
}
