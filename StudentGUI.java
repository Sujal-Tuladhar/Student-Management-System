/**
 * The following StudentGUI class is made to display the GUI of student,Regular,Dropout classes using the 
 * concept of child and parents  class.
 * This class consist of constructor,attribute,attributes, constructor, createGUI method, 
 * also alot of instance variables/objects.
 * @author(Sujal Tuladhar)
 * @version (5.0.1A)
 */

/*
 * This part contain all the import needed in the code like:Swing,awt and util packages.
 * Commented all the used import and used * so it gives no error in the future.
 */
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JComboBox;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JOptionPane;
//import javax.swing.JButton;
//import javax.swing.ImageIcon;

import java.awt.*;
//import java.awt.Font;
//import java.awt.Color;

import java.awt.event.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

import java.util.*;
//import java.util.ArrayList;

//Created a class StudentGUI that implements ActionListener event package
public class StudentGUI implements ActionListener 
{
    // creating an ArraryList of Student to store array list in Student class.
    ArrayList<Student> Ary_List = new ArrayList<Student>();
    // Declare the intsance variable of JFrame
    private JFrame student_frame, regular_frame, dropout_frame;

    // Declare the instance variable of JPanel
    private JPanel student_panel, regular_panel, dropout_panel;

    // Declare the instance variable of JLabel
    private JLabel student_background, student_topLabel, student_dash, student_phrase,
    regular_topLabel, regular_topDash, regular_studentend, regular_firstTag, dash, regular_student_name,
    regular_enrollmentId, regular_datOfBirth,
    regular_dateOfEnrollment, regular_secTopLabel, twodash, regular_courseName, regular_numOfModules,
    regular_calculateMessage,
    regular_CourseDuration, regular_numOfCreditHours,
    regular_tutionfee, regular_daysPresent, regular_fivedash,
    dropout_topLabel, dropout_dash, dropout_tagOne, dropout_dashTag, dropout_studentName, dropout_dateOfBirth,
    dropout_enrollmentId, dropout_tagtwo, dropout_dashTagTwo, dropout_tagThree, dropout_dashTagThree,
    dropout_courseName, dropout_remainingAmount, dropout_courseDuration, dropout_tutionFee,
    dropout_dateOfEnrollment,
    dropout_tagFour, dropout_dashTagFour, dropout_numOfRemainingModules, dropout_numOfMonthAttended,
    dropout_dateOfDropout;

    // Declare the instance variable of JTextField
    private JTextField regular_txtstudentName, regular_txtenrollmentId, regular_txtcourseName,
    regular_txtnumOfModules, regular_txtCourseDuration, regular_txtnumOfCreditHours, regular_txttutionfee,
    regular_txtdaysPresent,
    dropout_txtstudentName, dropout_txtenrollmentId, dropout_txtcourseName, dropout_txtremainingAmount,
    dropout_txtcourseDuration, dropout_txttutionFee, dropout_txtnumOfRemainingModules,
    dropout_txtnumOfMonthAttended;

    // Declare the instance variable of JButton
    private JButton switch_regular, switch_dropout, regular_addButton,
    regular_clear_button, regular_goBack_button, regular_presentPercentage, regular_grantCertificate,
    regular_display,
    dropout_clearButton, dropout_goBackButton, dropout_addButton, dropout_billsPayable, dropout_removeStudent,
    dropout_display;

    // Declare the instance variable of ImageIcon (To put image in bcakground)
    private ImageIcon img;

    // Declare the instance variable of JComboBox
    private JComboBox<String> regular_dobDayComboBox, regular_dobMonthComboBox, regular_dobYearComboBox,
    regular_doeDayComboBox, regular_doeMonthComboBox, regular_doeYearComboBox,
    dropout_dobDayComboBox, dropout_dobMonthComboBox, dropout_dobYearComboBox,
    dropout_doeDayComboBox, dropout_doeMonthComboBox, dropout_doeYearComboBox,
    dropout_dodDayComboBox, dropout_dodMonthComboBox, dropout_dodYearComboBox;
    //Constructor containing 
    public StudentGUI()
    {
        student();
        regular();
        dropOut();
    }
    // Making a method to design the GUI first part
    private void student() 
    {
        // Making JFrame for student class by importing form javax.swing package
        student_frame = new JFrame();
        student_frame.setTitle("Student Registrartion GUI");
        // Making panel for stduent class by importing form javax.swing package
        student_panel = new JPanel();
        student_panel.setLayout(null);// setting panel Layout to null
        student_frame.add(student_panel);// adding frame in panel

        // Making Imageimage for student GUI from javax.swing package
        img = new ImageIcon("./image/Bg2.png");
        student_background = new JLabel("", img, JLabel.CENTER);// Linking ImageIcon to JLabel and adding the picture
        student_background.setBounds(0, 0, 900, 600);
        student_frame.add(student_background);// adding background Jlabel in frame

        // Student Registration System Interface
        // Making a JLabel for student class by importing from javax.swing
        student_topLabel = new JLabel("Student Registration System Interface");
        student_topLabel.setBounds(155, 80, 610, 100);
        student_topLabel.setFont(new Font("Georgia", Font.PLAIN, 35));
        student_background.add(student_topLabel);// Linking label to background photo

        // Dash
        // Making a JLabel for student class by importing from javax.swing
        student_dash = new JLabel("-------------------------------------------------------------------------");
        student_dash.setBounds(155, 170, 610, 20);
        student_background.add(student_dash);

        // Message
        // Making a JLabel for student class by importing from javax.swing
        student_phrase = new JLabel("Welcome to the Interface. Choose an option for data entry.");
        student_phrase.setBounds(140, 200, 700, 50);
        student_phrase.setFont(new Font("Georgia", Font.PLAIN, 25));
        student_background.add(student_phrase);

        // Regular Button
        // Making a JButton for student class by importing from javax.swing
        switch_regular = new JButton("REGULAR");
        switch_regular.setBounds(220, 290, 220, 100);
        switch_regular.setFont(new Font("Georgia", Font.PLAIN, 30));
        switch_regular.addActionListener(this);
        student_background.add(switch_regular);

        // Dropout Button
        // Making a JButton for student class by importing from javax.swing
        switch_dropout = new JButton("DROPOUT");
        switch_dropout.setBounds(460, 290, 220, 100);
        switch_dropout.setFont(new Font("Georgia", Font.PLAIN, 30));
        student_background.add(switch_dropout);
        switch_dropout.addActionListener(this);// creating actionlistener to add functionality to button

        // set size of frame
        student_frame.setSize(900, 600);
        // close program after pressing close button
        student_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // To make the GUI visible
        student_frame.setVisible(true);
        // setting the frame not resizable
        student_frame.setResizable(false);

    }

