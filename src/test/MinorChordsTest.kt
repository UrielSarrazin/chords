import Note.*
import Quality.*
import kotlin.test.Test

class MinorChordsTest {
    @Test
    fun resolveCMinorChord() {
        val notes = listOf(C, D_SHARP, G)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, C)
    }

    @Test
    fun resolveDMinorChord() {
        val notes = listOf(D, F, A)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, D)
    }

    @Test
    fun resolveEMinorChord() {
        val notes = listOf(E, G, B)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, E)
    }

    @Test
    fun resolveFMinorChord() {
        val notes = listOf(F, G_SHARP, C)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, F)
    }

    @Test
    fun resolveGMinorChord() {
        val notes = listOf(G, A_SHARP, D)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, G)
    }

    @Test
    fun resolveAMinorChord() {
        val notes = listOf(A, C, E)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, A)
    }

    @Test
    fun resolveBMinorChord() {
        val notes = listOf(B, D, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, B)
    }

    private fun assertMinor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MINOR)
    }
}