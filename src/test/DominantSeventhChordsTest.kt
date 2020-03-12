import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Dominant Seventh Chords")
class DominantSeventhChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, E, G, B_FLAT)
        val chord = resolve(notes)
        assertDominantSeventh(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, F_SHARP, A, C)
        val chord = resolve(notes)
        assertDominantSeventh(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, G_SHARP, B, D)
        val chord = resolve(notes)
        assertDominantSeventh(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, A, C, D_SHARP)
        val chord = resolve(notes)
        assertDominantSeventh(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, B, D, F)
        val chord = resolve(notes)
        assertDominantSeventh(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, C_SHARP, E, G)
        val chord = resolve(notes)
        assertDominantSeventh(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, D_SHARP, F_SHARP, A)
        val chord = resolve(notes)
        assertDominantSeventh(chord, B)
    }

    private fun assertDominantSeventh(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, DOMINANT_SEVENTH)
    }
}