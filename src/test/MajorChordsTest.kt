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
            val chord = resolve(notes)
            assertMajor(chord, C)
        }

        @Test
        fun keyOfD() {
            val notes = listOf(D, F_SHARP, A)
            val chord = resolve(notes)
            assertMajor(chord, D)
        }

        @Test
        fun keyOfE() {
            val notes = listOf(E, G_SHARP, B)
            val chord = resolve(notes)
            assertMajor(chord, E)
        }

        @Test
        fun keyOfF() {
            val notes = listOf(F, A, C)
            val chord = resolve(notes)
            assertMajor(chord, F)
        }

        @Test
        fun keyOfG() {
            val notes = listOf(G, B, D)
            val chord = resolve(notes)
            assertMajor(chord, G)
        }

        @Test
        fun keyOfA() {
            val notes = listOf(A, C_SHARP, E)
            val chord = resolve(notes)
            assertMajor(chord, A)
        }

        @Test
        fun keyOfB() {
            val notes = listOf(B, D_SHARP, F_SHARP)
            val chord = resolve(notes)
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
            val notes = resolve(key, quality)
            assertEquals(listOf(C, E, G), notes)
        }

        @Test
        fun keyOfD() {
            val key = D
            val quality = MAJOR
            val notes = resolve(key, quality)
            assertEquals(listOf(D, F_SHARP, A), notes)
        }

        @Test
        fun keyOfE() {
            val key = E
            val quality = MAJOR
            val notes = resolve(key, quality)
            assertEquals(listOf(E, G_SHARP, B), notes)
        }

        @Test
        fun keyOfF() {
            val key = F
            val quality = MAJOR
            val notes = resolve(key, quality)
            assertEquals(listOf(F, A, C), notes)
        }

        @Test
        fun keyOfG() {
            val key = G
            val quality = MAJOR
            val notes = resolve(key, quality)
            assertEquals(listOf(G, B, D), notes)
        }

        @Test
        fun keyOfA() {
            val key = A
            val quality = MAJOR
            val notes = resolve(key, quality)
            assertEquals(listOf(A, C_SHARP, E), notes)
        }

        @Test
        fun keyOfB() {
            val key = B
            val quality = MAJOR
            val notes = resolve(key, quality)
            assertEquals(listOf(B, D_SHARP, F_SHARP), notes)
        }
    }
}