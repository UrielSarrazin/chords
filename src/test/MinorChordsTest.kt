import Note.*
import Quality.*
import kotlin.test.Test

class MinorChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, D_SHARP, G)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F, A)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G, B)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, G_SHARP, C)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, A_SHARP, D)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, C, E)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, D, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, B)
    }

    private fun assertMinor(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, MINOR)
    }
}