package com.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Marius on 2/12/2017.
 */
@Component
public class PrekeLoadData implements ApplicationListener<ContextRefreshedEvent>{

    private PrekeRepository prekeRepository;

    @Autowired
    public void setPrekeRepository(PrekeRepository prekeRepository) {
        this.prekeRepository = prekeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        String [] prekes= {"Duona","Telefonas","Sokoladas","Obuoliai","Vaistai","Batonas", "Kriauses","Slyvos","Saldainis","Telefonas","Sokoladas","Obuoliai","Vaistai","Sausainis", "Kriauses","Slyvos"};
        for (int i = 0; i < prekes.length ; i++) {
            prekeRepository.save(new Preke(""+prekes[i],""+(i)));
        }
    }
}
