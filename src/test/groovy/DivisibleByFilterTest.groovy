import com.aor.numbers.DivisibleByFilter
import spock.lang.Specification

class DivisibleByFilterTest extends Specification {
    def "filter of 3"(n, bool) {
        given:
        def f1 = new DivisibleByFilter(3)
        def f2 = new DivisibleByFilter(2)
        expect:
        f1.accept(n)==bool
        where:
        n | bool
        9 | true
        -12 | true
        20 | false
    }
    def "filter of 2"(n , bool) {
        given:
        def f2 = new DivisibleByFilter(2)
        expect:
        f2.accept(n)==bool
        where:
        n | bool
        8 | true
        -20 | true
        15 | false
    }
}
