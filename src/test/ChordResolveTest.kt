import Note.*
import Quality.*
import kotlin.test.Test
import kotlin.test.assertFailsWith
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
    fun resolveCDominantSeventhChord() {
        val notes = listOf(C, E, G, B_FLAT)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, C)
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
    fun resolveDDominantSeventhChord() {
        val notes = listOf(D, F_SHARP, A, C)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, D)
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
        assertMinor(chord, E)
    }

    @Test
    fun resolveEDominantSeventhChord() {
        val notes = listOf(E, G_SHARP, B, D)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, E)
    }

    @Test
    fun resolveFMajorChord() {
        val notes = listOf(F, A, C)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, F)
    }

    @Test
    fun resolveFMinorChord() {
        val notes = listOf(F, G_SHARP, C)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, F)
    }

    @Test
    fun resolveFDominantSeventhChord() {
        val notes = listOf(F, A, C, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, F)
    }

    @Test
    fun resolveGMajorChord() {
        val notes = listOf(G, B, D)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, G)
    }

    @Test
    fun resolveGMinorChord() {
        val notes = listOf(G, A_SHARP, D)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, G)
    }

    @Test
    fun resolveGDominantSeventhChord() {
        val notes = listOf(G, B, D, F)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, G)
    }

    @Test
    fun resolveAMajorChord() {
        val notes = listOf(A, C_SHARP, E)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, A)
    }

    @Test
    fun resolveAMinorChord() {
        val notes = listOf(A, C, E)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, A)
    }

    @Test
    fun resolveADominantSeventhChord() {
        val notes = listOf(A, C_SHARP, E, G)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, A)
    }

    @Test
    fun resolveBMajorChord() {
        val notes = listOf(B, D_SHARP, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMajor(chord, B)
    }

    @Test
    fun resolveBMinorChord() {
        val notes = listOf(B, D, F_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertMinor(chord, B)
    }

    @Test
    fun resolveBDominantSeventhChord() {
        val notes = listOf(B, D_SHARP, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, B)
    }

    @Test
    fun unknownChordThrowException() {
        val notes = listOf(A, B, C)
        assertFailsWith(UnknownChordException::class) {
            ChordResolver().resolve(notes)
        }
    }

    private fun assertMajor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MAJOR)
    }

    private fun assertMinor(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, MINOR)
    }

    private fun assertDominantSeventh(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, DOMINANT_SEVENTH)
    }

    private fun assertTrue(chord: Chord, expectedKey: Note, expectedQuality: Quality) {
        assertTrue { chord.key == expectedKey }
        assertTrue { chord.quality == expectedQuality }
    }
}