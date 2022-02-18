package eu.kanade.tachiyomi.extension.all.madaraunofficial

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.SourceFactory

class MadaraFactory : SourceFactory {
    override fun createSources(): List<Source> = listOf(
        Mangastk(),
        MangaWOW(),
        AhStudios(),
        KnightNoScanlation(),
        Skymanga(),
    )
}

class AhStudios : Madara("AhStudios", "https://ahstudios.net", "es")

class Mangastk : Madara("Mangastk", "https://mangastk.com", "es")

class MangaWOW : Madara("MangaWOW", "https://mangawow.com", "tr")

class KnightNoScanlation : Madara("Knight no Scanlation", "https://knightnoscanlation.com", "es")

class Skymanga : Madara("Skymanga", "https://skymanga.co", "en")
