/*
 * JSP generated by Resin-4.0.23 (built Fri, 30 Sep 2011 09:31:50 PDT)
 */

package _jsp._web_22dinf._jsp._specialsubject;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _addtemplate__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=utf-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string1, 0, _jsp_string1.length);
    _caucho_expr_1.print(out, _jsp_env, false);
    out.write(_jsp_string2, 0, _jsp_string2.length);
    _caucho_expr_2.print(out, _jsp_env, false);
    out.write(_jsp_string3, 0, _jsp_string3.length);
    _caucho_expr_3.print(out, _jsp_env, false);
    out.write(_jsp_string4, 0, _jsp_string4.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -1793038186146849453L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/jsp/specialSubject/addTemplate.jsp"), -8973531078002815357L, false);
    _caucho_depends.add(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jsp/jstl/core");
      manager.addTaglibFunctions(_jsp_functionMap, "fmt", "http://java.sun.com/jsp/jstl/fmt");
      manager.addTaglibFunctions(_jsp_functionMap, "func", "/WEB-INF/func.tld");
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
      _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${template.id }");
      _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${template.tpName }");
      _caucho_expr_2 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${template.tpDesc }");
      _caucho_expr_3 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${template.tpContent }");
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;
  private static com.caucho.el.Expr _caucho_expr_2;
  private static com.caucho.el.Expr _caucho_expr_3;

  private final static char []_jsp_string3;
  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  private final static char []_jsp_string1;
  private final static char []_jsp_string4;
  static {
    _jsp_string3 = "</textarea>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n            	<td style=\"vertical-align:top\">\u6a21\u677f\u5185\u5bb9:</td>\r\n                <td><textarea  cols=\"50\"  rows=\"5\" id=\"tpContnt\" name=\"tpContent\" style=\"width:675px\">".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n<title>\u56e2\u8f66\u7f51\u4e13\u9898\u7ba1\u7406</title>\r\n<script type=\"text/javascript\" src=\"/js/common/jquery.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/common/jquery-ui.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/common/jquery.blockUI.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/common/jquery.tipsy.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/common/validation.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/common/common.js\"></script>\r\n\r\n <!-- ztree ue-->\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/ue/ueditor.config.js\"></script>\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/ue/ueditor.all.min.js\"> </script>\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/js/ztree/ztree.3.5.js\"> </script>\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/js/ztree/jquery.ztree.exhide-3.5.min.js\"> </script>\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/js/ajaxfileupload.js\"> </script>\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/demo.ztree.css\" />\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/zTreeStyle.css\"/>\r\n\r\n<script type=\"text/javascript\" src=\"/js/zixun/zixun.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/specialSubject/specialSubject.js\"></script>\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/demo.ztree.css\" />\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/zTreeStyle.css\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/layout.css\"/>\r\n\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/base.css\" />\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/bootstrap.min.css\" />\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/common.css\" />\r\n<script type=\"text/javascript\" src=\"/js/common/jsdate.js\"></script>\r\n</head>\r\n<body>\r\n	<div id=\"tabs\" class=\"tabs\">  \r\n	<ul>\r\n		<li style=\"background:url(/images/ui-bg_glass_75_e6e6e6_1x400.png) #e6e6e6 repeat-x 50% 50%\" ><a href=\"/specialSubject/tempHome\">\u6a21\u677f\u5217\u8868</a></li>\r\n		<li class=\"tabs_active\" ><a href=\"/specialSubject/toAddTemp\">\u65b0\u5efa\u6a21\u677f</a></li>\r\n	</ul>\r\n</div>\r\n<form action=\"/specialSubject/addTemplate\" method=\"post\" style=\"padding:0 10px 0 10px; margin-top:0px\" name=\"zixun\" id=\"newTemplateForm\">\r\n	<div class=\"borderDiv\">\r\n		<table>\r\n            <tr class=\"lh28\">\r\n            	<input id=\"id\" type=\"hidden\" name=\"id\" value=\"".toCharArray();
    _jsp_string2 = "\" style=\"width:675px;\"/><span style=\"color:red;\">*</span>(40\u5b57\u4ee5\u5185)\r\n                </td>\r\n            </tr>\r\n             <tr class=\"lh28\">\r\n            	<td style=\"vertical-align:top\">\u6a21\u677f\u63cf\u8ff0:</td>\r\n                <td><textarea maxlength=\"250\" cols=\"50\"  rows=\"3\" id=\"tpDesc\" name=\"tpDesc\" style=\"width:675px\">".toCharArray();
    _jsp_string1 = "\"/>\r\n            	<td class=\"ti\" style=\"vertical-align:top\">\u6a21\u677f\u540d\u79f0:</td>\r\n                <td><input maxlength=\"44\" type=\"text\"  id=\"tpName\" name=\"tpName\" value=\"".toCharArray();
    _jsp_string4 = "</textarea><span style=\"color:red;\">*</span>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n	</div>\r\n	<div class=\"xtnext\">\r\n		<input id=\"newTemplateBtn\" type=\"button\" value=\"\u4fdd\u5b58\"/>\r\n	</div>\r\n</form>\r\n\r\n<div id=\"menuContent\" style=\"display:none; position: absolute;\" >\r\n	<ul id=\"treeCity\" class=\"ztree\"  ></ul>\r\n</div>\r\n\r\n<div id=\"menuContentClass\" style=\"display:none; position: absolute;\" >\r\n	<ul id=\"treeClass\" class=\"ztree\"  ></ul>\r\n</div>\r\n<div id=\"menuContentselectCarStyle\" style=\"display:none; position: absolute;\" >\r\n	<ul id=\"treeselectCarStyle\" class=\"ztree\"  ></ul>\r\n</div>\r\n</body>\r\n</html>".toCharArray();
  }
}
