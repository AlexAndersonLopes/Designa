package br.com.alexlopes.designacoes.util.whats;

import br.com.alexlopes.designacoes.util.Janela;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
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


    private static boolean verificarPaginaWebAberta() {
        try {
            Set<String> windowHandles = driver.getWindowHandles();

            if (!windowHandles.isEmpty()) {
                // Já existem janelas abertas, verificar se a janela está minimizada
                for (String handle : windowHandles) {
                    driver.switchTo().window(handle);
                    if (driver.manage().window().getPosition().getX() == -32000) {
                        // A posição -32000 indica que a janela está minimizada
                        driver.manage().window().maximize();
                        break;
                    }
                }
                return true;
            }

            driver.manage().window().maximize();
            WebElement searchBar = driver.findElement(By.xpath("//div[@contenteditable='true']"));
            searchBar.click();
            // Se não ocorreu uma exceção, então a barra de pesquisa está presente, indicando que a página está aberta
            return true;
        } catch (Exception e) {
            // Se ocorreu uma exceção, a barra de pesquisa não foi encontrada, indicando que a página não está aberta
            driver = null;
            return false;
        }
    }

    public static void conectar() {
        if (!verificarPaginaWebAberta()) {
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

    public void enviarMensagemUsuario(BufferedImage imag) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        BufferedImage imagem = imag;
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
            WebElement attachButton = wait.until(ExpectedConditions.elementToBeClickable(attachButtonLocator));
            attachButton.click();

            // Selecionar a opção de envio de imagem
            By imageOptionLocator = By.xpath("//input[@accept='image/*,video/mp4,video/3gpp,video/quicktime']");
            WebElement imageOption = wait.until(ExpectedConditions.presenceOfElementLocated(imageOptionLocator));

            // Salvar a imagem em um arquivo temporário para carregar no input do WebDriver
            File tempImageFile = File.createTempFile("tempImage", ".jpg");
            ImageIO.write(imagem, "jpg", tempImageFile);

            // Enviar o caminho do arquivo para o campo de input de imagem
            imageOption.sendKeys(tempImageFile.getAbsolutePath());

            // Aguardar o upload da imagem (pode ser necessário um tempo extra)
            Thread.sleep(5000); // Ajuste o tempo conforme necessário

            // Pressionar Enter após enviar o caminho do arquivo
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ENTER).build().perform();

            // Aguardar o envio da imagem
            Thread.sleep(5000); // Ajuste o tempo conforme necessário

            // Enviar uma quebra de linha
            WebElement messageBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='main']/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")));
            messageBox.sendKeys("\n");

        } catch (IOException | InterruptedException e) {
        }
    }

    public void enviarMensagem(String telefone, BufferedImage imagem) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            driver.get(driver.getCurrentUrl());

            // Localizar e preencher o campo de pesquisa
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true'][@data-tab='3']")));
            searchBox.sendKeys(telefone);
            searchBox.sendKeys(Keys.ENTER);

            // Clicar no ícone de anexo para abrir o menu de anexos
            By attachButtonLocator = By.xpath("//div[@title='Anexar']");
            WebElement attachButton = wait.until(ExpectedConditions.elementToBeClickable(attachButtonLocator));
            attachButton.click();

            // Selecionar a opção de envio de imagem
            By imageOptionLocator = By.xpath("//input[@accept='image/*,video/mp4,video/3gpp,video/quicktime']");
            WebElement imageOption = wait.until(ExpectedConditions.presenceOfElementLocated(imageOptionLocator));

            // Salvar a imagem em um arquivo temporário para carregar no input do WebDriver
            File tempImageFile = File.createTempFile("tempImage", ".jpg");
            ImageIO.write(imagem, "jpg", tempImageFile);

            // Enviar o caminho do arquivo para o campo de input de imagem
            imageOption.sendKeys(tempImageFile.getAbsolutePath());

            // Aguardar o upload da imagem (pode ser necessário um tempo extra)
            Thread.sleep(5000); // Ajuste o tempo conforme necessário

            // Pressionar Enter após enviar o caminho do arquivo
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ENTER).build().perform();

            // Aguardar o envio da imagem
            Thread.sleep(5000); // Ajuste o tempo conforme necessário

            // Enviar uma quebra de linha
            WebElement messageBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='main']/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")));
            messageBox.sendKeys("\n");
        } catch (IOException | InterruptedException e) {
            enviarMensagemUsuario(imagem);
        }
    }

}
