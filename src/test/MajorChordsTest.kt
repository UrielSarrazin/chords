import Note.*
import Quality.*
import kotlin.test.Test

class MajorChordsTest {
    @Test
    fun resolveCMajorChord() {
        val notes = listOf(C, E, G)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, C)
    }

    @Test
    fun resolveDMajorChord() {
        val notes = listOf(D, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, D)
    }

    @Test
    fun resolveEMajorChord() {
        val notes = listOf(E, G_SHARP, B)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, E)
    }

    @Test
    fun resolveFMajorChord() {
        val notes = listOf(F, A, C)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, F)
    }

    @Test
    fun resolveGMajorChord() {
        val notes = listOf(G, B, D)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, G)
    }

    @Test
    fun resolveAMajorChord() {
        val notes = listOf(A, C_SHARP, E)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, A)
    }

    @Test
    fun resolveBMajorChord() {
        val notes = listOf(B, D_SHARP, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, B)
    }

    private fun assertMajor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MAJOR)
    }
}