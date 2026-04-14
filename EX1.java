package TP3;
	class Point {
	    private double x;
	    private double y;
	    
	    public Point() {
	        x = 0;
	        y = 0;
	    }

	    public Point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public void afficher() {
	        System.out.println("(" + x + ", " + y + ")");
	    }

	    public void deplacer(double dx, double dy) {
	        x = x + dx;
	        y =y + dy;
	    }

	    public double distanceOrigine() {
	    	double d = Math.sqrt(x*x + y*y);
	        return d;
	    }
	    
	    public double distance2points(Point P1,Point P2) {
	    	double d = Math.sqrt((P2.x - P1.x) * (P2.x - P1.x) + (P2.y - P1.y) * (P2.y - P1.y));
	    	return d;
	    }
	}
	public class EX1 {
		public static void main(String[] args) {
			Point P1 = new Point(2.0,4.0);
			Point P2 = new Point(3.5,6.0);
			P1.afficher();
			P1.deplacer(1.0, 0.5);
			P1.afficher();
			System.out.println("la distance a l'origine est : " + P1.distanceOrigine());
			System.out.println("la distance entre P1 et P2 est :" + P1.distance2points(P1, P2));
		}
	}
