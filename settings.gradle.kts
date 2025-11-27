// C:/Users/ASUS/Desktop/Kuliah/Semester 5/PAM/Pertemuan_2/MyRoom/settings.gradle.kts

pluginManagement {
    repositories {
        google {
            content {                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal() // <-- Add this line
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Room"
include(":app")
