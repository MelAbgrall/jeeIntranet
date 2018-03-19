package com.demo.metier;

import java.util.List;

import com.demo.entities.Etudiant;
import com.demo.entities.News;

public interface IntanetMetier {

	
	public List<Etudiant> listEtudiants(String nom);
	public List<Etudiant> listEtudiants1();
	public List<News> listNews();
}