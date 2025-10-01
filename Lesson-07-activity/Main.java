
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  System.out.println("Enter x");
  double x = Input.readDouble();
  double y = 0;
  y = Math.pow(x,7);
  System.out.printin(y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  System.out.println("Enter z");
  double z = Input.readDouble();
  double q = 0;
  q = Math.pow(z,3) + 5;
  System.out.printin(q);
/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
  System.out.println("Enter t and r");
  double t = Input.readDouble();
  double r = Input.readDouble();
  double s = 0;
  s = Math.pow(t,5) * Math.pow((r+2),4);
  System.out.printin(s);
 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
 System.out.println("Enter a and b");
  double a = Input.readDouble();
  double b = Input.readDouble();
  double c = 0;
  c = Math.sqrt(A+B);
  System.out.printin(c);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
 System.out.println("Enter x1 and x2 and y1 and y2");
  double x1 = Input.readDouble();
  double x2 = Input.readDouble();
  double y1 = Input.readDouble();
  double y2 = Input.readDouble();
  double d = 0;
  d = Math.sqrt(Math.pow((x2-x1,2)+Math.pow((y2-y1),2)))
System.out.println(d)



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
 System.out.println("Enter deg");
 double deg = Input.readDouble();
 double g = 0;
 g = Math.Sin*(deg);
System.out.println(g);



/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
  System.out.println("Enter m and n");
  double m = Input.readDouble();
  double n = Input.readDouble();
  double k = 0;
  k = Math.pow(m,5) / Math.sqrt(n+1);
  System.out.printin(k);



/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}