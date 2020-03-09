import Note.*
import Quality.*
import org.junit.jupiter.api.Test

class MajorSixthChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, E, G, A)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F_SHARP, A, B)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G_SHARP, B, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, E)
    }

    @Test
    fun resolveInKeyOfF() {
        val notes = listOf(F, A, C, D)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, F)
    }

    @Test
    fun resolveInKeyOfG() {
        val notes = listOf(G, B, D, E)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, G)
    }

    @Test
    fun resolveInKeyOfA() {
        val notes = listOf(A, C_SHARP, E, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, A)
    }

    @Test
    fun resolveInKeyOfB() {
        val notes = listOf(B, D_SHARP, F_SHARP, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajorSixth(chord, B)
    }

    private fun assertMajorSixth(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, MAJOR_SIXTH)
    }
}