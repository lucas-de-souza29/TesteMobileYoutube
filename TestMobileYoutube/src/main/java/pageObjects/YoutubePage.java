package pageObjects;


import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class YoutubePage {
	
	public YoutubePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Pesquisar\"]")
    private MobileElement btnPesquisar;
	
    @AndroidFindBy(id = "com.google.android.youtube:id/search_edit_text")
    private MobileElement campoPesquisa;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Expandir mini player']"
    		+ "/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup")
    private MobileElement resultado;
    
    //Métodos
    public void pesquisarAssunto() {	
    	btnPesquisar.click();
    }
    
    public void informarConteudo(String msg) {
    	campoPesquisa.sendKeys(msg + "\\n");    	
    }
    
    public void resultadoPesquisa() {
    	System.out.println("Pesquisa realizada com sucesso!");
    	resultado.click();
    }

}
