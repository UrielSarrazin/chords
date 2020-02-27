import Note.*
import Quality.*
import kotlin.test.Test

class MinorSeventhChordsTest {
    @Test
    fun resolveCMinorChord() {
        val notes = listOf(C, D_SHARP, G, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, C)
    }

    @Test
    fun resolveDMinorChord() {
        val notes = listOf(D, F, A, C)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, D)
    }

    @Test
    fun resolveEMinorChord() {
        val notes = listOf(E, G, B, D)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, E)
    }

    @Test
    fun resolveFMinorChord() {
        val notes = listOf(F, G_SHARP, C, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, F)
    }

    @Test
    fun resolveGMinorChord() {
        val notes = listOf(G, A_SHARP, D, F)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, G)
    }

    @Test
    fun resolveAMinorChord() {
        val notes = listOf(A, C, E, G)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, A)
    }

    @Test
    fun resolveBMinorChord() {
        val notes = listOf(B, D, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertMinorSeventh(chord, B)
    }

    private fun assertMinorSeventh(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MINOR_SEVENTH)
    }
}