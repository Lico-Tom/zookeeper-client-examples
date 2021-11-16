plugins {
    java
}

group = "com.github.shoothzj"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.22")
    implementation("org.apache.curator:curator-recipes:5.2.0")
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}