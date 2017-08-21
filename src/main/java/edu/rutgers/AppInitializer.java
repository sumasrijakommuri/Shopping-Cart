package edu.rutgers;

import org.springframework.web.servlet.support.*;

/**
 * Created by Srija on 8/21/2017.
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Application.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    protected String[] getServletMappings() {
        return new String[0];
    }
}
