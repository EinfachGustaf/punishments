package live.einfachgustaf.punishments.models.data

import kotlinx.serialization.Serializable

@Serializable
data class PunishmentPlayer(
    val uuid: String,
    val activePunishments: ArrayList<Punishment>,
    val punishmentHistory: ArrayList<Punishment>
)