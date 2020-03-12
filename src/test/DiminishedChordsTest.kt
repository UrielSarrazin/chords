import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Diminished Chords")
class DiminishedChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, D_SHARP, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, F, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, G, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, G_SHARP, B)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, A_SHARP, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, C, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, D, F)
        val chord = ChordResolver().resolve(notes)
        assertDiminished(chord, B)
    }

    private fun assertDiminished(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, DIMINISHED)
    }
}