package com.softtek.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class EjerciciosJavaTime {
    public static void main(String[] args) {
        //Declarar la fecha de inicio del curso y le sumamos 10 dias
        LocalDate fInicioCurso = LocalDate.of(2024,4,3);
        System.out.println(fInicioCurso.plusDays(10));

        //Declarar la fecha de hoy con la zona horaria por defecto
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        //Declarar la fecha de hoy con a zona horaria de "Australia/Sydney"
        ZonedDateTime hoyAus = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(hoyAus);

        //Cual es la fecha del dia 100 de 2024
        LocalDate dia100 = LocalDate.ofYearDay(2024,100);
        System.out.println(dia100);

        //Definir una fecha para navidad y otra para nochevieja y compararlas con los metodos isBefore isAfter
        LocalDate nacidad = LocalDate.of(2024,12,24);
        LocalDate nochevieja = LocalDate.of(2024,12,31);
        System.out.println("Navidad antes que nochevieja : "+nacidad.isBefore(nochevieja));
        System.out.println("Navidad despues que nochevieja : "+nacidad.isAfter(nochevieja));

        //Calcular la fecha resultante sumando 35 semanas al 15 de marzo de 2024
        LocalDate marzo15 = LocalDate.of(2024,3,15);
        System.out.println(marzo15.plusWeeks(35));

        //Calcula los años trabajados en una empresa de un empleado que inició a trabajar el 6 de Julio de 2012
        LocalDate inicioT = LocalDate.of(2012,7,6);
        System.out.println(ChronoUnit.YEARS.between(inicioT,LocalDate.now()));

        //Calcula la edad de una persona que nacio el 7 de agoto de 2007
        LocalDate nacimiento = LocalDate.of(2007,8,7);
        System.out.println(ChronoUnit.YEARS.between(nacimiento,LocalDate.now()));

        //Calcula la fecha en la que se tiene que entregar un proyecto si su duracion es 200 dias y se tiene que entregar el 2 de octubre
        LocalDate fFin = LocalDate.of(2024,10,2);
        System.out.println(fFin.minus(200,ChronoUnit.DAYS));

        //Si un proyecto inicia el 15 de marzo y termina el 20 de octubre cúal es su periodo
        LocalDate finicioP = LocalDate.of(2024,3,15);
        LocalDate fFinP = LocalDate.of(2024,10,20);

        Period period = Period.between(finicioP, fFinP);
        System.out.println("Años : " + period.getYears() + "-- Meses : " + period.getMonths() + "--  Dias: " + period.getDays());
    }
}
