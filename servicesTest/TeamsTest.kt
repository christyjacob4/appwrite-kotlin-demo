package io.appwrite.servicesTest

import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Teams
import javax.xml.bind.DatatypeConverter.parseString
import java.io.File


suspend fun main() {
    val client = Client()
        .setProject("6062f9c2c09ce")
        .setEndpoint("https://demo.appwrite.io/v1")
        .setKey("d117e5f8b27d1a543d9080e6289f434b8687a1666737ad77a76907ecfabcffec682fdcea0f073729690263675e814485bf1788ce65ba51cc1c90e3de597cdb95bfb0fd2c8d8d207dc07ab1a112feb167d389cf047fc4e46f99e47ae0b0beb1c3787610154daea5c1fa493013e62239ef6cfd63cf02c8d9b63c0e48bf4bdf3bb4")

    val teams = Teams(client)

    listTest(teams)
    createTest(teams)
    getTest(teams)
    updateTest(teams)
    deleteTest(teams)
    getmembershipsTest(teams)
    createmembershipTest(teams)
    updatemembershiprolesTest(teams)
    deletemembershipTest(teams)
    updatemembershipstatusTest(teams)

}

suspend fun listTest(teams: Teams) {
    try {
        val response = teams.list(
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun createTest(teams: Teams) {
    try {
        val response = teams.create(
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
suspend fun getTest(teams: Teams) {
    try {
        val response = teams.get(
                teamId = "[TEAM_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun updateTest(teams: Teams) {
    try {
        val response = teams.update(
                teamId = "[TEAM_ID]",
                name = "[NAME]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun deleteTest(teams: Teams) {
    try {
        val response = teams.delete(
                teamId = "[TEAM_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun getmembershipsTest(teams: Teams) {
    try {
        val response = teams.getMemberships(
                teamId = "[TEAM_ID]",
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun createmembershipTest(teams: Teams) {
    try {
        val response = teams.createMembership(
                teamId = "[TEAM_ID]",
                email = "email@example.com",
                roles = listOf(),
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
suspend fun updatemembershiprolesTest(teams: Teams) {
    try {
        val response = teams.updateMembershipRoles(
                teamId = "[TEAM_ID]",
                membershipId = "[MEMBERSHIP_ID]",
                roles = listOf()
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun deletemembershipTest(teams: Teams) {
    try {
        val response = teams.deleteMembership(
                teamId = "[TEAM_ID]",
                membershipId = "[MEMBERSHIP_ID]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}
suspend fun updatemembershipstatusTest(teams: Teams) {
    try {
        val response = teams.updateMembershipStatus(
                teamId = "[TEAM_ID]",
                membershipId = "[MEMBERSHIP_ID]",
                userId = "[USER_ID]",
                secret = "[SECRET]"
        )
        var jsonString = response.body?.string() ?: ""
        val gson = GsonBuilder().setPrettyPrinting().create()
        val je: JsonElement = JsonParser().parse(jsonString)
        println(gson.toJson(je))
    } catch (e: AppwriteException) {
        println(e)
    }
}








