import javax.swing.*;
public class Q5 {
	public static void main(String[] args) {
		int y_coord_triangle = 100, x_coord_triangle = 200;
		boolean result;
		JFrame f = new JFrame();
		String[] coordinates;
		String input = JOptionPane.showInputDialog(f, "Enter a point with X and Y coordinates");
		coordinates = input.split(" ");
		int x_coord_user = Integer.parseInt(coordinates[0]);
		int y_coord_user = Integer.parseInt(coordinates[1]);
		if(x_coord_user <= x_coord_triangle) {
			if(y_coord_user <= y_coord_triangle) {
				result = true;
			} else {
				result = false;
			}
		} else {
			result = false;
		}
		if(result) {
			JOptionPane.showMessageDialog(f, "Coordinates are inside the right angle triangle","Alert",JOptionPane.WARNING_MESSAGE);		
		} else {
			JOptionPane.showMessageDialog(f, "Coordinates are not inside the right angle triangle","Alert",JOptionPane.WARNING_MESSAGE);
		}
	}
}
