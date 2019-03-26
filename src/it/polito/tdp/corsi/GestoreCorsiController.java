package it.polito.tdp.corsi;

import java.util.List;

import it.polito.tdp.corsi.model.Corso;
import it.polito.tdp.corsi.model.GestoreCorsi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestoreCorsiController 
{
	private GestoreCorsi model;

    @FXML
    private TextArea txtResult;

    @FXML
    private TextField txtPeriodo;

    @FXML
    private Button btnCercaCorsi;

    @FXML
    private Button btnStatCorsi;

    @FXML
    void doCalcolaStatCorsi(ActionEvent event) {

    }

    @FXML
    void doCercaCorsi(ActionEvent event) 
    {
    	int periodo;
    	try 
    	{
    		 periodo = Integer.parseInt(txtPeriodo.getText());
    	}
    	catch (NumberFormatException e)
    	{
    		txtResult.appendText("Devi inserire un periodo (1 o 2)");
    		return;
    	}
    	if (periodo != 1 && periodo != 2) 
    	{
    		txtResult.appendText("Devi inserire un periodo (1 o 2)");
    		return;
    	}
    	List<Corso> corsi = this.model.getCorsiByPeriodo(periodo);
    	for (Corso c : corsi)
    	{
    		txtResult.appendText(c.toString() + "\n");
    	}
    }

	public void setModel(GestoreCorsi model)
	{
		this.model = model;
	}

}

