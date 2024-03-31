plugins {
    kotlin("jvm") version "1.9.21"
    kotlin("kapt") version "1.9.21"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    kotlin("plugin.serialization") version "1.9.21"
    id("xyz.jpenilla.run-velocity") version "2.2.2"
}

group = "live.einfachgustaf"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")

}

dependencies {
    // VELOCITY
    compileOnly("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
    kapt("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")

    //KSPIGOT (for some utils)
    implementation("net.axay", "kspigot", "1.20.3")

    //MONGODB
    implementation("org.mongodb:mongodb-driver-kotlin-sync:5.0.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release.set(17)
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    runVelocity {
        velocityVersion("3.3.0-SNAPSHOT")
    }
    shadowJar {
        fun reloc(pkg: String) = relocate(pkg, "live.einfachgustaf.punishments.dependency.$pkg")
        reloc("kotlinx.serialization")
    }
}