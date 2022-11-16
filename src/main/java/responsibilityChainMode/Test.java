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
        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");
        filterChain.doFilter(str1,str2);
        System.out.println("str1:" + str1.toString());
        System.out.println("str2:" + str2.toString());
    }
}
