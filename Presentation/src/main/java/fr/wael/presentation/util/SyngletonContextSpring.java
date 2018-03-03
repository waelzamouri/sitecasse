/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author wael
 */
public class SyngletonContextSpring {
    
    private SyngletonContextSpring(){
        
    }
    private static ApplicationContext INSTANCE  = null;
    
    public static ApplicationContext getInstance(){
        if (INSTANCE == null)
		{ 	INSTANCE = new ClassPathXmlApplicationContext(new String[] {"spring-mail-context.xml"});	
		}
		return INSTANCE;
    }
}
