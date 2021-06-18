package io.appwrite.servicesTest

import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Storage
import okio.BufferedSink
import okio.Okio
import okio.buffer
import okio.sink
import java.io.File


suspend fun main() {
    val client = Client()
        .setProject("6062f9c2c09ce")
        .setEndpoint("https://demo.appwrite.io/v1")
        .setKey("d117e5f8b27d1a543d9080e6289f434b8687a1666737ad77a76907ecfabcffec682fdcea0f073729690263675e814485bf1788ce65ba51cc1c90e3de597cdb95bfb0fd2c8d8d207dc07ab1a112feb167d389cf047fc4e46f99e47ae0b0beb1c3787610154daea5c1fa493013e62239ef6cfd63cf02c8d9b63c0e48bf4bdf3bb4")

    val storage = Storage(client)

//    listfilesTest(storage)
//    createfileTest(storage)
//    getfileTest(storage)
//    updatefileTest(storage)
//    deletefileTest(storage)
//    getfiledownloadTest(storage)
//    getfilepreviewTest(storage)
    getfileviewTest(storage)

}

suspend fun listfilesTest(storage: Storage) {
    try {
        val response = storage.listFiles(
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun createfileTest(storage: Storage) {
    try {
        val response = storage.createFile(
                file = File("./path-to-files/image.jpg"),
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getfileTest(storage: Storage) {
    try {
        val response = storage.getFile(
                fileId = "60cb5cb160812"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun updatefileTest(storage: Storage) {
    try {
        val response = storage.updateFile(
                fileId = "60cb5cb160812",
                read = listOf("*"),
                write = listOf("*")
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun deletefileTest(storage: Storage) {
    try {
        val response = storage.deleteFile(
                fileId = "[FILE_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getfiledownloadTest(storage: Storage) {
    try {
        val response = storage.getFileDownload(
                fileId = "60cb5cb160812"
        )
        println("Starting file download")
        val downloadedFile: File = File("download.png")
        val sink: BufferedSink = downloadedFile.sink().buffer()
        sink.writeAll(response.body!!.source())
        sink.close()
        println("Done")
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getfilepreviewTest(storage: Storage) {
    try {
        val response = storage.getFilePreview(
                fileId = "60cb5cb160812",
        )
        println("Starting file download")
        val downloadedFile: File = File("download.png")
        val sink: BufferedSink = downloadedFile.sink().buffer()
        sink.writeAll(response.body!!.source())
        sink.close()
        println("Done")
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getfileviewTest(storage: Storage) {
    try {
        val response = storage.getFileView(
                fileId = "60cb5cb160812"
        )
        println("Starting file download")
        val downloadedFile: File = File("download.png")
        val sink: BufferedSink = downloadedFile.sink().buffer()
        sink.writeAll(response.body!!.source())
        sink.close()
        println("Done")
    } catch (e: AppwriteException) {
        println(e)
    }
}








