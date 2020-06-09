import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Poupanca extends JFrame {

	private JPanel contentPane;
	private JTextField campo_juros;
	private JTextField campo_anos;
	private JTextField campo_deposito;
	private JButton ok;
	private JLabel lb_resultado;
	protected double mes;
	protected double juros;
	protected double deposito;
	protected double anos;
	protected double poupado;
	protected double poupanca;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poupanca frame = new Poupanca();
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
	
	
	
	
	public Poupanca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lb_juros = new JLabel("Juros ao mes %");
		lb_juros.setBounds(10, 38, 92, 14);
		contentPane.add(lb_juros);
	
		JLabel lb_anos = new JLabel("Num.De Anos");
		lb_anos.setBounds(10, 88, 74, 14);
		contentPane.add(lb_anos);
		
		JLabel lb_deposito = new JLabel("Deposito Mensal");
		lb_deposito.setBounds(10, 129, 92, 14);
		contentPane.add(lb_deposito);
		
		JLabel lb_total = new JLabel("Total Poupado:");
		lb_total.setBounds(38, 196, 107, 14);
		contentPane.add(lb_total);
		
		campo_juros = new JTextField();
		campo_juros.setBounds(113, 35, 245, 20);
		contentPane.add(campo_juros);
		campo_juros.setColumns(10);
		
		campo_anos = new JTextField();
		campo_anos.setBounds(113, 85, 245, 20);
		contentPane.add(campo_anos);
		campo_anos.setColumns(10);
		
		campo_deposito = new JTextField();
		campo_deposito.setBounds(141, 126, 245, 20);
		contentPane.add(campo_deposito);
		campo_deposito.setColumns(10);
		
		lb_resultado = new JLabel("R$");
		lb_resultado.setBounds(133, 196, 151, 14);
		contentPane.add(lb_resultado);
		
		ok = new JButton("OK");
		ok.setBounds(176, 227, 89, 23);
		contentPane.add(ok);
		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				anos = Double.parseDouble(campo_anos.getText());
				juros = Double.parseDouble(campo_juros.getText());
				deposito = Double.parseDouble(campo_deposito.getText());
				
				poupanca = deposito*(1+(juros/100))*anos;
				
				lb_resultado.setText("R$: "+poupanca);
				
			}
		});
		
		JButton btnapagar = new JButton("APAGAR");
		btnapagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				campo_juros.setText(" ");
				campo_anos.setText(" ");
				campo_deposito.setText(" ");
				lb_resultado.setText("R$: ");
				
			}
		});
		btnapagar.setBounds(296, 227, 89, 23);
		contentPane.add(btnapagar);
		
	
	}
}
