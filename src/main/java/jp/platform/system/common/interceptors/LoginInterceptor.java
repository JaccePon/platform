package jp.platform.system.common.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import jp.platform.system.util.Const;

/**
 */
@Repository
public class LoginInterceptor extends HandlerInterceptorAdapter {
  private static final String[] NO_FILTERS = new String[] {
      "/login",
      "/js/",
      "/images/",
      "/css/",
      "/font/",
      "/skins/",
      "/code",
  };

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    String uri = request.getRequestURI();
    
    for (String noFilter : NO_FILTERS) {
      if (uri.startsWith(noFilter)) {
        return true;
      }
    }

    if (request.getSession().getAttribute(Const.SESSION_USERNAME) == null) {
      response.sendRedirect("/login");
      return false;
    }

    return true;
  }
}
