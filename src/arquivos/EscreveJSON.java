package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("854466521");
		usuario1.setLogin("2021casa");
		usuario1.setSenha("159357");
		usuario1.setNome("Wagner Andrade");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("00447756558");
		usuario2.setLogin("florbela");
		usuario2.setSenha("456456");
		usuario2.setNome("João Andrade");

		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		/*FileWriter escreve_no_arquivo = new FileWriter(arquivo, Charset.forName("UTF-8"))*/
		FileWriter fileWriter = new FileWriter("D:\\Documentos\\Projetos programação\\ws-eclipse\\curso_programacao\\src\\arquivos\\filejson.json");
		
		
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
	}

}
