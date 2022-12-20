package com.example.mongodbtutorial;

import com.example.mongodbtutorial.Car.model.Car;
import com.example.mongodbtutorial.Car.model.Result.model.Result;
import com.example.mongodbtutorial.Car.model.Result.repository.ResultRepository;
import com.example.mongodbtutorial.Car.repository.CarRepository;
import com.example.mongodbtutorial.Driver.model.Driver;
import com.example.mongodbtutorial.Driver.repository.DriverRepository;
import com.example.mongodbtutorial.Season.model.Season;
import com.example.mongodbtutorial.Season.repository.SeasonRepository;
import com.example.mongodbtutorial.Team.model.Team;
import com.example.mongodbtutorial.Team.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MongoDbTutorialApplication implements CommandLineRunner {

    @Autowired
    private SeasonRepository seasonRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private ResultRepository resultRepository;

    public static void main(String[] args) {
        SpringApplication.run(MongoDbTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Driver lewis = driverRepository.save(new Driver("Lewis", "Hamilton"));
        Driver max = driverRepository.save(new Driver("Max", "Verstappen"));
        Driver fernando = driverRepository.save(new Driver("Fernando", "Alonso"));
        Driver charles = driverRepository.save(new Driver("Charles", "LeClerc"));

        Car merc0 = new Car(1025, "Mercedes-AMG F1 W11 EQ Performance");
        Car merc1 = new Car(1050, "Mercedes W12");
        Car merc2 = new Car(1070, "Mercedes W13");

        Car rb0 = new Car(900, "Red Bull Racing RB16");
        Car rb1 = new Car(740, "Red Bull Racing RB18");

        Car ferrari0 = new Car(-1, "Ferrari SF1000");
        Car ferrari1 = new Car(-1, "Ferrari SF21");
        Car ferrari2 = new Car(-1, "Ferrari 065/6");

        Car renault0 = new Car(950, "Alpine A521");
        Car renault1 = new Car(950, "Alpine A522");

        carRepository.saveAll(Arrays.asList(merc0, merc1, merc2, rb0, rb1, ferrari0, ferrari1, ferrari2, renault0, renault1));

        Team alpine = new Team("BWT Alpine F1 Team", Arrays.asList(renault0, renault1));
        Team ferrari = new Team("Scuderia Ferrari", Arrays.asList(ferrari0, ferrari1, ferrari2));
        Team redbull = new Team("Red Bull Racing", Arrays.asList(rb0, rb1));
        Team mercedes = new Team("Mercedes-AMG Petronas F1 Team", Arrays.asList(merc0, merc1, merc2));

        teamRepository.saveAll(Arrays.asList(alpine, ferrari, redbull, mercedes));

        Result ferrari2020 = new Result(ferrari, charles, 98, 8);
        Result redbull2020 = new Result(redbull, max, 214, 3);
        Result mercedes2020 = new Result(mercedes, lewis, 347, 1);

        Result alpine2021 = new Result(alpine, fernando, 81, 10);
        Result ferrari2021 = new Result(ferrari, charles, 159, 7);
        Result redbull2021 = new Result(redbull, max, 396, 1);
        Result mercedes2021 = new Result(mercedes, lewis, 387, 2);

        Result alpine2022 = new Result(alpine, fernando, 92, 9);
        Result ferrari2022 = new Result(ferrari, charles, 308, 2);
        Result redbull2022 = new Result(redbull, max, 454, 1);
        Result mercedes2022 = new Result(mercedes, lewis, 240, 6);

        resultRepository.saveAll(Arrays.asList(
                ferrari2020, redbull2020, mercedes2020,
                alpine2021, ferrari2021, redbull2021, mercedes2021,
                alpine2022, ferrari2022, redbull2022, mercedes2022));

        Season season2020 = new Season(2020L, Arrays.asList(ferrari2020, redbull2020, mercedes2020));
        Season season2021 = new Season(2021L, Arrays.asList(alpine2021, ferrari2021, redbull2021, mercedes2021));
        Season season2022 = new Season(2022L, Arrays.asList(alpine2022, ferrari2022, redbull2022, mercedes2022));

        seasonRepository.saveAll(Arrays.asList(season2020, season2021, season2022));
    }
}
