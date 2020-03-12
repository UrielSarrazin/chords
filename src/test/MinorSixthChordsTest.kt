import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Minor Sixth Chords")
class MinorSixthChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, D_SHARP, G, A)
        val chord = resolve(notes)
        assertMinorSixth(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, F, A, B)
        val chord = resolve(notes)
        assertMinorSixth(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, G, B, C_SHARP)
        val chord = resolve(notes)
        assertMinorSixth(chord, E)
    }

    @Test
    fun KeyOfF() {
        val notes = listOf(F, G_SHARP, C, D)
        val chord = resolve(notes)
        assertMinorSixth(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, A_SHARP, D, E)
        val chord = resolve(notes)
        assertMinorSixth(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, C, E, F_SHARP)
        val chord = resolve(notes)
        assertMinorSixth(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, D, F_SHARP, G_SHARP)
        val chord = resolve(notes)
        assertMinorSixth(chord, B)
    }

    private fun assertMinorSixth(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, MINOR_SIXTH)
    }
}