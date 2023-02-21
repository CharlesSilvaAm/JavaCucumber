package suport;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumberTest {
        public static void waitElementBePresent(By element, int time){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        public String getRandomEmail(){
            String email_init = "Stand";
            String email_final = "@gmail.com";

            Random random = new Random();
            int minimo = 1;
            int maximo = 9999999;
            int resultado = random.nextInt(maximo-minimo) + minimo;

            return email_init + resultado + email_final;
        }
    }

