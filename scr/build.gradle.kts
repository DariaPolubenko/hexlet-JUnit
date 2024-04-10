plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.51.0"


}

group = "io.hexlet"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}