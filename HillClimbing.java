class Point{
	double x;
	double y;
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
}

class HillClimbing{
	
	public static void main(String...args){
		Point cur = new Point(0, 0);
		Point maxn;
		
		int i = 0;

		while(true){
			i++;
			maxn = getMaxNeighbour(cur);
			System.out.println("Iteration "+ i +" Max x & Max y: " + maxn.x + " " + maxn.y);
			if(maxn.y <= cur.y){
				break;	
			}
			cur = maxn;
		}	
		System.out.println("\n\nLocal Maxima -> Max x & Max y: "+cur.x + " " + cur.y);
	}

	public static Point getMaxNeighbour(Point cur){
		
		double maxy = cur.y;
		double maxx = cur.x;
		Point p;
		p = Math.sin(Math.toRadians(maxx + 1)) > maxy ? new Point(maxx + 1, Math.sin(Math.toRadians(maxx + 1))) : new Point(maxx, maxy);
		p = Math.sin(Math.toRadians(maxx - 1)) > p.y ? new Point(maxx - 1,Math.sin(Math.toRadians(maxx - 1))) : p;
		return new Point(p.x, p.y);
	}
}