    // Making a method to design the GUI second part
    public void regular() {
        // Making JFrame for regular class by importing form javax.swing package
        regular_frame = new JFrame("");
        // Making JPanel for regular class by importing form javax.swing package
        regular_panel = new JPanel();
        regular_panel.setLayout(null);// setting panel Layout to null
        regular_frame.add(regular_panel);
        // Setting Title of Regular frame
        regular_frame.setTitle("Regular Graphic User Interface(GUI)");
        regular_panel.setBounds(0, 0, 900, 600);
        // Setting background color of the GUI
        regular_panel.setBackground(Color.decode("#00c8f8"));

        // Regular Tag
        // Making a JLabel for regular class by importing from javax.swing
        regular_topLabel = new JLabel("Regular");
        regular_topLabel.setBounds(375, 40, 95, 35);
        regular_topLabel.setFont(new Font("Georgia", Font.PLAIN, 25));
        regular_panel.add(regular_topLabel);

        // Dash 1
        // Making a JLabel for regular class by importing from javax.swing
        regular_topDash = new JLabel("-------------");
        regular_topDash.setBounds(370, 60, 120, 25);
        regular_panel.add(regular_topDash);

        // Clear Button
        // Making a JButton for regular class by importing from javax.swing
        regular_clear_button = new JButton("Clear");
        regular_clear_button.setBounds(667, 40, 80, 40);
        regular_clear_button.addActionListener(this);// creating actionlistener to add functionality to button
        regular_panel.add(regular_clear_button);

        // Go back button
        // Making a JButton for regular class by importing from javax.swing
        regular_goBack_button = new JButton("Go Back");
        regular_goBack_button.setBounds(760, 40, 80, 40);
        regular_goBack_button.addActionListener(this);// creating actionlistener to add functionality to button
        regular_panel.add(regular_goBack_button);

        // Tag 1
        // Making a JLabel for regular class by importing from javax.swing
        regular_firstTag = new JLabel("Student Information");
        regular_firstTag.setBounds(50, 100, 210, 25);
        regular_firstTag.setFont(new Font("Georgia", Font.PLAIN, 18));
        regular_panel.add(regular_firstTag);

        // Dash 2
        // Making a JLabel for regular class by importing from javax.swing
        dash = new JLabel("----------------------");
        dash.setBounds(50, 120, 210, 25);
        regular_panel.add(dash);

        // Student Name
        // Making a JLabel for regular class by importing from javax.swing
        regular_student_name = new JLabel("Student Name:");
        regular_student_name.setBounds(50, 150, 110, 20);
        regular_student_name.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_student_name);

        // Making a JTextField for regular class by importing from javax.swing
        regular_txtstudentName = new JTextField("");
        regular_txtstudentName.setBounds(165, 146, 175, 30);
        regular_txtstudentName.setFont(new Font("Georgia", Font.PLAIN, 12));
        regular_panel.add(regular_txtstudentName);

