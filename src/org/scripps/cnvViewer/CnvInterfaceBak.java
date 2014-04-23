package org.scripps.cnvViewer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Scrollbar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JScrollBar;
import javax.swing.LayoutStyle.ComponentPlacement;

import ScrippsGenomeAdviserUI.Help;
import ScrippsGenomeAdviserUI.Interface;
import ScrippsGenomeAdviserUI.ShowTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CnvInterfaceBak extends JFrame
{

	private JPanel contentPane;
	public static JFileChooser fileChooser;
	public static File file;
	public static CnvInterfaceBak fileLines;
	public String myFileName;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public CnvInterfaceBak()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1000, 1000);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				OpenActionPerformed(evt);
			}
		});
		mnFile.add(mntmOpen);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener()
		{
			private void ActionPerformed(java.awt.event.ActionEvent evt)
			{
				System.exit(0);
			}

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO Auto-generated method stub

			}
		});
		mnFile.add(mntmExit);

		JMenu mnStatistics = new JMenu("Statistics");
		menuBar.add(mnStatistics);

		JMenuItem mntmStatistics = new JMenuItem("Statistics");
		mnStatistics.add(mntmStatistics);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmHelp = new JMenuItem("Help");
		mntmHelp.addActionListener(new ActionListener()
		{

			public void HelpActionPerformed(ActionEvent arg0)
			{
				new Help().setVisible(true);
			}

			public void actionPerformed(ActionEvent arg0)
			{
			}
		});
		mnHelp.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel jLabelIcon = new JLabel("New label");
		jLabelIcon
				.setIcon(new ImageIcon(
						"C:\\Users\\Neha\\workspace\\MY_SG_ADVISER\\src\\org\\scripps\\cnvViewer\\ScrippsProgram.jpg"));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_contentPane
						.createSequentialGroup()
						.addComponent(jLabelIcon, GroupLayout.PREFERRED_SIZE,
								986, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(88, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addComponent(jLabelIcon,
				GroupLayout.PREFERRED_SIZE, 716, Short.MAX_VALUE));
		contentPane.setLayout(gl_contentPane);
	}

	public void OpenActionPerformed(java.awt.event.ActionEvent evt)
	{
		CnvInterfaceBak myCnvInterface = new CnvInterfaceBak();
		myCnvInterface.contentPane.add(fileChooser);
		int retVal = fileChooser.showOpenDialog(this);
		if (retVal == JFileChooser.APPROVE_OPTION)
		{
			file = fileChooser.getSelectedFile();
			fileLines.myFileName = file.getName();
			Long siz = file.getTotalSpace();
			System.out.println("File size is: " + siz);
			String s = fileLines.myFileName;
			boolean match;
			BufferedReader bReader;
			for (int in = 1; in < 1001; in++)
			{
				String n = null;
				try
				{
					bReader = new BufferedReader(new FileReader(file));
					n = bReader.readLine();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					CnvInterfaceBak frame = new CnvInterfaceBak();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
