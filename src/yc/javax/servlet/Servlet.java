package yc.javax.servlet;


/**
 * 一个servlet接口，作用：规范servlet生命周期
 * 
 */
public interface Servlet {

	public void init();

	public void service(ServletRequest request, ServletResponse response);
	
	public void destroy();

	

}
