package models.items

import models.itemSubClasses.ImageURIs

data class Card (
        val id: String,

        val ingestorId: String,
        val manaCost: String,
        val loyalty: String,
        val name: String,
        val power: String,
        val toughness: String,
        val oracleText: String,
        val typeLine: String,
        val setName: String,
        val imageURIs: ImageURIs
)