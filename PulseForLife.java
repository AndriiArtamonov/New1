/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulseforlife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class PulseForLife {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Введите дату рождения");
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите день: ");
        int day = Integer.parseInt(is.readLine());
        System.out.print("Введите месяц: ");
        int month = Integer.parseInt(is.readLine());
        System.out.print("Введите год: ");
        int year = Integer.parseInt(is.readLine());
        System.out.print("Введите часы: ");
        int hoars = Integer.parseInt(is.readLine());
        System.out.print("Введите минуты: ");
        int minutes = Integer.parseInt(is.readLine());
        
        LocalDateTime date = LocalDateTime.now();
        date = date.minusYears(year);
        date = date.minusMonths(month);
        date = date.minusDays(day);
        date = date.minusHours(hoars);
        date = date.minusMinutes(minutes);
        System.out.println(date);
        System.out.println(date.getSecond());
    }
    }
