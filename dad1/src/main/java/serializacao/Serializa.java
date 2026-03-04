package serializacao;

import model.Cidade;
import model.Estado;

import java.io.*;

public class Serializa {

    public static void main(String[] args)  {

        Estado estado = new Estado();
        estado.setNome("Amazonas");
        estado.setSigla("AM");

        Cidade cidade = new Cidade();
        cidade.setNome("Manaus");
        cidade.setEstado(estado);

        try {

            FileOutputStream saida = new FileOutputStream("cidade.dat");
            ObjectOutputStream serializador = new ObjectOutputStream(saida);

            serializador.writeObject(cidade);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Objeto Serializado!");


    }

}
