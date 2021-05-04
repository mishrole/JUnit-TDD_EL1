package reserva;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numeroHabitacion;
	private JTextField nombreCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroReserva frame = new RegistroReserva();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroReserva() {
		setTitle("NUEVA RESERVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVA RESERVA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 16));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 26, 414, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de Habitaci\u00F3n");
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(36, 80, 185, 29);
		contentPane.add(lblNewLabel_1);
		
		numeroHabitacion = new JTextField();
		numeroHabitacion.setFont(new Font("Consolas", Font.PLAIN, 11));
		numeroHabitacion.setColumns(10);
		numeroHabitacion.setBounds(246, 80, 150, 29);
		contentPane.add(numeroHabitacion);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre de Cliente");
		lblNewLabel_1_1.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(35, 120, 185, 29);
		contentPane.add(lblNewLabel_1_1);
		
		nombreCliente = new JTextField();
		nombreCliente.setFont(new Font("Consolas", Font.PLAIN, 11));
		nombreCliente.setColumns(10);
		nombreCliente.setBounds(246, 120, 150, 29);
		contentPane.add(nombreCliente);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha de Reserva");
		lblNewLabel_1_1_1.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(35, 160, 185, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		JDateChooser fechaReserva = new JDateChooser();
		fechaReserva.setDateFormatString("dd/MM/yyyy");
		fechaReserva.setBounds(246, 160, 150, 29);
		contentPane.add(fechaReserva);
		
		JButton btnRegistrarReserva = new JButton("REGISTRAR RESERVA");
		btnRegistrarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reserva reserva = new Reserva();
				String mensaje = reserva.registrarNuevaReserva(Integer.parseInt(numeroHabitacion.getText()), nombreCliente.getText(), fechaReserva.getDate());				
				JOptionPane.showMessageDialog(null, mensaje);
			}
		});
		
		btnRegistrarReserva.setFont(new Font("Consolas", Font.PLAIN, 11));
		btnRegistrarReserva.setBounds(36, 234, 360, 29);
		contentPane.add(btnRegistrarReserva);

	}
}
