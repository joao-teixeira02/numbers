import com.aor.numbers.ListFilterer
import spock.lang.Specification
import com.aor.numbers.GenericListFilter

class ListFiltererTest extends Specification{
    def 'filter1'() {
        given:
        def filter = Mock(GenericListFilter.class)
        filter.accept(-10) >> true
        filter.accept(3) >> false
        filter.accept(-2) >> true
        filter.accept(4) >> false
        when:
        def filterer = new ListFilterer(filter);
        then:
        Arrays.asList(-10, -2) == filterer.filter(Arrays.asList(-10, 3, -2, 4))
    }
}
