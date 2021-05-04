package reserva;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	private JFrame frmInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.getContentPane().setBackground(Color.WHITE);
		frmInicio.setTitle("Inicio");
		frmInicio.setBounds(100, 100, 450, 300);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicio.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BIENVENIDO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 57, 414, 50);
		frmInicio.getContentPane().add(lblNewLabel_1);
		
		JButton btnNuevaReserva = new JButton("NUEVA RESERVA");
		btnNuevaReserva.setFont(new Font("Consolas", Font.PLAIN, 11));
		btnNuevaReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroReserva rs = new RegistroReserva();
				rs.setVisible(true);
			}
		});
		btnNuevaReserva.setBounds(146, 102, 141, 50);
		frmInicio.getContentPane().add(btnNuevaReserva);
	}
}
