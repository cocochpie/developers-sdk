const val projectGroupId = "com.github.ryukato"
const val publishGroupId = "com.github.ryukato"
const val publishLicense = "MIT License"
const val scmConnectionUrl = "scm:git:git://ryukato/developers-sdk.git"
const val developerConnectionUrl = "scm:git:ssh://ryukato/developers-sdk.git"
const val gitRepositoryUrl = "https://github.com/ryukato/developers-sdk.git"
const val releasesRepoUrl = "https://oss.sonatype.org/service/local/staging/deploy/maven2"
const val snapshotsRepoUrl = "https://oss.sonatype.org/content/repositories/snapshots"
const val bintrayUserOrg = "ryukato79"

object Sdk {
    const val publishArtifactId = "link-developers-sdk-kt"
    const val publishName = publishArtifactId
    const val publishDescription = "SDK for line-blockchain in Kotlin"
    const val publishProjectUrl =
        "https://github.com/ryukato/developers-sdk/blob/master/developers-sdk-kt/README.md"
}

object SpringBootSupport {
    const val publishArtifactId = "link-developers-sdk-kt-spring-boot-support"
    const val publishName = publishArtifactId
    const val publishDescription = "SDK auto-configuration to support spring-boot applications"
    const val publishProjectUrl =
        "https://github.com/ryukato/developers-sdk/blob/master/developers-sdk-kt-spring-boot-support/README.md"
}


val developerList = listOf(
    mapOf(
        "id" to "ryukato",
        "name" to "Yoonyoul Yoo",
        "email" to "ryukato79@gmail.com"
    )
)
