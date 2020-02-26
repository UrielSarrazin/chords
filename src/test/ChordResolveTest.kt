import Note.*
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

    private fun assertMajor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, "major")
    }

    private fun assertMinor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, "minor")
    }

    private fun assertTrue(chord: Chord, expectedKey: Note, expectedQuality: String) {
        assertTrue { chord.key == expectedKey }
        assertTrue { chord.quality == expectedQuality }
    }
}