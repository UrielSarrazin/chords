import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Augmented Chords")
class AugmentedChordsTest {
    @Test
    fun keyOfC() {
        val notes = listOf(C, E, G_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, C)
    }

    @Test
    fun keyOfD() {
        val notes = listOf(D, F_SHARP, A_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, D)
    }

    @Test
    fun keyOfE() {
        val notes = listOf(E, G_SHARP, C)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, E)
    }

    @Test
    fun keyOfF() {
        val notes = listOf(F, A, C_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, F)
    }

    @Test
    fun keyOfG() {
        val notes = listOf(G, B, D_SHARP)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, G)
    }

    @Test
    fun keyOfA() {
        val notes = listOf(A, C_SHARP, F)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, A)
    }

    @Test
    fun keyOfB() {
        val notes = listOf(B, D_SHARP, G)
        val chord = ChordResolver().resolve(notes)
        assertAugmented(chord, B)
    }

    private fun assertAugmented(chord: Chord, expectedKey: Note) {
        assertChordEquals(chord, expectedKey, AUGMENTED)
    }
}