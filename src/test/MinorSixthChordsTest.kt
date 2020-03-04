import Note.*
import Quality.*
import kotlin.test.Test

class MinorSixthChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, D_SHARP, G, A)
        val chord = ChordResolver().resolve(notes)
        assertMinorSixth(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F, A, B)
        val chord = ChordResolver().resolve(notes)
        assertMinorSixth(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G, B, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSixth(chord, E)
    }

    @Test
    fun resolveInKeyOfF() {
        val notes = listOf(F, G_SHARP, C, D)
        val chord = ChordResolver().resolve(notes)
        assertMinorSixth(chord, F)
    }

    @Test
    fun resolveInKeyOfG() {
        val notes = listOf(G, A_SHARP, D, E)
        val chord = ChordResolver().resolve(notes)
        assertMinorSixth(chord, G)
    }

    @Test
    fun resolveInKeyOfA() {
        val notes = listOf(A, C, E, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSixth(chord, A)
    }

    @Test
    fun resolveInKeyOfB() {
        val notes = listOf(B, D, F_SHARP, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSixth(chord, B)
    }

    private fun assertMinorSixth(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MINOR_SIXTH)
    }
}