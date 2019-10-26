import java.lang.Math;

public class Triangle {
public
double a,b,c,d,e,f;
	Triangle(double q,double w,double r,double t,double y,double u){
		a=q;
		b=w;
		c=r;
		d=t;
		e=y;
		f=u;
	}
	
	public boolean ifTriangle(double a, double b, double c) {
		if(a<b+c && b<a+c && c<a+b) {
			return true;
		}			
		else {
		return false;
		}
	}
	
	public double pole (double a,double b, double c) {
		double p; // obwod
		double x; // pole
		p=(a+b+c)/2;
		x=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return x;
	}
	public void boki (double a, double b, double c) {
		if(a<b && a<c) {
			if(b<c) {
				System.out.println(a + " " + b + " " + c);
			}
			else {
				System.out.println(a + " " + c + " " + b);
			}
			}
		else if (b<a && b<c) {
			if(a<c) {
				System.out.println(b + " " + a + " " + c);
			}
			else {
				System.out.println(b + " " + c + " " + a);
			}
		}
		else {
			if(a<b) {
				System.out.println(c + " " + a + " " + b);
			}
			else {
				System.out.println(c + " " + b + " " + a);
			}
		}
		}
	public boolean czyProstokatny(double a, double b, double c) {
		if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)) {
			return true;
		}
		else if (Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2)) {
			return true;
		}
		else if (Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean czyRozwartokatny(double d, double e, double f) {
		if(d>90 || e>90 || f>90) {
			return true;
		}
		else {return false;}
	}
		
}

