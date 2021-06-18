package io.appwrite.servicesTest

import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Avatars
import javax.xml.bind.DatatypeConverter.parseString
import java.io.File


suspend fun main() {
    val client = Client()
        .setProject("6062f9c2c09ce")
        .setEndpoint("https://demo.appwrite.io/v1")
        .setKey("d117e5f8b27d1a543d9080e6289f434b8687a1666737ad77a76907ecfabcffec682fdcea0f073729690263675e814485bf1788ce65ba51cc1c90e3de597cdb95bfb0fd2c8d8d207dc07ab1a112feb167d389cf047fc4e46f99e47ae0b0beb1c3787610154daea5c1fa493013e62239ef6cfd63cf02c8d9b63c0e48bf4bdf3bb4")

    val avatars = Avatars(client)

    getbrowserTest(avatars)
    getcreditcardTest(avatars)
    getfaviconTest(avatars)
    getflagTest(avatars)
    getimageTest(avatars)
    getinitialsTest(avatars)
    getqrTest(avatars)

}

suspend fun getbrowserTest(avatars: Avatars) {
    try {
        val response = avatars.getBrowser(
                code = "aa",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getcreditcardTest(avatars: Avatars) {
    try {
        val response = avatars.getCreditCard(
                code = "amex",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getfaviconTest(avatars: Avatars) {
    try {
        val response = avatars.getFavicon(
                url = "https://example.com"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getflagTest(avatars: Avatars) {
    try {
        val response = avatars.getFlag(
                code = "af",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getimageTest(avatars: Avatars) {
    try {
        val response = avatars.getImage(
                url = "https://example.com",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getinitialsTest(avatars: Avatars) {
    try {
        val response = avatars.getInitials(
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getqrTest(avatars: Avatars) {
    try {
        val response = avatars.getQR(
                text = "[TEXT]",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}








