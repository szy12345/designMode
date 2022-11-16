package responsibilityChainMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public class FilterChain {
    private int index = -1;

    private List<Filter> filterList = new ArrayList<>();

    public FilterChain addFilter(Filter filter){
        this.filterList.add(filter);
        return this;
    }

    public void doFilter(StringBuilder str1,StringBuilder str2){
        index++;
        if(this.index < this.filterList.size()){
            this.filterList.get(index).doFilter(str1,str2,this);
        }

    }

}
