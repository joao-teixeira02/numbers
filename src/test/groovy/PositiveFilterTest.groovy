import com.aor.numbers.PositiveFilter
import spock.lang.Specification

class PositiveFilterTest extends Specification {
    def 'filter test' (n , bool) {
        given:
        def f1 = new PositiveFilter()
        expect:
        f1.accept(n)==bool
        where:
        n | bool
        -1 | false
        2 | true
        0 | false
        20 | true
    }
}