pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "architecture_sample"
include(":app")
include(":ui")
include(":presentation")
include(":network")
include(":infra")
include(":storage")
include(":device")
include(":db")
include(":api")
include(":data")
include(":domain")
include(":model")
include(":state")
include(":di")
include(":mapper")
