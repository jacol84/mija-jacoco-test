
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    jacoco
    application
}
allprojects{
    apply{
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

}

application {
    mainClassName = "mija.jacoco.test.AppKt"
}
