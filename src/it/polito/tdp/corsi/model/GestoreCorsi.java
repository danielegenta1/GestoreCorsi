package it.polito.tdp.corsi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;
import it.polito.tdp.corsi.model.Corso;

public class GestoreCorsi {

	public List<Corso> getCorsiByPeriodo(int periodo) 
	{
		//pattern DAO
		CorsoDAO dao = new CorsoDAO();
		
		//M1
		List<Corso> corsi = dao.listAll();
		List<Corso> result = new ArrayList<Corso>();
		for (Corso c : corsi)
		{
			if (c.getPd() == periodo)
			{
				result.add(c);
			}
		}
		return result;
		
		//M2
		//return dao.listCorsiByPD(periodo);
	}

}
