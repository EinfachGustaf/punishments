package live.einfachgustaf.punishments.models.resource

import kotlinx.serialization.Serializable

@Serializable
data class Config(
    val mongoDbConnectionString: String
)