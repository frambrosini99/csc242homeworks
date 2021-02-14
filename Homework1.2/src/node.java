
public class node {
	
	String name;
	
	int totdist;
	int dist;
	int heur;
	
	public node (String name, int dist, int heur) {
		this.name = name;
		this.dist = dist;
		this.heur = heur;
		totdist = dist + heur;
	}

	public String getname() {return name;}
	public int gettotal() {return totdist;}
	public int getdist() {return dist;}
	public int getheur() {return heur;}
	
	public void print() {
		System.out.println(getname() + " f: " + gettotal() + " g: " + getdist()
		+ " h: " + getheur());
	}

}
