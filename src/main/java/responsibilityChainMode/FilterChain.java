package responsibilityChainMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public class FilterChain {

    private List<Filter> filterList = new ArrayList<>();

    public FilterChain addFilter(Filter filter){
        this.filterList.add(filter);
        return this;
    }

    public String doFilter(String str){
        for(Filter filter:filterList){
            str = filter.doFilter(str);
        }
        return str;
    }

}
