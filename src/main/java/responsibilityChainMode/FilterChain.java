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

    public void doFilter(StringBuilder str1,StringBuilder str2,int idex){
        this.filterList.get(idex).doFilter(str1,str2,this);
        System.out.println("str1:"+str1.toString());
        System.out.println("str2:"+str2.toString());

    }

}
