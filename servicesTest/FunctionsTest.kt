package io.appwrite.servicesTest

import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Functions
import javax.xml.bind.DatatypeConverter.parseString
import java.io.File


suspend fun main() {
    val client = Client()
        .setProject("6062f9c2c09ce")
        .setEndpoint("https://demo.appwrite.io/v1")
        .setKey("d117e5f8b27d1a543d9080e6289f434b8687a1666737ad77a76907ecfabcffec682fdcea0f073729690263675e814485bf1788ce65ba51cc1c90e3de597cdb95bfb0fd2c8d8d207dc07ab1a112feb167d389cf047fc4e46f99e47ae0b0beb1c3787610154daea5c1fa493013e62239ef6cfd63cf02c8d9b63c0e48bf4bdf3bb4")

    val functions = Functions(client)

    listTest(functions)
    createTest(functions)
    getTest(functions)
    updateTest(functions)
    deleteTest(functions)
    listexecutionsTest(functions)
    createexecutionTest(functions)
    getexecutionTest(functions)
    updatetagTest(functions)
    listtagsTest(functions)
    createtagTest(functions)
    gettagTest(functions)
    deletetagTest(functions)

}

suspend fun listTest(functions: Functions) {
    try {
        val response = functions.list(
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun createTest(functions: Functions) {
    try {
        val response = functions.create(
                name = "[NAME]",
                execute = listOf(),
                env = "dotnet-3.1",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getTest(functions: Functions) {
    try {
        val response = functions.get(
                functionId = "[FUNCTION_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun updateTest(functions: Functions) {
    try {
        val response = functions.update(
                functionId = "[FUNCTION_ID]",
                name = "[NAME]",
                execute = listOf(),
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun deleteTest(functions: Functions) {
    try {
        val response = functions.delete(
                functionId = "[FUNCTION_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun listexecutionsTest(functions: Functions) {
    try {
        val response = functions.listExecutions(
                functionId = "[FUNCTION_ID]",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun createexecutionTest(functions: Functions) {
    try {
        val response = functions.createExecution(
                functionId = "[FUNCTION_ID]",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getexecutionTest(functions: Functions) {
    try {
        val response = functions.getExecution(
                functionId = "[FUNCTION_ID]",
                executionId = "[EXECUTION_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun updatetagTest(functions: Functions) {
    try {
        val response = functions.updateTag(
                functionId = "[FUNCTION_ID]",
                tag = "[TAG]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun listtagsTest(functions: Functions) {
    try {
        val response = functions.listTags(
                functionId = "[FUNCTION_ID]",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun createtagTest(functions: Functions) {
    try {
        val response = functions.createTag(
                functionId = "[FUNCTION_ID]",
                command = "[COMMAND]",
                code = File("./path-to-files/image.jpg")
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun gettagTest(functions: Functions) {
    try {
        val response = functions.getTag(
                functionId = "[FUNCTION_ID]",
                tagId = "[TAG_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun deletetagTest(functions: Functions) {
    try {
        val response = functions.deleteTag(
                functionId = "[FUNCTION_ID]",
                tagId = "[TAG_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}








