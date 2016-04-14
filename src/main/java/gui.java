/**
 * Created by Jana Georgievova on 4/14/2016.
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class gui {

    static JFrame frame1;
    static Container pane;
    static JButton btnFind;
    static JLabel lblWebAddress;
    static JTextField txtWebAddress;
    static JTextField txtWeb;
    static Insets insets;


    public static void main(String args[]) {
        //Set Look and Feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        } catch (UnsupportedLookAndFeelException e) {
        }

        final long serialVersionUID = 1L;

        // set flow layout for the frame

        //Create the frame
        frame1 = new JFrame("Crawl Your Web");
        frame1.setSize(800, 600);
        pane = frame1.getContentPane();
        insets = pane.getInsets();
        pane.setLayout(null);

        //Create controls
        btnFind = new JButton("Staarrrrtttttttttt");
        lblWebAddress = new JLabel("START CRAWLING");
        txtWebAddress = new JTextField(50);
        txtWeb = new JTextField(25);

        //Add all components to panel
        pane.add(btnFind);
        pane.add(lblWebAddress);
        //pane.add(txtWebAddress);
        pane.add(txtWeb);

        lblWebAddress.setFont(new Font("OpenSans", Font.PLAIN, 64));
        txtWebAddress.setSize(300,300);
        txtWeb.setText("www.seznam.cz");
        Border border = BorderFactory.createLineBorder(Color.lightGray, 5);
        txtWeb.setBorder(border);
        Font font1 = new Font("OpenSans", Font.PLAIN, 25);
        txtWeb.setFont(font1);
        btnFind.setFont(new Font("OpenSans", Font.PLAIN, 30));


        //Place all components
        lblWebAddress.setBounds(insets.left + 100, insets.top + 100, lblWebAddress.getPreferredSize().width, lblWebAddress.getPreferredSize().height);
        txtWeb.setBounds(insets.left + 100, insets.top + 250, txtWeb.getPreferredSize().width, txtWeb.getPreferredSize().height);
        btnFind.setBounds(insets.left + 300, insets.top + 310, btnFind.getPreferredSize().width, btnFind.getPreferredSize().height);

        //Set frame visible
        frame1.setVisible(true);

        //Button's action
       // btnConnect.addActionListener(new btnConnectAction()); //Register action
    }







   /* public static class btnConnectAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("You entered " + txtUsername.getText());
        }
    }*/


}
