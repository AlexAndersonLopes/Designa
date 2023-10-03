package br.com.alexlopes.designacoes.util.whats;

import br.com.alexlopes.designacoes.util.Janela;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhatsApp {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void conectar() {
        if (driver == null) {
            // Configurar o driver do Chrome usando o WebDriverManager
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }
        // Verificar se a janela do WhatsApp já está aberta
        Set<String> windowHandles = driver.getWindowHandles();
        boolean whatsappWindowFound = false;

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().startsWith("https://web.whatsapp.com/")) {
                whatsappWindowFound = true;
                break;
            }
        }
        // Abrir o WhatsApp Web se a janela não foi encontrada
        if (!whatsappWindowFound) {
            driver.get("https://web.whatsapp.com/");
        }
    }

    public static void sair() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public boolean enviarMensagem(String telefone, BufferedImage imag) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            BufferedImage im = imag;

            driver.get(driver.getCurrentUrl());
            // Localizar e preencher o campo de pesquisa
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true'][@data-tab='3']")));
            searchBox.sendKeys(telefone);
            searchBox.sendKeys(Keys.ENTER);

            // Clicar no ícone de anexo para abrir o menu de anexos
            By attachButtonLocator = By.xpath("//div[@title='Anexar']");
            List<WebElement> attachButtons = driver.findElements(attachButtonLocator);
            if (attachButtons.isEmpty()) {
                enviarMensagemUsuario(imag);
            } else {
                // Reobtenção do elemento attachButton antes de interagir
                WebElement attachButton = wait.until(ExpectedConditions.elementToBeClickable(attachButtonLocator));
                attachButton.click();

                // Selecionar a opção de envio de imagem
                WebElement imageOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[1]/div[2]/div/span/div/ul/div/div[2]/li/div/input")));

                // Salvar a imagem em um arquivo temporário para carregar no input do WebDriver
                File tempImageFile = new File(System.getProperty("java.io.tmpdir"), "tempImage.jpg");
                ImageIO.write(im, "jpg", tempImageFile);

                // Enviar o caminho do arquivo para o campo de input de imagem
                imageOption.sendKeys(tempImageFile.getAbsolutePath());

                // Aguardar o upload da imagem (pode ser necessário um tempo extra)
                Thread.sleep(5000); // Ajuste o tempo conforme necessário

                // Pressionar Enter após enviar o caminho do arquivo
                Actions actions = new Actions(driver);
                actions.sendKeys(Keys.ENTER).build().perform();

                // Aguardar o envio da imagem
                Thread.sleep(5000); // Ajuste o tempo conforme necessário

                By messageBoxSelector = By.xpath("//*[@id='main']/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p");
                WebElement messageBox = wait.until(ExpectedConditions.presenceOfElementLocated(messageBoxSelector));
                messageBox.sendKeys("\n");
                return true;
            }
        } catch (IOException | InterruptedException e) {
            enviarMensagemUsuario(imag);
            return false;
        }
        return false;
    }

    public void enviarMensagemUsuario(BufferedImage imag) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        BufferedImage im = imag;
        String telefone = Janela.getUsuario().getCelular().replaceAll("[^0-9]", "");

        try {
            // Localizar e preencher o campo de pesquisa
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true'][@data-tab='3']")));
            for (int i = 0; i < telefone.length(); i++) {
                searchBox.sendKeys(Keys.BACK_SPACE);
            }
            searchBox.sendKeys(telefone);
            searchBox.sendKeys(Keys.ENTER);

            // Clicar no ícone de anexo para abrir o menu de anexos
            By attachButtonLocator = By.xpath("//div[@title='Anexar']");
            // Reobtenção do elemento attachButton antes de interagir
            WebElement attachButton = wait.until(ExpectedConditions.elementToBeClickable(attachButtonLocator));
            attachButton.click();

            // Selecionar a opção de envio de imagem
            WebElement imageOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[1]/div[2]/div/span/div/ul/div/div[2]/li/div/input")));

            // Salvar a imagem em um arquivo temporário para carregar no input do WebDriver
            File tempImageFile = new File(System.getProperty("java.io.tmpdir"), "tempImage.jpg");
            ImageIO.write(im, "jpg", tempImageFile);

            // Enviar o caminho do arquivo para o campo de input de imagem
            imageOption.sendKeys(tempImageFile.getAbsolutePath());

            // Aguardar o upload da imagem (pode ser necessário um tempo extra)
            Thread.sleep(5000); // Ajuste o tempo conforme necessário

            // Pressionar Enter após enviar o caminho do arquivo
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ENTER).build().perform();

            Thread.sleep(5000);

            By messageBoxSelector = By.xpath("//*[@id='main']/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p");
            WebElement messageBox = wait.until(ExpectedConditions.presenceOfElementLocated(messageBoxSelector));
            messageBox.sendKeys("\n");

        } catch (IOException | InterruptedException e) {
        }
    }

}
