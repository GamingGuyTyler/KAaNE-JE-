/**
 * KAaNE Modloader Version 0.1
 *
 * Made by ggtylerr for the KTaNE assistant program KAaNE JE.
 *
 * Started ~1:00 AM 5/22/2019
 *
 * Finished on 3:24 AM 5/22/2019
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class modloader {
    static JFrame f;
    static private final String newline = "\n";
    static File file;
    static boolean settingsOpen = false;
    static String className = "";
    public static void menu() {
        f = new JFrame("KAaNE [MODLOADER]");
        ImageIcon icon = new ImageIcon("imgs/icons/modloader.png");
        f.setIconImage(icon.getImage());
        // Define Buttons
        JButton open = new JButton("OPEN");
        open.setBounds(5,5,90,30);
        JButton launch = new JButton("LAUNCH");
        launch.setBounds(5,40,90,30);
        ImageIcon settingIcon = new ImageIcon("imgs/icons/modloader settings.png");
        JButton settings = new JButton(settingIcon);
        settings.setBounds(5,110,50,50);
        // Define Log Text Area
        JTextArea log = new JTextArea();
        log.setBounds(0,0,290,160);
        log.setEditable(false);
        log.setLineWrap(true);
        log.setWrapStyleWord(true);
        // Define Checkboxes
        JCheckBox methodCB = new JCheckBox("Default Method Name (module)");
        methodCB.setBounds(110,180,300,20);
        JCheckBox classCB = new JCheckBox("Class Name = File Name");
        classCB.setBounds(110,210,300,20);
        methodCB.setSelected(true);
        classCB.setSelected(true);
        // Define Setting Text Boxes
        JTextField methodTB = new JTextField("module");
        methodTB.setBounds(5,180,100,20);
        methodTB.setEditable(false);
        JTextField classTB = new JTextField();
        classTB.setBounds(5,210,100,20);
        classTB.setEditable(false);
        // Make a Scroll Pane for the Log
        JScrollPane sp = new JScrollPane(log);
        sp.setBounds(100,5,290,160);
        // Define File Chooser
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setCurrentDirectory(new File(System.getProperties().getProperty("user.dir")));
        // Add everything
        f.getContentPane().add(sp);
        f.add(open); f.add(launch);
        f.add(settings);
        f.add(methodCB); f.add(classCB);
        f.add(methodTB); f.add(classTB);
        // Define JFrame
        f.setLayout(null);
        f.setSize(400,200);
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        // Open
        open.addActionListener((ActionEvent e) -> {
            int returnVal = fc.showOpenDialog(null);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                log.append("Selected: " + file.getName() + "." + newline);
                log.append("Selected Path: " + file.getAbsolutePath() + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());
        });
        // Launch
        launch.addActionListener((ActionEvent e) -> {
            log.append("Launching " + file.getName() + newline);
            System.out.println("[MODLOADER] Launching " + file.getName());
            try {
                // Grab the URL of the file
                URL url = file.getParentFile().toURI().toURL();
                URL[] urls = new URL[]{url};
                System.out.println("[MODLOADER] URL of file: " + url);
                // Make a ClassLoader
                URLClassLoader cl = new URLClassLoader(urls);
                // If the class name = file name
                if (classCB.isSelected()) {
                    // Get the name of the class
                    className = file.getName();
                    // Remove the file extension
                    className = className.substring(0, className.lastIndexOf('.'));
                    System.out.println("[MODLOADER] Generated Class Name: " + className);
                }
                // Else
                else {
                    // Grab directly from the TB
                    className = classTB.getText();
                }
                // Load it
                Class cls = cl.loadClass(className);
                Method method = cls.getDeclaredMethod(methodTB.getText());
                Object instance = cls.newInstance();
                Object result = method.invoke(instance);
            } catch (MalformedURLException ex) {
                log.append("ERROR: Malformed URL" + newline + "Please make an error report on GitHub" + newline);
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                log.append("ERROR: Class Not Found" + newline);
                if (classCB.isSelected()) {
                    log.append("If the class name is not the same as the file name, deselect \"Class Name = File Name\" in the settings and type the class name in the text box next to it." + newline);
                }
                else {
                    log.append("The class name specified is incorrect. Either change it or select \"Class Name = File Name\" to use the file name instead." + newline);
                }
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                log.append("ERROR: Illegal Access" + newline + "Try restarting KAaNE as an Administrator" + newline);
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                log.append("ERROR: Class cannot be instantiated" + newline + "Please make an error report on the mod" + newline);
                ex.printStackTrace();
            } catch (NoSuchMethodException ex) {
                log.append("ERROR: Method is not correct" + newline);
                if (methodCB.isSelected()) {
                    log.append("If the method name is not 'module', deselect \"Default Method Name (module)\" in the settings and type the method name in the text box next to it." + newline);
                }
                else {
                    log.append("The method name specified is incorrect. Either change it or select \"Default Method Name (module)\" to use the default name instead." + newline);
                }
                ex.printStackTrace();
            } catch (InvocationTargetException ex) {
                log.append("ERROR: InvocationTargetException" + newline + "Please make an error report on GitHub and on the mod" + newline);
                ex.printStackTrace();
            }
        });
        // Settings
        settings.addActionListener((ActionEvent e) -> {
            // If the settings are already open, mark it closed.
            if (settingsOpen == false) settingsOpen = true;
            else settingsOpen = false;
            // If the settings aren't open, resize the window to show them.
            if (settingsOpen == true) f.setSize(400,400);
            // If they are, return the window to its original state.
            else f.setSize(400,200);
        });
        // Method CB
        methodCB.addActionListener((ActionEvent e) -> {
           // If it's selected
           if (methodCB.isSelected()) {
               // Disable the TB
               methodTB.setEditable(false);
               // Revert back to original text
               methodTB.setText("module");
           }
           // If it isn't
           else {
                // Enable the TB
               methodTB.setEditable(true);
           }
        });
        // Class CB
        classCB.addActionListener((ActionEvent e) -> {
            // If it's selected
            if (classCB.isSelected()) {
                // Disable the TB
                classTB.setEditable(false);
                // Revert back to original text
                classTB.setText("");
            }
            // If it isn't
            else {
                // Enable the TB
                classTB.setEditable(true);
            }
        });
    }
}
