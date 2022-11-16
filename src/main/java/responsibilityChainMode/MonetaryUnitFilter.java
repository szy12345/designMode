package responsibilityChainMode;

/**
 * 金额单位过滤器
 */
public class MonetaryUnitFilter implements Filter {
    @Override
    public void doFilter(StringBuilder str1, StringBuilder str2, FilterChain filterChain) {
        str1.append("MonetaryUnitFilter");
        filterChain.doFilter(str1,str2);
        str2.append("MonetaryUnitFilter");

    }
}
