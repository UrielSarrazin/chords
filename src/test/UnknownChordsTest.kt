import Note.*
import org.junit.jupiter.api.Test
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