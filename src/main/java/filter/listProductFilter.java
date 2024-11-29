package filter;

import abstractDao.FilterService;
import dao.UserRole;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.util.Arrays;

public class listProductFilter extends HttpServlet {
    private FilterService filterService = FilterService.getFilterService();

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Перевіряємо роль користувача перед доступом до сторінки
        filterService.doFilterValidation(request, response, chain, Arrays.asList(UserRole.USER));
    }

    public void init(FilterConfig fConfig) throws ServletException {
    }
}