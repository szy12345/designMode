package responsibilityChainMode;

/**
 * 敏感词顾虑器
 */
public class SensitiveFilter implements Filter{
    @Override
    public String doFilter(String str) {
        return str.replace("007","996");
    }
}
