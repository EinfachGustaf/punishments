package live.einfachgustaf.punishments.utils

import kotlinx.serialization.json.Json
import live.einfachgustaf.punishments.config.ConfigManager.config
import live.einfachgustaf.punishments.db.DatabaseConnector
import net.axay.kspigot.chat.literalText
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor

val json = Json {
    prettyPrint = true
}

val prefix: Component = literalText {
    text("BanSystem") { color = NamedTextColor.RED }
    text(" » ") { color = NamedTextColor.DARK_GRAY }
}

val databaseConnector = DatabaseConnector(config.mongoDbConnectionString)