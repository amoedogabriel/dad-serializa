package serializacao;

import model.Cidade;
import model.Estado;

import java.io.*;

public class SerializadorUtil {

    public void serializa(Object objeto,String arquivo) throws IOException{

            FileOutputStream saida = new FileOutputStream(arquivo);
            ObjectOutputStream serializador = new ObjectOutputStream(saida);
            serializador.writeObject(objeto);

    }

//    Estado estado = (Estado) serializador.desserializa("estado.dat");

    public Object desserializa(String arquivo) throws IOException,ClassNotFoundException{

        FileInputStream entrada = new FileInputStream(arquivo);
        ObjectInputStream desserializador = new ObjectInputStream(entrada);

        return desserializador.readObject();
    }


}
