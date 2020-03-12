import Note.*
import Quality.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@DisplayName("Major Chords")
class MajorChordsTest {

    @Nested
    @DisplayName("From notes")
    inner class FromNotes {
        @Test
        fun keyOfC() {
            val notes = listOf(C, E, G)
            val chord = ChordResolver().resolve(notes)
            assertMajor(chord, C)
        }

        @Test
        fun keyOfD() {
            val notes = listOf(D, F_SHARP, A)
            val chord = ChordResolver().resolve(notes)
            assertMajor(chord, D)
        }

        @Test
        fun keyOfE() {
            val notes = listOf(E, G_SHARP, B)
            val chord = ChordResolver().resolve(notes)
            assertMajor(chord, E)
        }

        @Test
        fun keyOfF() {
            val notes = listOf(F, A, C)
            val chord = ChordResolver().resolve(notes)
            assertMajor(chord, F)
        }

        @Test
        fun keyOfG() {
            val notes = listOf(G, B, D)
            val chord = ChordResolver().resolve(notes)
            assertMajor(chord, G)
        }

        @Test
        fun keyOfA() {
            val notes = listOf(A, C_SHARP, E)
            val chord = ChordResolver().resolve(notes)
            assertMajor(chord, A)
        }

        @Test
        fun keyOfB() {
            val notes = listOf(B, D_SHARP, F_SHARP)
            val chord = ChordResolver().resolve(notes)
            assertMajor(chord, B)
        }

        private fun assertMajor(chord: Chord, expectedKey: Note) {
            assertChordEquals(chord, expectedKey, MAJOR)
        }
    }

    @Nested
    @DisplayName("From key & quality")
    inner class FromKeyAndQuality {
        @Test
        fun keyOfC() {
            val key = C
            val quality = MAJOR
            val notes = ChordResolver().resolve(key, quality)
            assertEquals(listOf(C, E, G), notes)
        }

        @Test
        fun keyOfD() {
            val key = D
            val quality = MAJOR
            val notes = ChordResolver().resolve(key, quality)
            assertEquals(listOf(D, F_SHARP, A), notes)
        }
    }
}