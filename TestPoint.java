class Point{
	double x,y,z;
	
	Point(double _x,double _y,double _z){
		x = _x ;
		y = _y ;
		z = _z ;
		}
		
		void setPointx(double _x){
			x = _x;
		}
			
		void setPointy(double _y){
			y = _y;
		}
			
		void setPointz(double _z){
			z = _z;
		}
		
		double getFar(Point p){
			return (x - p.x)*(x - p.x)+(y - p.y)*(y - p.y)+(z - p.z)*(z - p.z);
			}
			
	}
	
	public class TestPoint{
		 public static void main(String []args){
			Point p = new Point(1.0,1.0,1.0);
			Point p1= new Point(0.0,0.0,0.0);
			System.out.println(p.getFar(p1));
				}
		}