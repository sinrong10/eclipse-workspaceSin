package com.gtm.TestCollection.presentation;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		al.add(12);
		al.add("une chaine de caractère");
		al.add(12.2f);
		al.add("d");
		al.add(12);

		for (int i=0; i<al.size();i++) {
			System.out.println("la donnée à l'indice"+i+"est"+al.get(i));
		}
		System.out.println("--------------------------------------------------");
		
		List<String> al2 = new ArrayList<String>();
		al2.add("des de caractère");
		al2.add("d");
		al2.add("d");
		
		for (int i=0; i<al2.size(); i++) {
			System.out.println("la donnée à l'indice"+i+"est"+al2.get(i));
		}

		System.out.println("--------------------------------------------------");
		
		Set s = new HashSet();
		s.add(24);
		s.add("caractère");
		s.add(12.2f);
		s.add("d");
		s.add(24);
		
		/*Iterator pointe sur la collection s*/
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
				System.out.println("--------------------------------------------------");
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(24);
		s2.add(24);
		s2.add(48);
		s2.add(36);
		
		Iterator it2 = s2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		for(int i=0; i<s2.size(); i++) {		
			System.out.println("la donnée à l'indice"+i+"est"+s2.toArray()[i]);
		}
		
		System.out.println("--------------------------------------------------");
		
		/* clé soit Integer et valeur soit String*/
		
		Hashtable m = new Hashtable ();
		m.put(1,"printemps");
		m.put(10,"été");
		m.put("x","automne");
		m.put(45,"hiver");
		
		Enumeration e = m.elements();
		Enumeration k = m.keys();
		
		/*while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		*/
		while(e.hasMoreElements()) {
			System.out.println(k.nextElement()+"=>"+e.nextElement());
		}
		Object t = m.get(10);
		System.out.println(t);
		
		
		System.out.println("--------------------------------------------------");
		
		Hashtable<Integer, String>m2 = new Hashtable<Integer, String>();
		m2.put(1,"printemps");
		m2.put(10,"été");
		m2.put(5,"automne");
		m2.put(45,"hiver");
		
		Enumeration e2 = m2.elements();
		Enumeration k2 = m2.keys();
		
		/*while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		*/
		while(e2.hasMoreElements()) {
			System.out.println(k2.nextElement()+"=>"+e2.nextElement());
		}
		
		System.out.println("--------------------------------------------------");
	}
		
		
		
		
		
		
		


}

