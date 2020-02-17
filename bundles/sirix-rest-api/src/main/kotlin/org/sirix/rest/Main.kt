package org.sirix.rest

import io.vertx.core.Launcher
import java.nio.file.Path

fun main() {
    Launcher.executeCommand("run", "-conf", "bundles/sirix-rest-api/src/main/resources/sirix-conf.json", "org.sirix.rest.SirixVerticle")
}

