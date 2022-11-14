package responsibilityChainMode;

/**
 * 特殊字符过滤器
 */
public class SpecialCharFilter implements Filter{
    @Override
    public String doFilter(String str) {
        str = str.replace("<","【");
        return str.replace(">","】");

    }
}
