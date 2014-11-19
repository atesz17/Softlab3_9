package swingmvclab;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/*
 * A hallgatók adatait tároló osztály.
 */

public class StudentData extends AbstractTableModel {

    /*
     * Ez a tagváltozó tárolja a hallgatói adatokat.
     * NE MÓDOSÍTSD!
     */
    List<Student> students = new ArrayList<Student>();

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return students.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
		Student student = students.get(rowIndex);
		switch(columnIndex)	{
			case 0:		return student.getName();
			case 1:		return student.getNeptun();
			case 2: 	return student.hasSignature();
			default:	return student.getGrade();
		}
	}
	
	@Override
	public String getColumnName(int columnIndex)	{
		
		switch(columnIndex)	{
		case 0 :	return "Név";
		case 1 :	return "Neptun";
		case 2 :	return "Aláírás";
		default:	return "Jegy";
		}
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex)	{
		
		switch(columnIndex)	{
		case 0 :	return String.class;
		case 1 :	return String.class;
		case 2 :	return Boolean.class;
		default:	return Integer.class;
		}
	}
    
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex)	{
		
		return columnIndex > 1 ? true : false;
	}
	
	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex)	{
		
		Student student = students.get(rowIndex);
		
		switch (columnIndex)	{
		case 2 :	student.setSignature((Boolean)value); break; // kell a break, mert kulonben tovabbfut a defaultra (nem tudom miert)
		default:	student.setGrade((Integer)value);	break;
		}
	}
}
