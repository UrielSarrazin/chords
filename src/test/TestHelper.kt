import kotlin.test.assertEquals

fun assertChordEquals(chord: Chord, expectedKey: Note, expectedQuality: Quality) {
    assertKeyEquals(expectedKey, chord)
    assertQualityEquals(expectedQuality, chord)
}

private fun assertQualityEquals(expectedQuality: Quality, chord: Chord)  = assertEquals(expectedQuality, chord.quality)

private fun assertKeyEquals(expectedKey: Note, chord: Chord) = assertEquals(expectedKey, chord.key)
