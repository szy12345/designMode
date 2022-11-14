package responsibilityChainMode;

/**
 * 金额单位过滤器
 */
public class MonetaryUnitFilter implements Filter{
    @Override
    public String doFilter(String str) {
        return str.replace("$","￥");
    }
}
