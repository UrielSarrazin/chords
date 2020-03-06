import Note.*
import Quality.*
import kotlin.test.Test

class AugmentedChordsTest {
    @Test
    fun resolveInkeyOfC() {
        val notes = listOf(C, E, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, C)
    }

    @Test
    fun resolveInkeyOfD() {
        val notes = listOf(D, F_SHARP, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, D)
    }

    @Test
    fun resolveInkeyOfE() {
        val notes = listOf(E, G_SHARP, C)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, E)
    }

    @Test
    fun resolveInkeyOfF() {
        val notes = listOf(F, A, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, F)
    }

    @Test
    fun resolveInkeyOfG() {
        val notes = listOf(G, B, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, G)
    }

    @Test
    fun resolveInkeyOfA() {
        val notes = listOf(A, C_SHARP, F)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, A)
    }

    @Test
    fun resolveInkeyOfB() {
        val notes = listOf(B, D_SHARP, G)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, B)
    }

    private fun assertAugmented(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, AUGMENTED)
    }
}