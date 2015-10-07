package lists.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class ArrayListsController
{
	private ArrayList<String> firstWords;
	
	public ArrayListsController()
	{
		firstWords = new ArrayList<String>();
	}
	
	public void start()
	{
		firstWords.add("jedininjasamuraigobblygukegrandpuba!");
		firstWords.add("babababababababababababababababababababababababababababababababababababa");
		showList();
	}
	
	private void showList()
	{
		for(int spot =0; spot < firstWords.size(); spot++)
		{
			JOptionPane.showMessageDialog(null,  firstWords.get(spot) + " is at spot# " + spot);;
		}
	}
}
