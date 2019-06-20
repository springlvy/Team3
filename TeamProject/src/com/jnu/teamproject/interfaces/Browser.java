package com.jnu.teamproject.interfaces;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
 
public class Browser extends JPanel {  
  
    private static final long serialVersionUID = 1L;  
  
    private JPanel webBrowserPanel;  
  
    private JWebBrowser webBrowser;  
  
     private String url;  
  
    public Browser(String url) {  
        super(new FlowLayout());  
        this.url = url;  
        webBrowserPanel = new JPanel(new GridLayout(0, 1));  
        webBrowser = new JWebBrowser();  
        webBrowser.navigate(url);  
        webBrowser.setButtonBarVisible(false);  
        webBrowser.setMenuBarVisible(false);  
        webBrowser.setBarsVisible(false);  
        webBrowser.setStatusBarVisible(false);  
        webBrowser.setPreferredSize(new Dimension(1000, 700));
        webBrowserPanel.add(webBrowser);//, BorderLayout.CENTER  
        add(webBrowserPanel);//, BorderLayout.CENTER  
        //webBrowser.executeJavascript("javascrpit:window.location.href='http://bbs.jnlts.com/'");  
    }  
}