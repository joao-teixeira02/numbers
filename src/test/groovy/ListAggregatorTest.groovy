import com.aor.numbers.GenericListDeduplicator
import com.aor.numbers.ListAggregator
import com.aor.numbers.ListDeduplicator
import spock.lang.Specification

class ListAggregatorTest extends Specification{
    private def list
    def setup() {
        list = Arrays.asList(1,2,4,2,5)
    }
    def 'bug 8726' () {
        given:
        def deduplicator = Mock(GenericListDeduplicator)
        def aggregator = new ListAggregator()
        deduplicator.deduplicate(_) >> Arrays.asList(1, 2, 4)
        when:
        def n_distinct = aggregator.distinct(Arrays.asList(1, 2, 4, 2), deduplicator)
        then:
        n_distinct == 3
    }
    def 'sum test'() {
        given:
        def aggregator = new ListAggregator()
        when:
        def sum = aggregator.sum(list);
        then:
        sum == 14
    }
    def 'max test'() {
        given:
        def aggregator = new ListAggregator()
        when:
        def max = aggregator.max(list);
        then:
        max == 5
    }
    def 'min test'() {
        given:
        def aggregator = new ListAggregator()
        when:
        def min = aggregator.min(list);
        then:
        min == 1
    }
    def 'distinct test'() {
        given:
        def aggregator = new ListAggregator()
        def deduplicator = new ListDeduplicator()
        when:
        def distinct = aggregator.distinct(list, deduplicator);
        then:
        distinct == 4
    }
}
