package responsibilityChainMode;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * 过滤器接口
 */
public interface Filter {
    void doFilter(StringBuilder str1,StringBuilder str2,FilterChain filterChain);

}
