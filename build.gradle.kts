plugins {
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClass = "org.example.Main"
}

repositories {
    flatDir {
        dirs("libs")
    }
}

dependencies {
    implementation(":core")
}
