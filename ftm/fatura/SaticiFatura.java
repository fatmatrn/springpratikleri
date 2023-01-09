package com.ftm.fatura;

import com.ftm.domain.Odeme;
import org.springframework.stereotype.Component;

@Component("saticiFatura")
public class SaticiFatura implements Fatura{
    @Override
    public void faturaOlustur(Odeme odeme) {
        System.out.println("Satici icin fatura olusturuldu :"+odeme.getOdeme());
    }
}
