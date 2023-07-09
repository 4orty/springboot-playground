plugins {
    id("org.springframework.boot") version "2.6.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.0"
    kotlin("plugin.spring") version "1.5.0"
    kotlin("plugin.jpa") version "1.9.0-RC"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    maven {
        setUrl("http://repo.kakaopay.com/repository/kakaopay-public")
        isAllowInsecureProtocol = true
    }
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web-services")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("org.ehcache:ehcache:3.8.1")
    implementation("javax.cache:cache-api:1.1.0")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.kotest:kotest-runner-junit5-jvm:4.6.0")
    implementation("io.micrometer:micrometer-registry-prometheus")
    implementation("org.hibernate:hibernate-micrometer:5.6.15.Final")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation("io.github.resilience4j:resilience4j-spring-boot2:1.5.0")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-aop")

    runtimeOnly("mysql:mysql-connector-java")

    implementation("io.github.resilience4j:resilience4j-micrometer:1.5.0")
}

// tasks.withType<KotlinCompile> {
//    kotlinOptions {
//        freeCompilerArgs = listOf("-Xjsr305=strict")
//        jvmTarget = "11"
//    }
// }
//
// tasks.withType<Test> {
//    useJUnitPlatform()
// }

// jib {
//    from.image = "bsh.kakaopay.com/base/adoptopenjdk:8u282-b08-jdk-hotspot-focal"
//    to.image = "${java.lang.System.getenv("DOCKER_IMG_NAME")}:${java.lang.System.getenv("DOCKER_TAG")}".takeIf { java.lang.System.getenv()
//        .contains("DOCKER_IMG_NAME") }
//
//    if (java.lang.System.getenv("PHASE") == "build") { // plumber or 9rum?
//        configurationName.set("productionRuntimeClasspath")
//        container.filesModificationTime = java.io.ByteArrayOutputStream().let { os ->
//            project.exec {
//                commandLine = "git log -1 --pretty=%cI".split(" ")
//                standardOutput = os
//            }
//            os.toString("UTF-8").trim()
//        }
//    } else {
//        configurationName.set("9rumDeploy")
//        container.filesModificationTime = java.time.OffsetDateTime.now().toString()
//    }
//
//    container.entrypoint = listOf(
//        "bash",
//        "-c",
//        "java \$JAVA_OPTS -cp /app/resources:/app/classes:/app/libs/* com.kakaopay.sreportal.slackman.SreSlackManWebApplicationKt"
//    )
// }
