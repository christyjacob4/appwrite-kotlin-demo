package io.appwrite.servicesTest

import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Database
import javax.xml.bind.DatatypeConverter.parseString
import java.io.File


suspend fun main() {
    val client = Client()
        .setProject("6062f9c2c09ce")
        .setEndpoint("https://demo.appwrite.io/v1")
        .setKey("d117e5f8b27d1a543d9080e6289f434b8687a1666737ad77a76907ecfabcffec682fdcea0f073729690263675e814485bf1788ce65ba51cc1c90e3de597cdb95bfb0fd2c8d8d207dc07ab1a112feb167d389cf047fc4e46f99e47ae0b0beb1c3787610154daea5c1fa493013e62239ef6cfd63cf02c8d9b63c0e48bf4bdf3bb4")

    val database = Database(client)

    listcollectionsTest(database)
    createcollectionTest(database)
    getcollectionTest(database)
    updatecollectionTest(database)
    deletecollectionTest(database)
    listdocumentsTest(database)
    createdocumentTest(database)
    getdocumentTest(database)
    updatedocumentTest(database)
    deletedocumentTest(database)

}

suspend fun listcollectionsTest(database: Database) {
    try {
        val response = database.listCollections(
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun createcollectionTest(database: Database) {
    try {
        val response = database.createCollection(
                name = "[NAME]",
                read = listOf(),
                write = listOf(),
                rules = listOf()
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getcollectionTest(database: Database) {
    try {
        val response = database.getCollection(
                collectionId = "[COLLECTION_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun updatecollectionTest(database: Database) {
    try {
        val response = database.updateCollection(
                collectionId = "[COLLECTION_ID]",
                name = "[NAME]",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun deletecollectionTest(database: Database) {
    try {
        val response = database.deleteCollection(
                collectionId = "[COLLECTION_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun listdocumentsTest(database: Database) {
    try {
        val response = database.listDocuments(
                collectionId = "[COLLECTION_ID]",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun createdocumentTest(database: Database) {
    try {
        val response = database.createDocument(
                collectionId = "[COLLECTION_ID]",
                data = mapOf( "a" to "b" ),
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getdocumentTest(database: Database) {
    try {
        val response = database.getDocument(
                collectionId = "[COLLECTION_ID]",
                documentId = "[DOCUMENT_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun updatedocumentTest(database: Database) {
    try {
        val response = database.updateDocument(
                collectionId = "[COLLECTION_ID]",
                documentId = "[DOCUMENT_ID]",
                data = mapOf( "a" to "b" ),
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun deletedocumentTest(database: Database) {
    try {
        val response = database.deleteDocument(
                collectionId = "[COLLECTION_ID]",
                documentId = "[DOCUMENT_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}