        // Enrollment Id
        // Making a JLabel for regular class by importing from javax.swing
        regular_enrollmentId = new JLabel("Enrollment Id:");
        regular_enrollmentId.setBounds(495, 150, 110, 20);
        regular_enrollmentId.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_enrollmentId);

        // Making a JTextField for regular class by importing from javax.swing
        regular_txtenrollmentId = new JTextField("");
        regular_txtenrollmentId.setBounds(610, 146, 100, 30);
        regular_txtenrollmentId.setFont(new Font("Georgia", Font.PLAIN, 12));
        regular_panel.add(regular_txtenrollmentId);

        // Date Of Birth
        // Making a JLabel for regular class by importing from javax.swing
        regular_datOfBirth = new JLabel("Date of Birth:");
        regular_datOfBirth.setBounds(50, 210, 100, 25);
        regular_datOfBirth.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_datOfBirth);

        // setting date for calander comboBox
        String day[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

        String month[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };

        String year[]={"1995","1996","1997","1998","1999","2000","2001","2002","2003"};
        // Making a JComboBox for regular class by importing from javax.swing
        regular_dobDayComboBox = new JComboBox<String>(day);
        regular_dobDayComboBox.setBounds(150, 210, 70, 30);
        regular_panel.add(regular_dobDayComboBox);

        // Making a JComboBox for regular class by importing from javax.swing
        regular_dobMonthComboBox = new JComboBox<String>(month);
        regular_dobMonthComboBox.setBounds(215, 210, 70, 30);
        regular_panel.add(regular_dobMonthComboBox);

        // Making a JComboBox for regular class by importing from javax.swing
        regular_dobYearComboBox = new JComboBox<String>(year);
        regular_dobYearComboBox.setBounds(280, 210, 85, 30);
        regular_panel.add(regular_dobYearComboBox);

        // Date Of Enrollment
        // Making a JLabel for regular class by importing from javax.swing
        regular_dateOfEnrollment = new JLabel("Date Of Enrollment:");
        regular_dateOfEnrollment.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_dateOfEnrollment.setBounds(455, 210, 160, 25);
        regular_panel.add(regular_dateOfEnrollment);

        // Making a JComboBox for regular class by importing from javax.swing
        regular_doeDayComboBox = new JComboBox<String>(day);
        regular_doeDayComboBox.setBounds(605, 210, 70, 30);
        regular_panel.add(regular_doeDayComboBox);

        // Making a JComboBox for regular class by importing from javax.swing
        regular_doeMonthComboBox = new JComboBox<String>(month);
        regular_doeMonthComboBox.setBounds(670, 210, 70, 30);
        regular_panel.add(regular_doeMonthComboBox);

        // Making a JComboBox for regular class by importing from javax.swing
        regular_doeYearComboBox = new JComboBox<String>(year);
        regular_doeYearComboBox.setBounds(740, 210, 85, 30);
        regular_panel.add(regular_doeYearComboBox);

        // Dash 3
        // Making a JLabel for regular class by importing from javax.swing
        regular_studentend = new JLabel(
            "-----------------------------------------------------------------------------------------------------");
        regular_studentend.setBounds(50, 247, 825, 19);
        regular_panel.add(regular_studentend);

        // Tag 2
        // Making a JLabel for regular class by importing from javax.swing
        regular_secTopLabel = new JLabel("Course Information");
        regular_secTopLabel.setBounds(50, 270, 210, 30);
        regular_secTopLabel.setFont(new Font("Georgia", Font.PLAIN, 18));
        regular_panel.add(regular_secTopLabel);

        // Dash 4
        // Making a JLabel for regular class by importing from javax.swing
        twodash = new JLabel("---------------------");
        twodash.setBounds(50, 290, 210, 25);
        regular_panel.add(twodash);

        // Course Name
        // Making a JLabel for regular class by importing from javax.swing
        regular_courseName = new JLabel("Course Name:");
        regular_courseName.setBounds(50, 380, 125, 25);
        regular_courseName.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_courseName);

        // Making a JTextField for regular class by importing from javax.swing
        regular_txtcourseName = new JTextField("");
        regular_txtcourseName.setBounds(180, 380, 150, 30);
        regular_txtcourseName.setFont(new Font("Georgia", Font.PLAIN, 12));
        regular_panel.add(regular_txtcourseName);

        // Information for Presentpercentage
        // Making a JLabel for regular class by importing from javax.swing
        regular_calculateMessage = new JLabel("Information for PresentPercentage");
        regular_calculateMessage.setBounds(455, 270, 300, 25);
        regular_calculateMessage.setFont(new Font("Georgia", Font.PLAIN, 18));
        regular_panel.add(regular_calculateMessage);
        // Dash 5
        // Making a JLabel for regular class by importing from javax.swing
        regular_fivedash = new JLabel("------------------------------------");
        regular_fivedash.setBounds(455, 290, 340, 20);
        regular_panel.add(regular_fivedash);
        // Number Of Modules
        // Making a JLabel for regular class by importing from javax.swing
        regular_numOfModules = new JLabel("Number Of Modules:");
        regular_numOfModules.setBounds(50, 325, 160, 25);
        regular_numOfModules.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_numOfModules);

        // Making a JTextField for regular class by importing from javax.swing
        regular_txtnumOfModules = new JTextField("");
        regular_txtnumOfModules.setBounds(210, 325, 150, 30);
        regular_txtnumOfModules.setFont(new Font("Georgia", Font.PLAIN, 12));
        regular_panel.add(regular_txtnumOfModules);

        // Course Duration
        // Making a JLabel for regular class by importing from javax.swing
        regular_CourseDuration = new JLabel("Course Duration:");
        regular_CourseDuration.setBounds(455, 325, 160, 25);
        regular_CourseDuration.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_CourseDuration);

        // Making a JTextField for regular class by importing from javax.swing
        regular_txtCourseDuration = new JTextField("");
        regular_txtCourseDuration.setBounds(615, 325, 150, 30);
        regular_txtCourseDuration.setFont(new Font("Georgia", Font.PLAIN, 12));
        regular_panel.add(regular_txtCourseDuration);

        // Number Of Credit Hours
        // Making a JLabel for regular class by importing from javax.swing
        regular_numOfCreditHours = new JLabel("Number Of Credit Hours:");
        regular_numOfCreditHours.setBounds(50, 490, 230, 25);
        regular_numOfCreditHours.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_numOfCreditHours);

        // Making a JTextField for regular class by importing from javax.swing
        regular_txtnumOfCreditHours = new JTextField("");
        regular_txtnumOfCreditHours.setBounds(235, 490, 110, 30);
        regular_txtnumOfCreditHours.setFont(new Font("Georgia", Font.PLAIN, 12));
        regular_panel.add(regular_txtnumOfCreditHours);

        // Tution Fee
        // Making a JLabel for regular class by importing from javax.swing
        regular_tutionfee = new JLabel("Tution Fee:");
        regular_tutionfee.setBounds(50, 435, 100, 25);
        regular_tutionfee.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_tutionfee);

        // Making a JTextField for regular class by importing from javax.swing
        regular_txttutionfee = new JTextField("");
        regular_txttutionfee.setBounds(140, 435, 150, 30);
        regular_txttutionfee.setFont(new Font("Georgia", Font.PLAIN, 12));
        regular_panel.add(regular_txttutionfee);

        // Days Present
        // Making a JLabel for regular class by importing from javax.swing
        regular_daysPresent = new JLabel("Days Present:");
        regular_daysPresent.setBounds(450, 380, 200, 25);
        regular_daysPresent.setFont(new Font("Georgia", Font.PLAIN, 16));
        regular_panel.add(regular_daysPresent);

        // Making a JTextField for regular class by importing from javax.swing
        regular_txtdaysPresent = new JTextField("");
        regular_txtdaysPresent.setBounds(615, 380, 150, 30);
        regular_txtdaysPresent.setFont(new Font("Georgia", Font.PLAIN, 12));
        regular_panel.add(regular_txtdaysPresent);

        // Add Button
        // Making a JButton for regular class by importing from javax.swing
        regular_addButton = new JButton("Add");
        regular_addButton.setBounds(360, 460, 80, 50);
        regular_addButton.addActionListener(this);// creating actionlistener to add functionality to button
        regular_panel.add(regular_addButton);

        // Present Percentage Button
        // Making a JButton for regular class by importing from javax.swing
        regular_presentPercentage = new JButton("Present Percentage");
        regular_presentPercentage.setBounds(450, 460, 140, 50);
        regular_presentPercentage.addActionListener(this);// creating actionlistener to add functionality to button
        regular_panel.add(regular_presentPercentage);

        // Grannt Certificate Button
        // Making a JButton for regular class by importing from javax.swing
        regular_grantCertificate = new JButton("Grant Scholarship");
        regular_grantCertificate.setBounds(610, 460, 130, 50);
        regular_grantCertificate.addActionListener(this);// creating actionlistener to add functionality to button
        regular_panel.add(regular_grantCertificate);

        // Display Button
        // Making a JButton for regular class by importing from javax.swing
        regular_display = new JButton("Display");
        regular_display.setBounds(755, 460, 100, 50);
        regular_display.addActionListener(this);// creating actionlistener to add functionality to button
        regular_panel.add(regular_display);

        // close program after pressing close button
        regular_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set size of frame
        regular_frame.setSize(900, 600);
        // To make the GUI not visible
        regular_frame.setVisible(false);
        // setting the frame not resizable
        regular_frame.setResizable(false);
    }

    // Making a method to design the GUI first part
    public void dropOut() 
    {
        // Making a JFrame for Dropout class by importing from javax.swing
        dropout_frame = new JFrame();
        // Making a JPanel for Dropout class by importing from javax.swing
        dropout_panel = new JPanel();
        dropout_panel.setLayout(null);
        dropout_frame.add(dropout_panel);
        // Setting Title of Dropout frame
        dropout_frame.setTitle("Drop Out Graphic User Interface(GUI)");
        dropout_panel.setBounds(0, 0, 900, 600);
        dropout_panel.setBackground(Color.decode("#00c8f8"));

        // Drop Out Tag
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_topLabel = new JLabel("Drop Out");
        dropout_topLabel.setBounds(380, 40, 110, 35);
        dropout_topLabel.setFont(new Font("Georgia", Font.PLAIN, 25));
        dropout_panel.add(dropout_topLabel);

        // Dash 1
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_dash = new JLabel("---------------");
        dropout_dash.setBounds(372, 65, 123, 20);
        dropout_panel.add(dropout_dash);

        // Clear button
        // Making a JButton for dropout class by importing from javax.swing
        dropout_clearButton = new JButton("Clear");
        dropout_clearButton.setBounds(645, 40, 80, 40);
        dropout_clearButton.addActionListener(this);// creating actionlistener to add functionality to button
        dropout_panel.add(dropout_clearButton);

        // Go back Button
        // Making a JButton for dropout class by importing from javax.swing
        dropout_goBackButton = new JButton("Go Back");
        dropout_goBackButton.setBounds(740, 40, 80, 40);
        dropout_goBackButton.addActionListener(this);// creating actionlistener to add functionality to button
        dropout_panel.add(dropout_goBackButton);

        // Tag one
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_tagOne = new JLabel("Enter Personal Information");
        dropout_tagOne.setFont(new Font("Georgia", Font.PLAIN, 18));
        dropout_tagOne.setBounds(70, 90, 240, 25);
        dropout_panel.add(dropout_tagOne);

        // Dash 2
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_dashTag = new JLabel("-----------------------------");
        dropout_dashTag.setBounds(70, 110, 240, 20);
        dropout_panel.add(dropout_dashTag);

        // Student Name
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_studentName = new JLabel("Student Name: ");
        dropout_studentName.setBounds(70, 135, 130, 25);
        dropout_studentName.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_studentName);

        // Making a JTextField for dropout class by importing from javax.swing
        dropout_txtstudentName = new JTextField();
        dropout_txtstudentName.setBounds(195, 135, 150, 30);
        dropout_txtstudentName.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_txtstudentName);

        // DateOfBirth
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_dateOfBirth = new JLabel("Date Of Birth:");
        dropout_dateOfBirth.setBounds(70, 175, 120, 25);
        dropout_dateOfBirth.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_dateOfBirth);

        // setting date for calander comboBox
        String day[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

        String month[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        String year[]={"1995","1996","1997","1998","1999","2000","2001","2002","2003"};
        // Making a JCOmboBox for dropout class by importing from javax.swing
        dropout_dobDayComboBox = new JComboBox<String>(day);
        dropout_dobDayComboBox.setBounds(180, 175, 70, 30);
        dropout_panel.add(dropout_dobDayComboBox);
        // Making a JCOmboBox for dropout class by importing from javax.swing
        dropout_dobMonthComboBox = new JComboBox<String>(month);
        dropout_dobMonthComboBox.setBounds(250, 175, 70, 30);
        dropout_panel.add(dropout_dobMonthComboBox);
        // Making a JCOmboBox for dropout class by importing from javax.swing
        dropout_dobYearComboBox = new JComboBox<String>(year);
        dropout_dobYearComboBox.setBounds(320, 175, 85, 30);
        dropout_panel.add(dropout_dobYearComboBox);

        // Enrollment ID
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_enrollmentId = new JLabel("Enrollment Id: ");
        dropout_enrollmentId.setBounds(550, 135, 150, 30);
        dropout_enrollmentId.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_enrollmentId);

        // Making a JTextField for dropout class by importing from javax.swing
        dropout_txtenrollmentId = new JTextField("");
        dropout_txtenrollmentId.setBounds(670, 135, 150, 30);
        dropout_txtenrollmentId.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_txtenrollmentId);

        // second tag
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_tagtwo = new JLabel("Enter Course Information");
        dropout_tagtwo.setBounds(70, 230, 220, 25);
        dropout_tagtwo.setFont(new Font("Georgia", Font.PLAIN, 18));
        dropout_panel.add(dropout_tagtwo);

        // Dash 3
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_dashTagTwo = new JLabel("----------------------------");
        dropout_dashTagTwo.setBounds(70, 250, 230, 20);
        dropout_panel.add(dropout_dashTagTwo);

        // third tag
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_tagThree = new JLabel("Calculate Bill Payable");
        dropout_tagThree.setBounds(500, 180, 230, 25);
        dropout_tagThree.setFont(new Font("Georgia", Font.PLAIN, 18));
        dropout_panel.add(dropout_tagThree);

        // Dash 4
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_dashTagThree = new JLabel("----------------------");
        dropout_dashTagThree.setBounds(500, 200, 240, 20);
        dropout_panel.add(dropout_dashTagThree);

        // Course Name
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_courseName = new JLabel("Course Name:");
        dropout_courseName.setBounds(70, 280, 130, 25);
        dropout_courseName.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_courseName);

        // Making a JTextField for dropout class by importing from javax.swing
        dropout_txtcourseName = new JTextField("");
        dropout_txtcourseName.setBounds(175, 280, 150, 30);
        dropout_panel.add(dropout_txtcourseName);

        // Remaining Amount
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_remainingAmount = new JLabel("Remaining Amount:");
        dropout_remainingAmount.setBounds(70, 330, 160, 25);
        dropout_remainingAmount.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_remainingAmount);

        // Making a JTextField for dropout class by importing from javax.swing
        dropout_txtremainingAmount = new JTextField("");
        dropout_txtremainingAmount.setBounds(220, 330, 100, 30);
        dropout_panel.add(dropout_txtremainingAmount);

        // Course Duration
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_courseDuration = new JLabel("Course Duration:");
        dropout_courseDuration.setBounds(520, 280, 130, 25);
        dropout_courseDuration.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_courseDuration);

        // Making a JTextField for dropout class by importing from javax.swing
        dropout_txtcourseDuration = new JTextField("");
        dropout_txtcourseDuration.setBounds(650, 280, 160, 30);
        dropout_panel.add(dropout_txtcourseDuration);

        // Tution Fee
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_tutionFee = new JLabel("Tution Fee:");
        dropout_tutionFee.setBounds(560, 330, 160, 25);
        dropout_tutionFee.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_tutionFee);

        // Making a JTextField for dropout class by importing from javax.swing
        dropout_txttutionFee = new JTextField("");
        dropout_txttutionFee.setBounds(650, 330, 160, 30);
        dropout_panel.add(dropout_txttutionFee);

        // Date Of Enrollment
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_dateOfEnrollment = new JLabel("Date Of Enrollment:");
        dropout_dateOfEnrollment.setBounds(70, 375, 190, 25);
        dropout_dateOfEnrollment.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_dateOfEnrollment);

        // Making a JComboBox for dropout class by importing from javax.swing
        dropout_doeDayComboBox = new JComboBox<String>(day);
        dropout_doeDayComboBox.setBounds(220, 375, 70, 30);
        dropout_panel.add(dropout_doeDayComboBox);

        // Making a JComboBox for dropout class by importing from javax.swing
        dropout_doeMonthComboBox = new JComboBox<String>(month);
        dropout_doeMonthComboBox.setBounds(290, 375, 70, 30);
        dropout_panel.add(dropout_doeMonthComboBox);

        // Making a JComboBox for dropout class by importing from javax.swing
        dropout_doeYearComboBox = new JComboBox<String>(year);
        dropout_doeYearComboBox.setBounds(360, 375, 85, 30);
        dropout_panel.add(dropout_doeYearComboBox);

        // fourth tag
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_tagFour = new JLabel("Enter Date Of Drop Out");
        dropout_tagFour.setBounds(500, 370, 230, 25);
        dropout_tagFour.setFont(new Font("Georgia", Font.PLAIN, 18));
        dropout_panel.add(dropout_tagFour);

        // Dash 5
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_dashTagFour = new JLabel("------------------------");
        dropout_dashTagFour.setBounds(500, 390, 220, 20);
        dropout_panel.add(dropout_dashTagFour);

        // Number Of Remaining Modules
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_numOfRemainingModules = new JLabel("Number Of Remaining Modules:");
        dropout_numOfRemainingModules.setBounds(70, 420, 250, 25);
        dropout_numOfRemainingModules.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_numOfRemainingModules);

        // Making a JTextField for dropout class by importing from javax.swing
        dropout_txtnumOfRemainingModules = new JTextField();
        dropout_txtnumOfRemainingModules.setBounds(310, 420, 100, 30);
        dropout_panel.add(dropout_txtnumOfRemainingModules);

        // Number Of Remaining Modules
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_numOfMonthAttended = new JLabel("Number Of Month Attended:");
        dropout_numOfMonthAttended.setBounds(500, 230, 240, 25);
        dropout_numOfMonthAttended.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_numOfMonthAttended);

        // Making a JTextField for dropout class by importing from javax.swing
        dropout_txtnumOfMonthAttended = new JTextField();
        dropout_txtnumOfMonthAttended.setBounds(710, 230, 100, 30);
        dropout_panel.add(dropout_txtnumOfMonthAttended);

        // Date Of Drop Out
        // Making a JLabel for dropout class by importing from javax.swing
        dropout_dateOfDropout = new JLabel("Date Of Drop Out:");
        dropout_dateOfDropout.setBounds(500, 420, 190, 25);
        dropout_dateOfDropout.setFont(new Font("Georgia", Font.PLAIN, 16));
        dropout_panel.add(dropout_dateOfDropout);

        // Making a JComboBox for dropout class by importing from javax.swing
        dropout_dodDayComboBox = new JComboBox<String>(day);
        dropout_dodDayComboBox.setBounds(640, 420, 70, 30);
        dropout_panel.add(dropout_dodDayComboBox);

        // Making a JComboBox for dropout class by importing from javax.swing
        dropout_dodMonthComboBox = new JComboBox<String>(month);
        dropout_dodMonthComboBox.setBounds(710, 420, 70, 30);
        dropout_panel.add(dropout_dodMonthComboBox);

        // Making a JComboBox for dropout class by importing from javax.swing
        dropout_dodYearComboBox = new JComboBox<String>(year);
        dropout_dodYearComboBox.setBounds(780, 420, 85, 30);
        dropout_panel.add(dropout_dodYearComboBox);

        // Add Button
        // Making a JButton for dropout class by importing from javax.swing
        dropout_addButton = new JButton("Add");
        dropout_addButton.setBounds(520, 470, 90, 50);
        dropout_addButton.addActionListener(this);// creating actionlistener to add functionality to button
        dropout_panel.add(dropout_addButton);

        // Bills Payable Button
        // Making a JButton for dropout class by importing from javax.swing
        dropout_billsPayable = new JButton("Bills Payable");
        dropout_billsPayable.setBounds(730, 370, 110, 50);
        dropout_billsPayable.addActionListener(this);// creating actionlistener to add functionality to button
        dropout_panel.add(dropout_billsPayable);

        // Remove Student Button
        // Making a JButton for dropout class by importing from javax.swing
        dropout_removeStudent = new JButton("Remove Student");
        dropout_removeStudent.setBounds(620, 470, 130, 50);
        dropout_removeStudent.addActionListener(this);// creating actionlistener to add functionality to button
        dropout_panel.add(dropout_removeStudent);

        // Display Button
        // Making a JButton for dropout class by importing from javax.swing
        dropout_display = new JButton("Display");
        dropout_display.setBounds(760, 470, 110, 50);
        dropout_display.addActionListener(this);// creating actionlistener to add functionality to button
        dropout_panel.add(dropout_display);

        // close program after pressing close button
        dropout_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set size of frame
        dropout_frame.setSize(900, 600);
        // to make the GUI hidden
        dropout_frame.setVisible(false);
        // setting the frame not resizable
        dropout_frame.setResizable(false);

    }

    // The actionPerformed methods which provide functionality to all JButton
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // switch to regular frame disposing student_frame
        // link button to all the frame which will connect to Actionlistener
        if (e.getSource() == switch_regular) 
        {
            student_frame.dispose();// it throws out the student frame
            regular_frame.setVisible(true);// setting regular frame visible
            // switch to dropout frame disposing student_frame
        } 
        else if (e.getSource() == switch_dropout) 
        {
            student_frame.dispose();// it throws out the student frame
            dropout_frame.setVisible(true);// setting dropout frame visible
            // clearing all JTextField of regular class
        } 
        else if (e.getSource() == regular_clear_button) 
        {
            // clear all the Field
            regular_txtstudentName.setText("");
            regular_txtenrollmentId.setText("");
            regular_txtcourseName.setText("");
            regular_txtnumOfModules.setText("");
            regular_txtCourseDuration.setText("");
            regular_txtnumOfCreditHours.setText("");
            regular_txttutionfee.setText("");
            regular_txtdaysPresent.setText("");
            //reseting combobox to normal
            regular_dobDayComboBox.setSelectedIndex(0);
            regular_dobMonthComboBox.setSelectedIndex(0);
            regular_dobYearComboBox.setSelectedIndex(0);
            regular_doeDayComboBox.setSelectedIndex(0);
            regular_doeMonthComboBox.setSelectedIndex(0);
            regular_doeYearComboBox.setSelectedIndex(0);
            // Output Dialouge Box
            JOptionPane.showMessageDialog(regular_frame, "Regular Infromation is Cleared!!!!", "CLEAR",
                JOptionPane.INFORMATION_MESSAGE);
            // to switch from regular to student frame
        } 
        else if (e.getSource() == regular_goBack_button) 
        {
            regular_frame.dispose();// it throws out regular_frame
            student_frame.setVisible(true);// setting student_frame visible
            // Add button of regular frame
        }
        else if (e.getSource() == regular_addButton)
        {
            try
            {
                if (regular_txtstudentName.getText().equals("") || regular_txtenrollmentId.getText().equals("")
                || regular_txtcourseName.getText().equals("") ||
                regular_txtnumOfModules.getText().equals("") || regular_txtCourseDuration.getText().equals("")
                || regular_txtnumOfCreditHours.getText().equals("") ||
                regular_txttutionfee.getText().equals("") || regular_txtdaysPresent.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(regular_frame, "Enter all the details!!", "FILL UP",
                        JOptionPane.WARNING_MESSAGE);
                }
                else if(Integer.parseInt(regular_txtenrollmentId.getText())<1
                ||Integer.parseInt(regular_txtCourseDuration.getText())<1
                ||Integer.parseInt(regular_txtnumOfModules.getText())<1
                ||Integer.parseInt(regular_txtnumOfCreditHours.getText())<1
                ||Integer.parseInt(regular_txttutionfee.getText())<1
                ||Integer.parseInt(regular_txtdaysPresent.getText())<1)
                {
                    JOptionPane.showMessageDialog(regular_frame , "Please dont enter negative value in the box","Error",JOptionPane.ERROR_MESSAGE);
                }

                else 
                {
                    //try to check if the value input are correct or not
                    try 
                    {
                        //try to check if value enter is true or not
                        String combo_aryDayDob = regular_dobDayComboBox.getSelectedItem().toString();
                        String combo_aryMonthDob = regular_dobMonthComboBox.getSelectedItem().toString();
                        String combo_aryYearDob = regular_dobYearComboBox.getSelectedItem().toString();
                        String regular_aryDateOfBirth = (combo_aryDayDob + "-" + combo_aryMonthDob + "-"
                                + combo_aryYearDob);//get Date Of Birth ComboBox
                        String regular_aryStudentName = regular_txtstudentName.getText();//get Student Name
                        int regular_aryCourseDuration = Integer.parseInt(regular_txtCourseDuration.getText());//Get Course Duration
                        int regular_aryTutionFee = Integer.parseInt(regular_txttutionfee.getText());//Get Tution Fee
                        int regular_aryEnrollmentId = Integer.parseInt(regular_txtenrollmentId.getText());//get Enrollment Id
                        String regular_aryCourseName = regular_txtcourseName.getText();//get course name
                        String combo_aryDayDoe = regular_doeDayComboBox.getSelectedItem().toString();
                        String combo_aryMonthDoe = regular_doeMonthComboBox.getSelectedItem().toString();
                        String combo_aryYearDoe = regular_doeYearComboBox.getSelectedItem().toString();
                        String regular_aryDateOfEnrollment = (combo_aryDayDoe + "-" + combo_aryMonthDoe + "-"
                                + combo_aryYearDoe);//get Date Of Enrollment
                        int regular_aryNumOfModules = Integer.parseInt(regular_txtnumOfModules.getText());//get Number Of Modules
                        int regular_aryNumOfCreditHours = Integer.parseInt(regular_txtnumOfCreditHours.getText());//get Num of credit hours
                        double regular_aryDaysPresent = Double.parseDouble(regular_txtdaysPresent.getText());
                        boolean regular_existSys = false;
                        //string validation
                        if (regular_aryStudentName.matches("[a-zA-Z]+") && regular_aryCourseName.matches("[a-zA-Z]+"))
                        {
                            // For each loop to check element drom array list
                            for (Student student_Object : Ary_List) 
                            {
                                // iteration and checking if enrollment id is proper
                                if (student_Object.getenrollmentID() == regular_aryEnrollmentId
                                && student_Object instanceof Regular)
                                {
                                    regular_existSys = true;
                                    break;
                                }
                                else 
                                {
                                    regular_existSys = false;
                                }
                            }

                            if (regular_existSys == false) 
                            {
                                //creating an object of Regular class 
                                Regular regular_Object = new Regular(regular_aryDateOfBirth, regular_aryStudentName,
                                        regular_aryCourseDuration, regular_aryTutionFee, regular_aryEnrollmentId,
                                        regular_aryCourseName, regular_aryDateOfEnrollment, regular_aryNumOfModules,
                                        regular_aryNumOfCreditHours, regular_aryDaysPresent);
                                Ary_List.add(regular_Object);//adding value to array list

                                JOptionPane.showMessageDialog(regular_frame,
                                    " Regular Student Inforamtion Added Succesfully.\n Enrollment ID: "
                                    + regular_aryEnrollmentId + "\n Student Name: " + regular_aryStudentName
                                    + "\n Date Of Birth: " + regular_aryDateOfBirth + "\n Date Of Enrollment: "
                                    + regular_aryDateOfEnrollment + "\n Course Name:" + regular_aryCourseName
                                    + "\n Course Duration: " + regular_aryCourseDuration + "\n Tution Fee: "
                                    + regular_aryTutionFee + "\n Number Of Modules: " + regular_aryNumOfModules
                                    + "\n Number Of Credit Hours: " + regular_aryNumOfCreditHours
                                    + "\n Days Present: " + regular_aryDaysPresent,
                                    "Added To Regular Student", JOptionPane.INFORMATION_MESSAGE);
                            } 

                            else 
                            {
                                JOptionPane.showMessageDialog(regular_frame,
                                    "The Enrollment Id: " + regular_aryEnrollmentId
                                    + " already Exist in the Regular Student System.",
                                    "Duplication Of Student Enrollment Id ", JOptionPane.ERROR_MESSAGE);
                            }
                        } 

                        else 
                        {
                            JOptionPane.showMessageDialog(regular_frame,
                                "The Course Name and Student Name should not be integer","Warning",JOptionPane.WARNING_MESSAGE);
                        }

                    } // catching if string or any other data type is entered in the place of integer

                    catch (NumberFormatException exe)
                    {
                        JOptionPane.showMessageDialog(regular_frame,
                            " Some Value Dont Take Number Input Please Enter Carefully!!! ", "Not Valid",
                            JOptionPane.ERROR_MESSAGE);
                    }
                } 
            }
            catch(NumberFormatException exe)
            {
                JOptionPane.showMessageDialog(regular_frame, " Some Value Dont Take Number Input Please Enter Carefully!!! ", "Not Valid",
                            JOptionPane.ERROR_MESSAGE);
            }

        } //To bring present percentage button to function
        else if (e.getSource() == regular_presentPercentage)
        {
            //checking if the array list is empty or not so further button function properly
            if (Ary_List.isEmpty()) 
            {
                JOptionPane.showMessageDialog(regular_frame, "The System Is Empty Please Fill the Space Again!!",
                    "Re-Input",
                    JOptionPane.ERROR_MESSAGE);
            } 
            else 
            {
                //try to check if value enter is true or not
                try 
                {
                    int regular_aryEnrollmentId = Integer.parseInt(regular_txtenrollmentId.getText());//get Enrollment id

                    // for each loop
                    for (Student student_Object : Ary_List)
                    {
                        // iteration
                        if (student_Object instanceof Regular) 
                        {
                            // down casting
                            Regular reg_Object = (Regular) student_Object;
                            //check if enrollemnt id macthes or not
                            if (reg_Object.getenrollmentID() == regular_aryEnrollmentId) 
                            {
                                //char to return string statement from Regular class 
                                char present_p = reg_Object.presentPercentage(reg_Object.getdaysPresent());
                                //calling method from regular class
                                reg_Object.presentPercentage(reg_Object.getdaysPresent());
                                if (present_p == '\0')
                                {
                                    JOptionPane.showMessageDialog(regular_frame,
                                        "Days Present of Student can't be greater than CourseDuration.", "Alert",
                                        JOptionPane.ERROR_MESSAGE);
                                } 
                                else
                                {
                                    JOptionPane.showMessageDialog(regular_frame,
                                        "The Grade Obtained is: " + present_p,
                                        "Grade", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    }// catching if string or any other data type is entered in the place of integer
                } 
                catch (NumberFormatException exe) 
                {
                    JOptionPane.showMessageDialog(regular_frame,
                        "Some Value Dont Take Number Input Please Enter Carefully!!! ", "Not Valid",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        // To bring grant Certificate to fucntion 
        else if (e.getSource() == regular_grantCertificate)
        {
            //checking if the array list is empty or not so further button function properly
            if (Ary_List.isEmpty())
            {
                JOptionPane.showMessageDialog(regular_frame, "The System Is Empty Please Fill the Space Again",
                    "Re-Input",
                    JOptionPane.ERROR_MESSAGE);
            } 
            else
            {
                //try to check if value enter is true or not
                try
                {
                    int regular_aryEnrollmentId = Integer.parseInt(regular_txtenrollmentId.getText());//Get Enrollment Id
                    //for each loop
                    for (Student student_Object : Ary_List) 
                    {
                        //iteration
                        if (student_Object instanceof Regular)
                        {
                            //downcasting
                            Regular reg_Object = (Regular) student_Object;
                            //checking if enrollment id is proper or not
                            if (reg_Object.getenrollmentID() == regular_aryEnrollmentId)
                            {
                                //calling method from regular class
                                reg_Object.grantCertificate(reg_Object.getcourseName(), regular_aryEnrollmentId,
                                    reg_Object.getdateOfEnrollment());
                                if (reg_Object.getisGrantedScholarship() == true) 
                                {
                                    JOptionPane.showMessageDialog(regular_frame,
                                        " CONGRATULATIONS!! Scholarship Has Been Granted To You!!!",
                                        "Scholarship Inforamtion", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else 
                                {
                                    JOptionPane.showMessageDialog(regular_frame,
                                        "You have failed to receive the scholarship", "Scholarship Inforamtion",
                                        JOptionPane.ERROR_MESSAGE);
                                }
                            }

                        }
                    }// catching if string or any other data type is entered in the place of integer
                } 
                catch (NumberFormatException exe) {
                    JOptionPane.showMessageDialog(regular_frame,
                        "Some Value Dont Take Number Input Please Enter Carefully!!!", "Not Valid",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //To bring display button to function
        else if (e.getSource() == regular_display)
        {
            //TO check if the array list is empty
            if (Ary_List.isEmpty())
            {
                JOptionPane.showMessageDialog(regular_frame, "The System Is Empty Please Fill the Space Again",
                    "Re-Input", JOptionPane.ERROR_MESSAGE);
            } 
            else
            {
                //try to check if value enter is true or not
                try 
                {
                    //making a boolean flag 
                    boolean ggflag = false;
                    String regular_displayAll = "";
                    for (Student student_Object : Ary_List)
                    {
                        if (student_Object instanceof Regular)
                        {
                            Regular reg_Object = (Regular) student_Object;
                            //calling method from regular class
                            reg_Object.display();
                            regular_displayAll = ("\n" + "Student's Enrollment Id: " + reg_Object.getenrollmentID()
                                + "\nStudent Name: "
                                + reg_Object.getstudentName() + "\nCourse Name of Student: "
                                + reg_Object.getcourseName() + "\nDate Of Birth of Student: "
                                + reg_Object.getdateOfBirth() + "\nDate Of Enrollment of Student: "
                                + reg_Object.getdateOfEnrollment() + "\nCourse Duration: "
                                + reg_Object.getcourseDuration() + "\nTution fee: "
                                + reg_Object.gettutionFee() + "\nNumber Of Modules: "
                                + reg_Object.getnumOfModules() + "\nNumber Of Credit Hours: "
                                + reg_Object.getnumOfCreditHours() + "\nDays Present: "
                                + reg_Object.getdaysPresent()) + "\n" + "=============================" + "\n"
                            + regular_displayAll;

                            ggflag = true;
                        }
                    }

                    if (ggflag == false)
                    {
                        JOptionPane.showMessageDialog(regular_frame, "The Space Are Empty Fill It Properly.",
                            "Re-Check", JOptionPane.ERROR_MESSAGE);
                    } 
                    else
                    {
                        JOptionPane.showMessageDialog(regular_frame, regular_displayAll);
                    }// catching if string or any other data type is entered in the place of integer
                } 
                catch (NumberFormatException exe) 
                {
                    JOptionPane.showMessageDialog(regular_frame,
                        "Some Value Dont Take Number Input Please Enter Carefully!!!",
                        "Not Valid", JOptionPane.ERROR_MESSAGE);
                }
            }

        }// to switch from dropout to student frame
        else if (e.getSource() == dropout_goBackButton)
        {
            dropout_frame.dispose();// to throw out dropout_frame
            student_frame.setVisible(true);// to make student_frame visible
            // clear all the field
        } 
        else if (e.getSource() == dropout_clearButton) 
        {
            // setting all the field empty
            dropout_txtstudentName.setText("");
            dropout_txtenrollmentId.setText("");
            dropout_txtcourseName.setText("");
            dropout_txtremainingAmount.setText("");
            dropout_txtcourseDuration.setText("");
            dropout_txttutionFee.setText("");
            dropout_txtnumOfRemainingModules.setText("");
            dropout_txtnumOfMonthAttended.setText("");
            //reseting combobox to normal
            dropout_dobDayComboBox.setSelectedIndex(0);
            dropout_dobMonthComboBox.setSelectedIndex(0);
            dropout_dobYearComboBox.setSelectedIndex(0);
            dropout_doeDayComboBox.setSelectedIndex(0);
            dropout_doeMonthComboBox.setSelectedIndex(0);
            dropout_doeYearComboBox.setSelectedIndex(0);
            dropout_dodDayComboBox.setSelectedIndex(0);
            dropout_dodMonthComboBox.setSelectedIndex(0);
            dropout_dodYearComboBox.setSelectedIndex(0);
        } 
        else if (e.getSource() == dropout_addButton)
        {
            try
            {
            //checking if the JText Field is empty and giving suitable message
            if (dropout_txtstudentName.getText().isEmpty() || dropout_txtenrollmentId.getText().isEmpty()
            || dropout_txtcourseName.getText().isEmpty() || dropout_txtremainingAmount.getText().isEmpty() ||
            dropout_txtcourseDuration.getText().isEmpty() || dropout_txttutionFee.getText().isEmpty()
            || dropout_txtnumOfRemainingModules.getText().isEmpty() ||
            dropout_txtnumOfMonthAttended.getText().isEmpty()) 
            {
                JOptionPane.showMessageDialog(dropout_frame, "The fill up  the empty spaces  in the form");
            } 
            else if(Integer.parseInt(dropout_txtenrollmentId.getText())<1
            ||Integer.parseInt(dropout_txtcourseDuration.getText())<1
            ||Integer.parseInt(dropout_txtnumOfRemainingModules.getText())<1
            ||Integer.parseInt(dropout_txtnumOfMonthAttended.getText())<1
            ||Integer.parseInt(dropout_txttutionFee.getText())<1)
            {
                JOptionPane.showMessageDialog(regular_frame , "Please dont enter negative value in the box","Error",JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                //try to check if value enter is true or not
                try {
                    //try to check if value enter is true or not
                    String combo_aryDayDob = dropout_dobDayComboBox.getSelectedItem().toString();
                    String combo_aryMonthDob = dropout_dobMonthComboBox.getSelectedItem().toString();
                    String combo_aryYearDob = dropout_dobYearComboBox.getSelectedItem().toString();
                    String dropout_aryDateOfBirth = (combo_aryDayDob + "-" + combo_aryMonthDob + "-"
                            + combo_aryYearDob);//Get Date Of Birth
                    String dropout_aryStudentName = dropout_txtstudentName.getText();//Get Student Name
                    int dropout_aryCourseDuration = Integer.parseInt(dropout_txtcourseDuration.getText());//Get Course Duration
                    int dropout_aryTutionFee = Integer.parseInt(dropout_txttutionFee.getText());//Get Tution Fee
                    int dropout_aryNumOfRemainingModules = Integer.parseInt(dropout_txtnumOfRemainingModules.getText());//Get Number Of Remaining Modules
                    int dropout_aryNumOfMonthsAttended = Integer.parseInt(dropout_txtnumOfMonthAttended.getText());//Get Number Of Month Attended

                    String combo_aryDayDod = dropout_dodDayComboBox.getSelectedItem().toString();
                    String combo_aryMonthDod = dropout_dodMonthComboBox.getSelectedItem().toString();
                    String combo_aryYearDod = dropout_dodYearComboBox.getSelectedItem().toString();
                    String dropout_aryDateOfDropout = (combo_aryDayDod + "-" + combo_aryMonthDod + "-"
                            + combo_aryYearDod);//Get Date Of Dropout

                    int dropout_aryEnrollmentId = Integer.parseInt(dropout_txtenrollmentId.getText());
                    String combo_aryDayDoe = dropout_doeDayComboBox.getSelectedItem().toString();
                    String combo_aryMonthDoe = dropout_doeMonthComboBox.getSelectedItem().toString();
                    String combo_aryYearDoe = dropout_doeYearComboBox.getSelectedItem().toString();
                    String dropout_aryDateOfEnrollment = (combo_aryDayDoe + "-" + combo_aryMonthDoe + "-"
                            + combo_aryYearDoe);//Get Date Of Enrollment
                    String dropout_aryCourseName = dropout_txtcourseName.getText();
                    boolean dropout_existSys = false;
                    //String Validation
                    if (dropout_aryStudentName.matches("[a-zA-Z]+") && dropout_aryCourseName.matches("[a-zA-Z]+")) 
                    {
                        if(dropout_aryEnrollmentId<1 
                        || dropout_aryCourseDuration<1 
                        ||dropout_aryTutionFee <1 
                        || dropout_aryNumOfRemainingModules<1 
                        || dropout_aryNumOfMonthsAttended<1)
                        {
                            JOptionPane.showMessageDialog(regular_frame , "Please dont enter negative value in the box","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        //for each loop
                        for (Student student_Object : Ary_List)
                        {
                            //cheking if enrollment id matches and iterating
                            if (student_Object.getenrollmentID() == dropout_aryEnrollmentId
                            && student_Object instanceof DropOut)
                            {

                                dropout_existSys = true;
                                break;
                            } 
                            else 
                            {
                                dropout_existSys = false;
                            }

                        }
                        if (dropout_existSys == false)
                        {
                            //making object of Dropout class
                            DropOut dropout_Object = new DropOut(dropout_aryDateOfBirth, dropout_aryStudentName,
                                    dropout_aryCourseDuration, dropout_aryTutionFee, dropout_aryNumOfRemainingModules,
                                    dropout_aryNumOfMonthsAttended, dropout_aryDateOfDropout, dropout_aryEnrollmentId,
                                    dropout_aryDateOfEnrollment, dropout_aryCourseName);
                            //adding dropout object to array list
                            Ary_List.add(dropout_Object);

                            JOptionPane.showMessageDialog(dropout_frame,
                                "Dropout Student Information Added Succsfully. \n Enrollment ID: "
                                + dropout_aryEnrollmentId + "\n Student Name: " + dropout_aryStudentName
                                + "\n Date Of Birth:" + dropout_aryDateOfBirth + "\n Course Duration;"
                                + dropout_aryCourseDuration + "\n Tution Fee: " + dropout_aryTutionFee
                                + "\n Number Of  Remainig Modules: " + dropout_aryNumOfRemainingModules
                                + "\n Number Of Month Attended: " + dropout_aryNumOfMonthsAttended
                                + "\n Date Of Dropout: " + dropout_aryDateOfDropout
                                + "\n Date Of Enrollment: " + dropout_aryDateOfEnrollment
                                + "\n Course Name: "
                                + dropout_aryCourseName);
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(dropout_frame, "The Enrollment Id: " + dropout_aryEnrollmentId
                                + " already Exist in the Regular Student System.",
                                "Duplication Of Student Enrollment Id ", JOptionPane.ERROR_MESSAGE);

                        }

                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(dropout_frame,
                            "The course name and student name should not be number.");
                    }// catching if string or any other data type is entered in the place of integer
                } 
                catch (NumberFormatException exe) 
                {
                    JOptionPane.showMessageDialog(dropout_frame,
                        "Some Value Take Number Input Please Enter Carefully!!! ", "Not Valid",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
            }
            catch (NumberFormatException exe) 
                {
                    JOptionPane.showMessageDialog(dropout_frame,
                        "Some Value Take Number Input Please Enter Carefully!!! ", "Not Valid",
                        JOptionPane.ERROR_MESSAGE);
                }
            
            //To bring bills payable to function
        } 
        else if (e.getSource() == dropout_billsPayable)
        {
            //checking if the array list is empty
            if (Ary_List.isEmpty()) 
            {
                JOptionPane.showMessageDialog(dropout_frame, "Please fill the Gap Properly without leaving gap empty!",
                    "Attention", JOptionPane.ERROR_MESSAGE);
            } 
            else 
            {
                //try to check if value enter is true or not
                try 
                {
                    int dropout_aryEnrollmentId = Integer.parseInt(dropout_txtenrollmentId.getText());//get enrollemnt ID
                    String dropout_aryStudentName = dropout_txtstudentName.getText();//get Student Name
                    //for each loop
                    for (Student student_Object : Ary_List) 
                    {
                        //iteration
                        if (student_Object instanceof DropOut)
                        {
                            //downcasting 
                            DropOut drp_Object = (DropOut) student_Object;
                            //checking enrollment matches or not
                            if (drp_Object.getenrollmentID() == dropout_aryEnrollmentId)
                            {
                                drp_Object.billsPayable();
                                JOptionPane.showMessageDialog(dropout_frame,
                                    "The Bill has been paid of the Student:" + dropout_aryStudentName, "Thank You",
                                    JOptionPane.INFORMATION_MESSAGE);
                            }

                        }
                    }// catching if string or any other data type is entered in the place of integer
                } 
                catch (NumberFormatException exe) 
                {
                    JOptionPane.showMessageDialog(dropout_frame,
                        "Some Value Dont Take Number Input Please Enter Carefully!!! ", "Not Valid",
                        JOptionPane.ERROR_MESSAGE);
                }
            }

        } 
        else if (e.getSource() == dropout_removeStudent) 
        {
            if (Ary_List.isEmpty())
            {
                JOptionPane.showMessageDialog(dropout_frame, "Please fill the Gap Properly without leaving gap empty!",
                    "Attention", JOptionPane.ERROR_MESSAGE);
            } 
            else
            {
                //try to check if value enter is true or not
                try
                {
                    int dropout_aryEnrollmentId = Integer.parseInt(dropout_txtenrollmentId.getText());//get Enrollment Id
                    //for each loop
                    for (Student student_Object : Ary_List) 
                    {
                        //iteration
                        if (student_Object instanceof DropOut) 
                        {
                            //downcasting
                            DropOut drp_Object = (DropOut) student_Object;
                            //chekcing if enrollment id matches 
                            if (drp_Object.getenrollmentID() == dropout_aryEnrollmentId) 
                            {
                                //calling method from dropout class
                                drp_Object.removeStudent();
                                if (drp_Object.gethasPaid() == true) 
                                {
                                    JOptionPane.showMessageDialog(dropout_frame,
                                        "The Information has been cleared of Enrollemtnt Id: "
                                        + dropout_aryEnrollmentId,"CLear",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(dropout_frame,
                                        "The Bills Are Not Cleared.Clear It On Time", "Not Paid",
                                        JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    }// catching if string or any other data type is entered in the place of integer
                } 
                catch (NumberFormatException exe)
                {
                    JOptionPane.showMessageDialog(dropout_frame,
                        "Check if the blank that requires number are entered!!");
                }
            }
        } 
        else if (e.getSource() == dropout_display) 
        {
            if (Ary_List.isEmpty()) 
            {
                JOptionPane.showMessageDialog(dropout_frame, "No Students Found", "Error", JOptionPane.WARNING_MESSAGE);
            }
            else 
            {
                //try to check if value enter is true or not
                try
                {
                    //declaring a variable to store all the information of the  dropout student
                    String dropDisplayAll = "";
                    //flag
                    boolean drpggflag = false;
                    //for each loop
                    for (Student student_Object : Ary_List) 
                    {
                        //iteraton
                        if (student_Object instanceof DropOut) 
                        {
                            //dewoncasting
                            DropOut drp_Object = (DropOut) student_Object;
                            //calling method from dropout classs
                            drp_Object.display();
                            dropDisplayAll = ("\n" + " Student's Enrollment Id: " + drp_Object.getenrollmentID()
                                + "\n Student name: " + drp_Object.getstudentName() + "\n Date Of Birth: "
                                + drp_Object.getdateOfBirth() + "\n Course Duration: "
                                + drp_Object.getcourseDuration() + "\n Tution Fee:  " + drp_Object.gettutionFee()
                                + "\n Number Of Remaining modules: " + drp_Object.getnumOfRemainingModules()
                                + "\n Number Of Month Attended: " + drp_Object.getnumOfMonthsAttended()
                                + "\n Date Of Dropout: " + drp_Object.getdateOfDropOut() + "\n Date Of Enrollment: "
                                + drp_Object.getdateOfEnrollment() + "\n Course Name: "
                                + drp_Object.getcourseName() + "\n Remining Amount: "
                                + drp_Object.getremainingAmount()) + "\n" + "========================"
                            + dropDisplayAll;
                            drpggflag = true;
                        }
                    }
                    if (drpggflag == false)
                    {
                        JOptionPane.showMessageDialog(dropout_frame, "The Space Are Empty Fill It Properly.",
                            "Re-Check", JOptionPane.ERROR_MESSAGE);
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(dropout_frame, dropDisplayAll);
                    }// catching if string or any other data type is entered in the place of integer
                } 
                catch (NumberFormatException exe) 
                {
                    JOptionPane.showMessageDialog(dropout_frame,
                        "Check if the blank that requires number are entered!!");
                }
            }
        }
    }

    // calling main method to call all the GUI
    public static void main(String[] args) 
    {
        new StudentGUI();
    }
}
