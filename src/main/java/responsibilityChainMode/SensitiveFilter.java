package responsibilityChainMode;

/**
 * 敏感词顾虑器
 */
public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(StringBuilder str1, StringBuilder str2, FilterChain filterChain) {
        str1.append("SensitiveFilter");
        str2.append("SensitiveFilter");
    }
}
