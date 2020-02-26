import Note.*
import Quality.MAJOR
import Quality.MINOR
import kotlin.test.Test
import kotlin.test.assertTrue

class ChordResolveTest {
    @Test
    fun resolveCMajorChord() {
        val notes = listOf(C, E, G)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, C)
    }

    @Test
    fun resolveCMinorChord() {
        val notes = listOf(C, D_SHARP, G)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, C)
    }

    @Test
    fun resolveDMajorChord() {
        val notes = listOf(D, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, D)
    }

    @Test
    fun resolveDMinorChord() {
        val notes = listOf(D, F, A)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, D)
    }

    @Test
    fun resolveEMajorChord() {
        val notes = listOf(E, G_SHARP, B)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, E)
    }

    @Test
    fun resolveEMinorChord() {
        val notes = listOf(E, G, B)
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
        assertMinor(chord, G)
    }

    private fun assertMajor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MAJOR)
    }

    private fun assertMinor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MINOR)
    }

    private fun assertTrue(chord: Chord, expectedKey: Note, expectedQuality: Quality) {
        assertTrue { chord.key == expectedKey }
        assertTrue { chord.quality == expectedQuality }
    }
}