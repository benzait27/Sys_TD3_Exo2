

public class Nombre  {
 int n;
 int carre;
 int indicateur;
 
 public  Nombre() {
	super();
	this.n = 0;
	this.carre = 0;
	indicateur=0;
}

public synchronized void afficher() throws InterruptedException 
 {
	while (indicateur!=2)
	{
		wait();
	}
	indicateur=0;
	System.out.println("le nombre"+n); 
	System.out.println("son carre"+carre);
	notifyAll();
 }
 
 public synchronized void augmente() throws InterruptedException
 {
	 while (indicateur!=0)
		{
			wait();
		}
	indicateur=1;
	this.n++;
	notifyAll();
	}


public synchronized void calculerCarre() throws InterruptedException
{
	 while (indicateur!=1)
		{
			wait();
		}
	indicateur=2;
	this.carre=this.n*this.n;
	notifyAll();
	}
}
