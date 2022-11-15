package responsibilityChainMode;

/**
 * 特殊字符过滤器
 */
public class SpecialCharFilter implements Filter {
    @Override
    public void doFilter(StringBuilder str1, StringBuilder str2, FilterChain filterChain) {
        str1.append("SpecialCharFilter");
        str2.append("SpecialCharFilter");

    }
}
