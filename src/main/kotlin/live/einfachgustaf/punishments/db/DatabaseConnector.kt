package live.einfachgustaf.punishments.db

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.ServerApi
import com.mongodb.ServerApiVersion
import com.mongodb.kotlin.client.MongoClient

class DatabaseConnector(
    connectionUri: String,
    database: String = "punishments",
) {

    val serverApi = ServerApi.builder()
        .version(ServerApiVersion.V1)
        .build()
    val settings = MongoClientSettings.builder()
        .applyConnectionString(ConnectionString(connectionUri))
        .serverApi(serverApi)
        .build()

    val mongoClient = MongoClient.create(settings)
    val database = mongoClient.getDatabase(database)
}