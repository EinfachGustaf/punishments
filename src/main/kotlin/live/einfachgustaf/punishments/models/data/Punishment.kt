package live.einfachgustaf.punishments.models.data

import kotlinx.serialization.Serializable
import live.einfachgustaf.punishments.types.PunishmentType

@Serializable
data class Punishment(
    val reason: String,
    val type: PunishmentType,
    val duration: Long,
    val moderator: String,
    val annontation: String?,
    val requiredPermission: String
)