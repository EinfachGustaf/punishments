package live.einfachgustaf.punishments.models.data

import kotlinx.serialization.Serializable
import live.einfachgustaf.punishments.types.PunishmentType

@Serializable
data class PunishmentReason(
    val id: Int,
    val name: String,
    val time: Long,
    val parents: PunishmentReason?,
    val type: PunishmentType
)
