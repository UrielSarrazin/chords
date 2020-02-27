import Note.*
import Quality.*
import kotlin.test.Test

class DominantSeventhChordsTest {
    @Test
    fun resolveCDominantSeventhChord() {
        val notes = listOf(C, E, G, B_FLAT)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, C)
    }

    @Test
    fun resolveDDominantSeventhChord() {
        val notes = listOf(D, F_SHARP, A, C)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, D)
    }

    @Test
    fun resolveEDominantSeventhChord() {
        val notes = listOf(E, G_SHARP, B, D)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, E)
    }

    @Test
    fun resolveFDominantSeventhChord() {
        val notes = listOf(F, A, C, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, F)
    }

    @Test
    fun resolveGDominantSeventhChord() {
        val notes = listOf(G, B, D, F)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, G)
    }

    @Test
    fun resolveADominantSeventhChord() {
        val notes = listOf(A, C_SHARP, E, G)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, A)
    }

    @Test
    fun resolveBDominantSeventhChord() {
        val notes = listOf(B, D_SHARP, F_SHARP, A)
        val chord = ChordResolver().resolve(notes)
        assertDominantSeventh(chord, B)
    }

    private fun assertDominantSeventh(chord: Chord, expectedKey: Note) {
        assertTrue(chord, expectedKey, DOMINANT_SEVENTH)
    }
}