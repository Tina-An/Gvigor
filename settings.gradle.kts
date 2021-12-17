pluginManagement {
    repositories {
        maven {
            url = uri("http://artifactory.cde.huawei.com/artifactory/maven-public/")
            isAllowInsecureProtocol = true
        }
        maven {
            url = uri("http://artifactory.cde.huawei.com/artifactory/jetbrains-public/")
            isAllowInsecureProtocol = true
        }
        maven {
            url = uri("http://artifactory.cde.huawei.com/artifactory/intellij-dependencies/")
            isAllowInsecureProtocol = true
        }
    }
}

rootProject.name = "Gvigor"
