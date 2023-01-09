package com.ftm.app;

import com.ftm.AppConfiguration;
import com.ftm.domain.Odeme;
import com.ftm.odemearaci.KartlaOdeme;
import com.ftm.odemearaci.OdemeAraci;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        Odeme odeme = new Odeme();
        odeme.setOdeme("1000tl");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        //OdemeAraci secOdeme = context.getBean(OdemeAraci.class);

        OdemeAraci secOdeme = context.getBean("kartlaOdeme", OdemeAraci.class);
        OdemeAraci secOdeme2 = context.getBean("kartlaOdeme", OdemeAraci.class);

        if (secOdeme2==secOdeme){
            System.out.println("******");
        }


       secOdeme.odemeyap(odeme);

       context.close();
    }
}
