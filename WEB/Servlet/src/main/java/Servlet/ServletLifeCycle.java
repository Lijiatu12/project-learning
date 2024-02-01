    package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


/*  Servlet生命周期
实例化：第一次访问servlet时，创建servlet对象
初始化：调用init方法，只会执行一次              构造完毕
接收请求  处理请求：调用service方法，执行多次   每次请求都会执行
销毁：调用destroy方法，只会执行一次              关闭服务




Servlet在tomcat中是单例的，成员变量在多个线程中共享，所以不要在servlet中修改成员变量，容易出现线程安全问题

线程锁：synchronized   有安全 但是效率低
        lock          无安全 但是效率高


load-on-startup： 方便进行实例化与初始化  重新看


default-servlet:  tomcat中的一个servlet，用来处理静态资源的，当请求的资源不存在时，会返回404页面




Servlet继承结构
Servlet顶级接口:
    init(ServletConfig config)  初始化方法  tomcat自动调用

    service(ServletRequest req, ServletResponse res)  处理请求的方法

    destroy()  销毁方法

    getServletConfig()          获取ServletConfig对象的

    getServletInfo() 返回Servlet字符串描述信息


   GenericsServlet 抽象的类  除了service
   public abstract class GenericServlet extends Object implements Servlet, ServletConfig, Serializable{

   //tomcat调用init方法时，会将ServletConfig对象传递进来
    public void init(ServletConfig config) throws ServletException {
          this.config = config;
          //重载无参的init方法
          this.init();
     }

     //重载的初始化方法，子类可以重写
     public void init() throws ServletException {
     }


   }


HTTPServlet 抽象的类  侧重于处理http协议的请求 (Servlet方法的处理)

public abstract class HttpServlet extends GenericsServlet{


//参数的父传子
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest request;
        HttpServletResponse response;
        try {
            request = (HttpServletRequest)req;
            response = (HttpServletResponse)res;
        } catch (ClassCastException var6) {
            throw new ServletException("non-HTTP request or response");
        }

        this.service(request, response);
    }




//获取请求的方式
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();
        long lastModified;
        if (method.equals("GET")) {
            lastModified = this.getLastModified(req);
            if (lastModified == -1L) {
                this.doGet(req, resp);
            } else {
                long ifModifiedSince = req.getDateHeader("If-Modified-Since");
                if (ifModifiedSince < lastModified) {
                    this.maybeSetLastModified(resp, lastModified);
                    this.doGet(req, resp);
                } else {
                    resp.setStatus(304);
                }
            }
        } else if (method.equals("HEAD")) {
            lastModified = this.getLastModified(req);
            this.maybeSetLastModified(resp, lastModified);
            this.doHead(req, resp);
        } else if (method.equals("POST")) {
            this.doPost(req, resp);
        } else if (method.equals("PUT")) {
            this.doPut(req, resp);
        } else if (method.equals("DELETE")) {
            this.doDelete(req, resp);
        } else if (method.equals("OPTIONS")) {
            this.doOptions(req, resp);
        } else if (method.equals("TRACE")) {
            this.doTrace(req, resp);
        } else {
            String errMsg = lStrings.getString("http.method_not_implemented");
            Object[] errArgs = new Object[]{method};
            errMsg = MessageFormat.format(errMsg, errArgs);
            resp.sendError(501, errMsg);
        }

    }

    }


自定义Servlet方法
class MyServlet extends HttpServlet{

    //重写doGet方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyServlet.doGet被执行了");
    }

    //重写doPost方法
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyServlet.doPost被执行了");
    }



重新看？
直接重写service也没有什么问题
后续使用SpringMVC，无需继承HttpServlet，无需do......，直接实现Controller接口即可
如果doget和dopost方法中的代码一样，直接让其中一个去调用另一个即可




ServletConfig对象
    getInitParameter(String name)  获取初始化参数
    getInitParameterNames()  获取所有初始化参数的名字
    getServletContext()  获取ServletContext对象
    getServletName()  获取servlet的名字


    ServletContext对象
    getInitParameter(String name)  获取初始化参数
    getInitParameterNames()  获取所有初始化参数的名字
    getServletContext()  获取ServletContext对象
    getServletName()  获取servlet的名字


    getRealPath(String path)  获取web目录下的资源的绝对路径





HttpServletRequest
    获取请求头数据
    获取请求行数据
    获取用户数据
    其他功能

 */

public class ServletLifeCycle extends HttpServlet {

    //构造器
    public ServletLifeCycle(){
        System.out.println("ServletLifeCycle构造器被执行了");
    }

    //重写init方法
    @Override
    public void init() throws ServletException {
        System.out.println("ServletLifeCycle.init被执行了");
    }


    //重写service方法
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ServletLifeCycle.service被执行了");
    }

    //重写destroy方法
    @Override
    public void destroy() {
        System.out.println("ServletLifeCycle.destroy被执行了");
    }


}
