package all;

import javax.servlet.http.HttpServlet;


@SuppressWarnings("deprecation")
public class AllDefects extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = -552992659306097501L;

    public final static String[] str = new String[] {};/* BUG */

    String retNull() {
        return null;
    }
}
    
