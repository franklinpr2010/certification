package br.certification.alura.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataExample {
	public static void main(String[] args) {
		LocalDate mesQueVem = LocalDate.now().plusMonths(1);
		
		LocalDate mespassado = LocalDate.now().minusMonths(1);
		
		System.out.println(mespassado);
		
		System.out.println(mesQueVem);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		LocalDateTime hojeAoMeioDia = LocalDate.now().atTime(12,0);
		
		System.out.println(hojeAoMeioDia);
		
		LocalTime agora2 = LocalTime.now();
		LocalDate hoje = LocalDate.now();
		LocalDateTime dataEhora = hoje.atTime(agora2);
		
		LocalDate date = LocalDate.of(2014, 12, 25);
		LocalDateTime dateTime = LocalDateTime.of(2014, 12, 25, 10, 30);
		
		//Modificar o ano de um local date
		LocalDate dataDoPassado = LocalDate.now().withYear(1988);
		
		LocalDate hoje2 = LocalDate.now();
		LocalDate amanha = LocalDate.now().plusDays(1);
		System.out.println(hoje2.isBefore(amanha));
		System.out.println(hoje2.isAfter(amanha));
		System.out.println(hoje2.isEqual(amanha));
		
		
		ZonedDateTime tokyo = ZonedDateTime.of(2011, 5, 2, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo"));
		ZonedDateTime saoPaulo = ZonedDateTime.of(2011, 5, 2, 10, 30, 0, 0, ZoneId.of("America/Sao_Paulo"));
	    System.out.println(tokyo.isEqual(saoPaulo));
	    
	    
	    System.out.println(LocalDate.of(2014, 12, 25));
	    System.out.println(LocalDate.of(2014, Month.DECEMBER, 25));
	    
	    
		
		

	}
}
