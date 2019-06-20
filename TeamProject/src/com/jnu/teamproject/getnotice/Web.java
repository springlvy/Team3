package com.jnu.teamproject.getnotice;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class Web extends JPanel {
	
	private JPanel webBrowserPanel;    
    
    private JWebBrowser webBrowser;    
    
    private String url; 

	/**
	 * Create the panel.
	 */
    public Web(String url) {    
        super(new BorderLayout());    
        this.url = url;    
        webBrowserPanel = new JPanel(new BorderLayout());    
        webBrowser = new JWebBrowser();    
        webBrowser.navigate(url);    
        webBrowser.setButtonBarVisible(false);    
        webBrowser.setMenuBarVisible(false);    
        webBrowser.setBarsVisible(false);    
        webBrowser.setStatusBarVisible(false);    
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);    
        add(webBrowserPanel, BorderLayout.CENTER);         
    }    

}
