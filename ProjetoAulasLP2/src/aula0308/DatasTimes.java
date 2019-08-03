package aula0308;

import java.time.Duration;
import java.time.Instant;

public class DatasTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instant inicio = Instant.now();
			
		try {
			Thread.sleep(1000);//fazer o processador esperar
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Instant fim = Instant.now();
		
		
		Duration duracao = Duration.between(inicio, fim);
		
		System.out.println("Dura��o em nano segundos" + duracao.toNanos());
		System.out.println("Dura��o em nano minutos" + duracao.toMinutes());
		System.out.println("Dura��o em horas" + duracao.toHours());
		System.out.println("Dura��o em milisegundos" + duracao.toMillis());
		System.out.println("Dura��o em dias" + duracao.toDays());
		
	}

}
