package live.einfachgustaf.punishments.config

import live.einfachgustaf.punishments.models.resource.Config
import live.einfachgustaf.punishments.utils.json
import net.axay.kspigot.config.kSpigotConfig
import java.io.File

object ConfigManager {

    val config by kSpigotConfig<Config>(
        createFile(File("plugins/")),
        stringFormat = json,
        default = {
            Config(
                mongoDbConnectionString = ""
            )
        }
    )

    private fun createFile(file: File): File {
        if (file.exists()) return file
        file.parentFile.mkdirs()
        file.createNewFile()

        return file
    }
}