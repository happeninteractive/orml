object Versions {
    var orxUseSnapshot = false
    var openrndrUseSnapshot = false
    var orx = if (orxUseSnapshot) "0.5.1-SNAPSHOT" else "0.4.4"
    var openrndr = if (openrndrUseSnapshot) "0.5.1-SNAPSHOT" else "0.4.4"
    val kotlin = "1.9.0"
}