package com.ftm.odemearaci;

import com.ftm.domain.Odeme;
import org.springframework.stereotype.Component;

@Component("transferleOdeme")
public class TransferleOdeme implements OdemeAraci{
    @Override
    public void odemeyap(Odeme odeme) {
        System.out.println("Transfer ile odemeniz gerceklestirilmistir : "+odeme.getOdeme());
    }
}
