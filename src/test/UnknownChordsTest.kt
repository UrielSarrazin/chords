import Note.*
import kotlin.test.Test
import kotlin.test.assertFailsWith

class UnknownChordsTest {
    @Test
    fun unknownChordThrowException() {
        val notes = listOf(A, B, C)
        assertFailsWith(UnknownIntervalException::class) {
            ChordResolver().resolve(notes)
        }
    }
}