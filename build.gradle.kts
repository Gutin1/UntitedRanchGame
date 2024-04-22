plugins {
    kotlin("jvm") version "1.9.22"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

val littleKtVersion = "0.9.0" // or whichever hash you are using
val kotlinCoroutinesVersion = "1.8.0" // or whatever version you are using

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.lehaine.littlekt:core:$littleKtVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutinesVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.shadowJar {
    archiveFileName.set("BlainsGame.jar")

    manifest {
        attributes["Main-Class"] = "dev.gutin.main.MainKt"
    }
}