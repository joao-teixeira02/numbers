import com.aor.numbers.GenericListSorter
import com.aor.numbers.ListDeduplicator
import spock.lang.Specification

class ListDeduplicatorTest extends Specification{
    private def list

    def 'Testing deduplicate bug 8726'() {
        given:
        list = Arrays.asList(1,2,4,2)
        def sorter = Mock(GenericListSorter.class)
        def deduplicator = new ListDeduplicator(sorter)
        sorter.sort(list) >> Arrays.asList(1, 2, 2, 4)
        when:
        def distinct = deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2))
        then:
        distinct == Arrays.asList(1, 2, 4)
    }
}
