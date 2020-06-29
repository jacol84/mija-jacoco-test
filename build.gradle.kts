plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    jacoco
    application
}
val value = buildDir
val allTestCoverageFile = "$buildDir/jacoco/allTestCoverage.exec"

allprojects {
    apply {
        plugin("jacoco")
        plugin("org.jetbrains.kotlin.jvm")
    }
    repositories {
        jcenter()
    }

    dependencies {
        implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        testImplementation("org.jetbrains.kotlin:kotlin-test")
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    }

    tasks.jacocoTestReport {
        reports {
            executionData(file("$value/jacoco/allTestCoverage.exec"))
            sourceSets(sourceSets.main.get())
        }
    }
}

tasks.register<JacocoMerge>("jacocoMergeTest") {
    destinationFile = file(allTestCoverageFile)
    subprojects.map { file("${it.buildDir}/jacoco/test.exec") }.forEach { executionData(it) }
}

application {
    mainClassName = "mija.jacoco.test.AppKt"
}
