package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.YoutubePage;
import static utils.Utils.*;

public class YoutubeSteps {
	
	YoutubePage ytPage = new YoutubePage(driver);

	@Dado("que o usuario clique para pesquisar")
	public void queOUsuarioCliqueParaPesquisar() {
		ytPage.pesquisarAssunto();
	}

	@Dado("informe o conteudo {string}")
	public void informeOConteudo(String msg) {
		ytPage.informarConteudo(msg + "\\n");
	}

	@Entao("o aplicativo apresenta o resultado da pesquisa")
	public void oAplicativoApresentaOResultadoDaPesquisa() {
		ytPage.resultadoPesquisa();
	}

}
