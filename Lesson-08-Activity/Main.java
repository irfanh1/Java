class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    print("Hello")
  }

  void print(String LeBron){
	System.out.println(LeBron);
  }
 
 double FtoC(double F){
	double c = (F-32) * 9 / 5.0;
	return c;
 }

 double sphereVolume(double r){
	double v = (4/3.0) * Math.PI * Math.pow(double r, double 3);
	return v;
 }

double coneVolume(double r, double h){
    double v = (1/3.0) * Math.PI * Math.pow(r, 2) * h;
    return v;
}

double distance(double x1, double y1, double x2, double y2){
    double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    return d;
}

double cylinderVolume = (double r, double h){
	double v = Math.PI * Math.pow(r, 2) * h;
	return v;
 
}