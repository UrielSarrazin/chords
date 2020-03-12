import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Minor Chords")
class MinorChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, D_SHARP, G)
        val chord = resolve(notes)
        assertMinor(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, F, A)
        val chord = resolve(notes)
        assertMinor(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, G, B)
        val chord = resolve(notes)
        assertMinor(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, G_SHARP, C)
        val chord = resolve(notes)
        assertMinor(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, A_SHARP, D)
        val chord = resolve(notes)
        assertMinor(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, C, E)
        val chord = resolve(notes)
        assertMinor(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, D, F_SHARP)
        val chord = resolve(notes)
        assertMinor(chord, B)
    }

    private fun assertMinor(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, MINOR)
    }
}