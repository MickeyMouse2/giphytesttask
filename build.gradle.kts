// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "8.1.1" apply false
    id ("com.android.library") version "8.0.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id ("com.google.dagger.hilt.android") version "2.46" apply false
}
allprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            allWarningsAsErrors = false
            freeCompilerArgs = listOf(
                "-opt-in=kotlin.RequiresOptIn",
            )
        }
    }
}