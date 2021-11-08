buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://maven.google.com/")
        }
    }
    dependencies {
        classpath(com.baga.musicman.Libs.Android.AGP)
        classpath(com.baga.musicman.Libs.Kotlin.GradlePlugin)
        classpath(com.baga.musicman.Libs.Hilt.Plugin)
    }
}

tasks.register("clean",Delete::class) {
    delete(rootProject.buildDir)
}