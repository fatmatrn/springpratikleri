package com.ftm.fatura;

import com.ftm.domain.Odeme;
import org.springframework.stereotype.Component;

@Component("musteriFatura")
public class MusteriFatura implements Fatura{
    @Override
    public void faturaOlustur(Odeme odeme) {
        System.out.println("Musteri icin fatura olusturuldu :"+odeme.getOdeme());
    }
}
