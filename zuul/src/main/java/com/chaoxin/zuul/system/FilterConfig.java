package com.chaoxin.zuul.system;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

@Component
public class FilterConfig extends ZuulFilter {

    /**
     * 声明过滤器类型
     * @return
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }


    /**
     * 多个过滤器执行顺序,值越小,越早执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     *  true: 执行下边的run方法
     *  false:不执行run方法
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 拦截器具体业务实现方法
     * 模拟登陆的token验证
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        /**
         * 获取request对象
         */
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        String token = request.getParameter("token");
        if(token==null){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(200);
            HttpServletResponse response = requestContext.getResponse();
            response.setCharacterEncoding("utf-8");
            try {
                response.getWriter().print("dsfagasfadfgsgfsherdfhs");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;

    }
}