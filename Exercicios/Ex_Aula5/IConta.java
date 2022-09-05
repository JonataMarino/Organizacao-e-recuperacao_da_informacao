import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public interface IConta{

    String getNumeroContaComTipo(int numeroConta, String descricao);

    int getNumeroDiasAberto(Date diaAbertura);

    void gerarLogTxt (String path);

    public static void leitor(String path) throws IOException {
            BufferedReader buffRead = new BufferedReader(new FileReader(path));
            String linha = "";
            while (true) {
                if (linha != null) {
                    System.out.println(linha);
                } else
                    break;
                linha = buffRead.readLine();
            }
            buffRead.close();
        }
    }


