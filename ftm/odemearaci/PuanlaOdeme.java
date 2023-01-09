package com.ftm.odemearaci;

import com.ftm.domain.Odeme;
import org.springframework.stereotype.Component;

@Component("puanlaOdeme")
public class PuanlaOdeme implements OdemeAraci{
    @Override
    public void odemeyap(Odeme odeme) {
        System.out.println("Puan ile odemeniz gerceklestirilmistir : "+odeme.getOdeme());
    }
}
