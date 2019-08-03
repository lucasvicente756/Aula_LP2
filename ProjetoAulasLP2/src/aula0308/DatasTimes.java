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
		
		System.out.println("Duração em nano segundos" + duracao.toNanos());
		System.out.println("Duração em nano minutos" + duracao.toMinutes());
		System.out.println("Duração em horas" + duracao.toHours());
		System.out.println("Duração em milisegundos" + duracao.toMillis());
		System.out.println("Duração em dias" + duracao.toDays());
		
	}

}
