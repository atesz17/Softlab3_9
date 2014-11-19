package swingmvclab;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/*
 * A hallgat�k adatait t�rol� oszt�ly.
 */

public class StudentData extends AbstractTableModel {

    /*
     * Ez a tagv�ltoz� t�rolja a hallgat�i adatokat.
     * NE M�DOS�TSD!
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
    
}
