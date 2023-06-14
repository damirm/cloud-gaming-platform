import org.gradle.kotlin.dsl.version

plugins {
    id("cloud-gaming-platform.java-conventions")
    id("com.google.protobuf")
}

dependencies {
    implementation("com.google.protobuf:protobuf-java:3.23.1")
}
