package pkg16bce0958_5;

/**
 *
 * @author richaranjan
 */

import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

class Film
{
	private String name;
	private String language;
	private String leadActor;
	private String category;
	private int duration;

	Film() 
	{
		this.name="";
		this.language="";
		this.leadActor="";
		this.category="";
		this.duration=0;
	}
	
	Film(String name, String language, String leadActor, String category, int duration) 
	{
		this.name = name;
		this.language = language;
		this.leadActor = leadActor;
		this.duration = duration;
		this.category = category;
	}
	
	public String getName() 
	{
		return this.name;
	}
        public String getLanguage() 
	{
		return this.language;
	}
        public String getLeadActor() 
	{
		return this.leadActor;
	}
        public String getCategory() 
	{
		return this.category;
	}
	public int getDuration() 
	{
		return this.duration;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public void setLanguage(String language) 
	{
		this.language = language;
	}
	public void setLeadActor(String leadActor) 
	{
		this.leadActor = leadActor;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
        public void setDuration(int duration) 
	{
		this.duration = duration;
	}

	public void print() 
	{
		System.out.println("\nName: " + name);
		System.out.println("Language: " + language);
		System.out.println("Lead Actor: " + leadActor);
		System.out.println("Duration: " + duration);
		System.out.println("Category: " + category);
		System.out.println();
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Film f1 = new Film("The Tiger", "English", "Arnold", "Action", 100);
		Film f2 = new Film();
		f2.setName("Bahubali");
		f2.setLanguage("Tamil");
		f2.setLeadActor("Rajni");
		f2.setCategory("Drama");
		f2.setDuration(120);
		Film f3 = new Film("The Super Hero", "Tamil", "Raijni", "Comedy", 250);
		Film f4 = new Film("Superman", "English", "Arnold", "Action", 100);
		
		System.out.println("\nAll films:");
		f1.print();
		f2.print();
		f3.print();
		f4.print();

		Vector<Film> v1 = new Vector<Film>();
		v1.add(f1);
		v1.add(f2);
		v1.add(f3);
		v1.add(f4);

		Vector<Film> ea = new Vector<Film>();
		Vector<Film> t = new Vector<Film>();
		Vector<Film> co = new Vector<Film>();
		
		Iterator it = v1.iterator();
		Iterator it1 = v1.iterator();

		Film minEnglish=(Film) it1.next();
		int minDuration = Integer.MAX_VALUE;

		while (it.hasNext()) 
		{
			Film c = (Film) it.next();
			if (c.getLanguage().equals("English") && c.getLeadActor().equals("Arnold")) 
			{
				while(c.getDuration()<minDuration)
				{
					minDuration = c.getDuration();
					minEnglish = c;
				}
			}

			if (c.getLanguage().equals("Tamil") && c.getLeadActor().equals("Raijni")) 
				t.add(c);

			if (c.getCategory().equals("Comedy")) 	
				co.add(c);
		}
		ea.add(minEnglish);
		Iterator i1 = ea.iterator();
		Iterator i2 = t.iterator();
		Iterator i3 = co.iterator();
		System.out.println("\nShortest English film(s) with Arnold as lead actor:\n");
		while(i1.hasNext())
		{
			Film o1 = (Film) i1.next();
			o1.print();
		}
		System.out.println("\nTamil films with Rajini as lead actor:\n");
		while(i2.hasNext())
		{
			Film o2 = (Film) i2.next();
			o2.print();
		}
		System.out.println("\nComedy movies:\n");
		while(i3.hasNext())
		{
			Film o3= (Film) i3.next();
			o3.print();
		}
	}
}