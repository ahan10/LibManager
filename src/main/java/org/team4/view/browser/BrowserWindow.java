package org.team4.view.browser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

public class BrowserWindow extends JFrame {
    public BrowserWindow(String url){
        setSize(1200,850);
        JScrollPane sp=new JScrollPane();
        JTextPane tp=new JTextPane();
        tp.setEditable(false);
        URL myurl = null;
        try {
            myurl=new URL(url);
        } catch (MalformedURLException ex) {ex.printStackTrace();}
        sp.setViewportView(tp);
        add(sp);
        try {
            tp.setPage(myurl);
        } catch (IOException ex) {ex.printStackTrace();}
    }

}
