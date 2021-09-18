package api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class Geral extends JFrame {

	private ButtonGroup bg = new ButtonGroup();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geral frame = new Geral();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setUndecorated(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Geral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("M\u00C9TRICAS");
		lblNewLabel.setForeground(new Color(153, 153, 204));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel.setBounds(53, 25, 213, 45);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Selecione as m\u00E9tricas a serem exibidas:");
		lblNewLabel_1.setForeground(new Color(153, 153, 153));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(53, 70, 246, 14);
		contentPane.add(lblNewLabel_1);

		// RadioButton (6 buttons)

		JRadioButton Armazenamento = new JRadioButton("Relacionadas a Armazenamento", false);
		Armazenamento.setOpaque(false);
		Armazenamento.setForeground(new Color(204, 204, 204));
		Armazenamento.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Armazenamento.setBounds(49, 150, 227, 23);
		contentPane.add(Armazenamento);

		JRadioButton Indices = new JRadioButton("Relacionadas a \u00CDndices", false);
		Indices.setOpaque(false);
		Indices.setForeground(new Color(204, 204, 204));
		Indices.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Indices.setBounds(49, 185, 213, 23);
		contentPane.add(Indices);

		JRadioButton Conflitos = new JRadioButton("Relacionadas a conflitos", false);
		Conflitos.setOpaque(false);
		Conflitos.setForeground(new Color(204, 204, 204));
		Conflitos.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Conflitos.setBounds(49, 220, 183, 23);
		contentPane.add(Conflitos);

		JRadioButton DiskBuffer = new JRadioButton("Relacionadas a Disk Blocks e Buffer Hits dos \u00CDndices", false);
		DiskBuffer.setOpaque(false);
		DiskBuffer.setForeground(new Color(204, 204, 204));
		DiskBuffer.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		DiskBuffer.setBounds(49, 258, 361, 23);
		contentPane.add(DiskBuffer);

		JRadioButton Status = new JRadioButton("Relacionadas ao Status do Banco de Dados", false);
		Status.setOpaque(false);
		Status.setForeground(new Color(204, 204, 204));
		Status.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Status.setBounds(49, 297, 302, 23);
		contentPane.add(Status);


		JRadioButton Consulta = new JRadioButton("Relacionadas a Consulta", false);
		Consulta.setSelected(false);
		Consulta.setOpaque(false);
		Consulta.setForeground(new Color(204, 204, 204));
		Consulta.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		Consulta.setBounds(49, 113, 213, 23);
		contentPane.add(Consulta);

		bg.add(Consulta);
		bg.add(DiskBuffer);
		bg.add(Status);
		bg.add(Conflitos);
		bg.add(Indices);
		bg.add(Armazenamento);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVisible(false);
		scrollPane_1.setBounds(600, 10, 1000, 1000);
		contentPane.add(scrollPane_1);

		JTextArea saidaText = new JTextArea();
		saidaText.setVisible(false);
		scrollPane_1.setViewportView(saidaText);
		saidaText.setFont(new Font("Monospaced", Font.BOLD, 13));

		// Botão Exibir Métricas

		JButton btnNewButton = new JButton("Exibir ");
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String consultar = "";

				if (Consulta.isSelected()) {

					consultar = " userid, query, rows, calls, total_exec_time, min_exec_time, max_exec_time from pg_stat_statements";
					
				}


				if (Status.isSelected()) {

					consultar = " datid, datname, numbackends, xact_commit, xact_rollback, blks_read, blks_hit, tup_returned, tup_fetched, tup_inserted, tup_updated, tup_deleted, conflicts, temp_files, temp_bytes, deadlocks, checksum_failures, checksum_last_failure, blk_read_time, blk_write_time, stats_reset from pg_stat_database ";

				}

				if (DiskBuffer.isSelected()) {

					consultar = " relid, indexrelid, schemaname, relname, indexrelname, idx_blks_read, idx_blks_hit from pg_statio_all_indexes ";

				}

				if (Conflitos.isSelected()) {

					consultar = " datid, datname, confl_tablespace, confl_lock, confl_snapshot, confl_bufferpin, confl_deadlock from pg_stat_database_conflicts ";

				}

				if (Indices.isSelected()) {

					consultar = " relid, indexrelid, schemaname, relname, indexrelname, idx_scan, idx_tup_read, idx_tup_fetch from pg_stat_sys_indexes ";

				}

				if (Armazenamento.isSelected()) {

					consultar = " pg_size_pretty(pg_database_size(13442)) ";

				}

				try {

					Metricas sb1 = new Metricas();
					Metricas sb2 = new Metricas();
					scrollPane_1.setVisible(true);
					saidaText.setVisible(true);
					saidaText.setBounds(600, 400, 1000, 1000);
					saidaText.setText(sb1.retornaMetrica(consultar, 1));
					saidaText.setText(sb2.retornaMetrica(consultar, 2));




				}

				
				
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}


				
			}

		});

		btnNewButton.setBackground(new Color(102, 102, 204));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnNewButton.setBounds(68, 414, 169, 37);
		contentPane.add(btnNewButton);

	}
}