package com.ravi.assignment;

import java.time.Instant;

import com.ravi.assignment.domain.Place;
import com.ravi.assignment.domain.Timing;
import com.ravi.assignment.enums.Weekday;
import com.ravi.assignment.repository.PlaceRepository;
import com.ravi.assignment.repository.TimingRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(PlaceRepository placeRepository, TimingRepository timingRepository){
		return args -> {
			Place place=new Place("Le Café du Marché","Rue de Conthey 17, 1950 Sion");

			placeRepository.save(place);
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T15:00:00Z"),Weekday.TUESDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T00:00:00Z"),Weekday.TUESDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T15:00:00Z"),Weekday.WEDNESDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T00:00:00Z"),Weekday.WEDNESDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T15:00:00Z"),Weekday.THURSDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T00:00:00Z"),Weekday.THURSDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T15:00:00Z"),Weekday.FRIDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T00:00:00Z"),Weekday.FRIDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:00:00Z"),Instant.parse("1970-01-01T00:00:00Z"),Weekday.SATURDAY,place));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T15:00:00Z"),Weekday.SUNDAY,place));


			Place place2=new Place("Casa Ferlin","Stampfenbachstrasse 38, 8006 Zürich");
			placeRepository.save(place2);

			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T14:00:00Z"),Weekday.MONDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T22:00:00Z"),Weekday.MONDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T14:00:00Z"),Weekday.TUESDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T22:00:00Z"),Weekday.TUESDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T14:00:00Z"),Weekday.WEDNESDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T22:00:00Z"),Weekday.WEDNESDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T14:00:00Z"),Weekday.THURSDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T22:00:00Z"),Weekday.THURSDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T11:30:00Z"),Instant.parse("1970-01-01T14:00:00Z"),Weekday.FRIDAY,place2));
			timingRepository.save(new Timing(Instant.parse("1970-01-01T18:30:00Z"),Instant.parse("1970-01-01T22:00:00Z"),Weekday.FRIDAY,place2));

		};
	}
}
