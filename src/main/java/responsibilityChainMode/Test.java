package responsibilityChainMode;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        String str = "<好消息>黄金只卖70$，而且我们007营业";
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new SensitiveFilter())
                .addFilter(new SpecialCharFilter())
                .addFilter(new MonetaryUnitFilter());
        str = filterChain.doFilter(str);
        System.out.println(str);
    }
}
