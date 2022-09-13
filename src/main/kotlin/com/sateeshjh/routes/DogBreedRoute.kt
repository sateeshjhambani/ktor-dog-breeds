package com.sateeshjh.routes

import com.sateeshjh.data.model.DogBreed
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.0.114:8080"
private val dogBreeds = listOf(
    DogBreed("Alaskan Husky", "Alaskan Huskies aren’t as famous as Siberian Huskies, " +
            "but they are also strong sled dogs well-equipped for cold weather.", "$BASE_URL/dogBreeds/alaskan_husky.jpg"),
    DogBreed("Border Collie", "Border Collies are British herding dogs with intense, alert personalities. " +
            "These smart dogs need a lot of activity and do well in dog competitions.", "$BASE_URL/dogBreeds/border_collie.jpg"),
    DogBreed("Golden Retriever", "Intelligent, kind, and patient, Golden Retrievers are one of the most popular breeds " +
            "for families with kids. These sweet dogs are loyal and hardworking.", "$BASE_URL/dogBreeds/golden_retriever.jpg"),
    DogBreed("Labrador", "Labrador Retrievers are popular all over the world as working dogs and companions. " +
            "These dogs love water and are loyal and devoted.", "$BASE_URL/dogBreeds/labrador.jpg"),
    DogBreed("Samoyed", "The Samoyed is a breed of medium-sized herding dogs with thick, white, double-layer coats. " +
            "They are a spitz-type dog which takes its name from the Samoyedic peoples of Siberia.", "$BASE_URL/dogBreeds/samoyed.jpg"),
    DogBreed("Welsh Corgi", "Cardigan Welsh Corgis have long, low bodies, short legs, and long tails. " +
            "They’re intelligent, loyal, and active dogs.", "$BASE_URL/dogBreeds/welsh_corgi.jpg")
)

fun Route.randomBreed() {
    get("/randomBreed") {
        call.respond(
            HttpStatusCode.OK,
            dogBreeds.random()
        )
    }
}