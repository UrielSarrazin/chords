import Note.*
import Quality.FIFTH
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Fifth Chords")
class FifthChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, G)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, A)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, B)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, C)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, D)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, E)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertFifth(chord, B)
    }

    private fun assertFifth(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, FIFTH)
    }
}