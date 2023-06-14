plugins {
    id("cloud-gaming-platform.java-application-conventions")
    id("cloud-gaming-platform.grpc-conventions")
}

dependencies {
    implementation(project(":cloud-gaming-proto"))
}
