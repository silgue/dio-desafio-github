package com.dio.bootcamp.gft.exercicios;

import java.util.Calendar;

public class Mensagens {

	public String saudacao() {

		String saudacao;

		if (Calendar.getInstance().getTime().getHours() < 12) {
			saudacao = "Bom dia";
		} else if (Calendar.getInstance().getTime().getHours() > 12
				&& Calendar.getInstance().getTime().getHours() < 18) {
			saudacao = "Boa tarde";
		} else {
			saudacao = "Boa noite";
		}

		return saudacao;
	}

}
