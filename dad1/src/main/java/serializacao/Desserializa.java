package serializacao;

import model.Cidade;

import java.io.*;

public class Desserializa {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream entrada = new FileInputStream("cidade.dat");
        ObjectInputStream desserializador = new ObjectInputStream(entrada);

        Cidade cidade = (Cidade) desserializador.readObject();
        System.out.println(cidade.getNome());
        System.out.println(cidade.getEstado());


    }
}
