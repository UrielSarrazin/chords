import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Major Sixth Chords")
class MajorSixthChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, E, G, A)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, F_SHARP, A, B)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, G_SHARP, B, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, A, C, D)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, B, D, E)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, C_SHARP, E, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, D_SHARP, F_SHARP, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, B)
    }

    private fun assertMajorSixth(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, MAJOR_SIXTH)
    }
}