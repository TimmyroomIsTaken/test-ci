plugins {
    kotlin("jvm") version "1.8.0"
    application
}

buildscript {
    extra.apply {
        set("kotlin_version", "1.3.72")
    }
}
val kotlinVersion = rootProject.extra["kotlin_version"]

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:$kotlinVersion")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}