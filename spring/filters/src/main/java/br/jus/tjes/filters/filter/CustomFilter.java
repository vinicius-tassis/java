package br.jus.tjes.filters.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

@Component
@WebFilter("/*")
public class CustomFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization logic, if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        /*
        // Wrap the response to capture the response body
        ResponseWrapper responseWrapper = new ResponseWrapper((HttpServletResponse) response);

        // Proceed with the filter chain
        chain.doFilter(request, responseWrapper);

        // Get the captured response body
        String responseBody = responseWrapper.getBody();
        
        // Print the response body
        System.out.println("Custom Filter");
        System.out.println(responseWrapper.getHeader("Custom-Header"));
        System.out.println(responseWrapper.getContentType());
        */

        ContentCachingResponseWrapper responseCacheWrapperObject = new ContentCachingResponseWrapper((HttpServletResponse) response);
        chain.doFilter(request, responseCacheWrapperObject);

        byte[] responseArray = responseCacheWrapperObject.getContentAsByteArray();
        String responseStr = new String(responseArray, responseCacheWrapperObject.getCharacterEncoding());
        //....use responsestr to make the signature

        responseCacheWrapperObject.copyBodyToResponse();

        System.out.println("Custom Filter");
        System.out.println(responseCacheWrapperObject.getHeader("Custom-Header"));
        System.out.println(responseCacheWrapperObject.getContentType());
        System.out.println(responseStr);
        //System.out.println(responseCacheWrapperObject);

    }

    @Override
    public void destroy() {
        // Cleanup logic, if needed
    }

    private static class ResponseWrapper extends HttpServletResponseWrapper {
        private StringWriter writer;
        private PrintWriter printWriter;

        public ResponseWrapper(HttpServletResponse response) {
            super(response);
            writer = new StringWriter();
            printWriter = new PrintWriter(writer);
        }

        @Override
        public PrintWriter getWriter() throws IOException {
            return printWriter;
        }

        @Override
        public String toString() {
            return writer.toString();
        }

        public String getBody() {
            return writer.toString();
        }
    }
}
