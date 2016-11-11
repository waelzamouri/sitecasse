/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.mail;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author wael
 */
public class MainEnvoieMail {

    public static void main(String[] args) {
        //sping context déplacé dans présentation
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-mail-context.xml"});
        EnvoieMail em = (EnvoieMail) context.getBean("envoieMail");
        //em.envoyer();
    }
}
