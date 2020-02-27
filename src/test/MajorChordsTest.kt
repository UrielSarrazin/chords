import Note.*
import Quality.*
import kotlin.test.Test

class MajorChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, E, G)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G_SHARP, B)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, A, C)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, B, D)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, C_SHARP, E)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, D_SHARP, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, B)
    }

    private fun assertMajor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MAJOR)
    }
}