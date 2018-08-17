package com.zk.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zengkai
 * @Description:
 * @date 2018/8/16 17:59
 */
@Component
public class MyFilter extends ZuulFilter {

    private static final Logger log = LoggerFactory.getLogger(MyFilter.class);
    /**
     *  filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     *  pre：路由之前
     *  routing：路由之时
     *  post： 路由之后
     *  error：发送错误调用
     **/
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     *  过滤的顺序 0是最高优先级即最先执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     *  是否需要执行过滤。true会执行run函数，false不执行run函数
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     *  过滤器的具体逻辑。可以很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;
    }
}
