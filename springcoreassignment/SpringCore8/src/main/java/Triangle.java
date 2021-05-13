import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean,DisposableBean {
	private Point X;
	private Point Y;
	private Point Z;
	
	
	public Point getX() {
		return X;
	}
	public void setX(Point x) {
		X = x;
	}
	public Point getY() {
		return Y;
	}
	public void setY(Point y) {
		Y = y;
	}
	public Point getZ() {
		return Z;
	}
	public void setZ(Point z) {
		Z = z;
	}
	
	public void output() {
		System.out.println("Drawing Triangle");
		System.out.println("Point X (" +this.getX().getA()+ "," +this.getX().getB()+ ")");
		System.out.println("Point Y (" +this.getY().getA()+ "," +this.getY().getB()+ ")");
		System.out.println("Point Z (" +this.getZ().getA()+ "," +this.getZ().getB()+ ")");

	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Intializing Bean Interface of triangle class is called.");
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Disposable Bean Interface of triangle class is called.");
	}
	
	public void beforeInitlization() {
		System.out.println("Method Called Before Intialization");
	}
	
	public void afterInitlization() {
		System.out.println("Method Called Before Destroying");
	}
	
	

}
