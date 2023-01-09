package com.ftm.odemearaci;

import com.ftm.domain.Odeme;
import com.ftm.fatura.Fatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("kartlaOdeme")
public class KartlaOdeme implements OdemeAraci {
    //field injection
//    @Autowired
//    @Qualifier("musteriFatura")
//    private Fatura fatura;

    //setter injection

    private Fatura fatura;
    @Autowired
    @Qualifier("saticiFatura")
    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }


    //constructor injection

//    private  Fatura fatura;
//    @Autowired
//    public KartlaOdeme( @Qualifier("musteriFatura") Fatura fatura) {
//        this.fatura = fatura;
//    }

    @Override
    public void odemeyap(Odeme odeme) {
        System.out.println("Kart ile odemeniz gerceklestirilmistir : "+odeme.getOdeme());
        fatura.faturaOlustur(odeme);
    }
}
