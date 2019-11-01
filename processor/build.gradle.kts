plugins {
    id("local.java-library")
    id("local.maven-publish")
}

base.archivesBaseName = "incap-processor"
description = "Helper annotation processor for building incremental annotation processors"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":lib"))

    compileOnly("com.google.auto.service:auto-service-annotations:1.0-rc6")
    annotationProcessor("com.google.auto.service:auto-service:1.0-rc6")

    testImplementation("junit:junit:4.12")
    testImplementation("com.google.testing.compile:compile-testing:0.18")
}
