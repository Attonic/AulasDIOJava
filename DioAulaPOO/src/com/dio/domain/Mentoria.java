package com.dio.domain;

import java.time.LocalDateTime;

public class Mentoria extends ConteudoEducaional {

    private LocalDateTime data;

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }


}
