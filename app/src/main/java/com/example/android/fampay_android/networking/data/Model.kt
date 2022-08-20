package com.example.android.fampay_android.networking.data

data class Response(val card_groups: List<CardGroup> = listOf())

data class CardGroup(val id: Int,
                     val name: String,
                     val design_type: String,
                     val cards: List<Cards> = listOf(),
                     val is_scrollable: Boolean,
                     val height: Int,               // optional
                     val card_type: Int,            // optional
                     val level: Int                 // optional
)

data class Cards(val name: String = "name",
                 val title: String = "title",
                 val formatted_title: FormattedText,
                 val description: String = "description",
                 val formatted_description: FormattedText,
                 val icon: ImageDetails,
                 val url: String = "url",
                 val is_disabled: Boolean,
                 val bg_image: ImageDetails,
                 val bg_color: String = "bg_color",
                 val cta: List<CTA>
)

data class FormattedText(val text: String, val align: String, val entities: List<String>)

data class ImageDetails(val image_type: String, val image_url: String, val aspect_ratio: Float)

data class CTA(val text: String, val bg_color: String, val url_choice: String, val url: String)